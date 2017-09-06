/*
 * Copyright 2015-present Facebook, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package com.facebook.buck.ide.intellij.lang.java;

import com.facebook.buck.ide.intellij.BaseIjModuleRule;
import com.facebook.buck.ide.intellij.ModuleBuildContext;
import com.facebook.buck.ide.intellij.aggregation.AggregationContext;
import com.facebook.buck.ide.intellij.aggregation.AggregationKeys;
import com.facebook.buck.ide.intellij.model.IjModuleFactoryResolver;
import com.facebook.buck.ide.intellij.model.IjModuleType;
import com.facebook.buck.ide.intellij.model.IjProjectConfig;
import com.facebook.buck.ide.intellij.model.folders.IjResourceFolderType;
import com.facebook.buck.io.MorePaths;
import com.facebook.buck.io.ProjectFilesystem;
import com.facebook.buck.jvm.core.JavaPackageFinder;
import com.facebook.buck.jvm.java.JavaLibraryDescription;
import com.facebook.buck.rules.Description;
import com.facebook.buck.rules.PathSourcePath;
import com.facebook.buck.rules.SourcePath;
import com.facebook.buck.rules.TargetNode;
import com.facebook.buck.util.MoreCollectors;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSortedSet;
import java.nio.file.Path;
import java.util.Optional;
import java.util.function.Function;

public class JavaLibraryModuleRule extends BaseIjModuleRule<JavaLibraryDescription.CoreArg> {

  public JavaLibraryModuleRule(
      ProjectFilesystem projectFilesystem,
      IjModuleFactoryResolver moduleFactoryResolver,
      IjProjectConfig projectConfig) {
    super(projectFilesystem, moduleFactoryResolver, projectConfig);
  }

  @Override
  public Class<? extends Description<?>> getDescriptionClass() {
    return JavaLibraryDescription.class;
  }

  @Override
  public void apply(
      TargetNode<JavaLibraryDescription.CoreArg, ?> target, ModuleBuildContext context) {
    Optional<Path> presetResourcesRoot = target.getConstructorArg().getResourcesRoot();
    ImmutableSortedSet<SourcePath> resources = target.getConstructorArg().getResources();
    ImmutableSet<Path> resourcePaths;
    if (presetResourcesRoot.isPresent()) {
      resourcePaths = getResourcePaths(presetResourcesRoot.get(), resources);
      addResourceFolders(
          IjResourceFolderType.JAVA_RESOURCE, resourcePaths, presetResourcesRoot.get(), context);
    } else {
      resourcePaths =
          resources
              .stream()
              .filter(PathSourcePath.class::isInstance)
              .map(PathSourcePath.class::cast)
              .map(PathSourcePath::getRelativePath)
              .collect(MoreCollectors.toImmutableSet());
      ImmutableMultimap<Path, Path> resourcesRootsToResources =
          getResourcesRootsToResources(resourcePaths);
      for (Path resourcesRoot : resourcesRootsToResources.keySet()) {
        addResourceFolders(
            IjResourceFolderType.JAVA_RESOURCE,
            resourcesRootsToResources.get(resourcesRoot),
            resourcesRoot,
            context);
      }
    }

    addDepsAndSources(target, true /* wantsPackagePrefix */, context, resourcePaths);
    JavaLibraryRuleHelper.addCompiledShadowIfNeeded(projectConfig, target, context);
    context.setJavaLanguageLevel(JavaLibraryRuleHelper.getLanguageLevel(projectConfig, target));
    context.setCompilerOutputPath(moduleFactoryResolver.getCompilerOutputPath(target));
  }

  private ImmutableMultimap<Path, Path> getResourcesRootsToResources(
      ImmutableSet<Path> resourcePaths) {
    final JavaPackageFinder packageFinder =
        projectConfig.getJavaBuckConfig().createDefaultJavaPackageFinder();
    return resourcePaths
        .stream()
        .collect(
            MoreCollectors.toImmutableMultimap(
                path ->
                    MorePaths.stripCommonSuffix(
                            path.getParent(), packageFinder.findJavaPackageFolder(path))
                        .getFirst(),
                Function.identity()));
  }

  @Override
  public IjModuleType detectModuleType(TargetNode<JavaLibraryDescription.CoreArg, ?> targetNode) {
    return IjModuleType.JAVA_MODULE;
  }

  @Override
  public void applyDuringAggregation(
      AggregationContext context, TargetNode<JavaLibraryDescription.CoreArg, ?> targetNode) {
    super.applyDuringAggregation(context, targetNode);

    Optional<String> languageLevel =
        JavaLibraryRuleHelper.getLanguageLevel(projectConfig, targetNode);
    if (languageLevel.isPresent()) {
      context.addAggregationKey(AggregationKeys.JAVA_LANGUAGE_LEVEL, languageLevel);
    }
  }
}
