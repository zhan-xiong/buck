/*
 * Copyright 2017-present Facebook, Inc.
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

package com.facebook.buck.ide.intellij.model.folders;

import com.google.common.collect.ImmutableSortedSet;
import java.nio.file.Path;
import javax.annotation.Nullable;

public class JavaTestResourceFolder extends ResourceFolder {
  public JavaTestResourceFolder(
      Path path, ImmutableSortedSet<Path> inputs, @Nullable Path resourcesRoot) {
    super(path, inputs, resourcesRoot);
  }

  @Override
  protected IJFolderFactory getFactory() {
    return getFactoryWithResourcesRoot(resourcesRoot);
  }

  public static IJFolderFactory getFactoryWithResourcesRoot(@Nullable Path resourcesRoot) {
    return ((path, wantsPrefix, inputs) -> new JavaTestResourceFolder(path, inputs, resourcesRoot));
  }

  public static ResourceFolderFactory getResourceFactory() {
    return ((path, resourcesRoot, inputs) -> new JavaResourceFolder(path, inputs, resourcesRoot));
  }
}
