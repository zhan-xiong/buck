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

package com.facebook.buck.intellij.ideabuck.fixup;

import com.intellij.facet.Facet;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.roots.ContentEntry;
import com.intellij.openapi.roots.ModifiableRootModel;
import com.intellij.openapi.roots.ModuleRootManager;
import com.intellij.openapi.vfs.LocalFileSystem;
import com.intellij.openapi.vfs.VfsUtilCore;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.openapi.vfs.newvfs.events.VFileCreateEvent;

class HandlePackageCreation implements FileCreateHandler {

  @Override
  public void onFileCreate(VFileCreateEvent event, Facet facet) {
    String newFile = event.getPath();
    Module module = facet.getModule();
    ModifiableRootModel rootModel = ModuleRootManager.getInstance(module).getModifiableModel();
    VirtualFile virtualFile = LocalFileSystem.getInstance().refreshAndFindFileByPath(newFile);
    ContentEntry contentEntry = getContentRootFor(virtualFile, rootModel);
    if (contentEntry != null) {
      contentEntry.addSourceFolder(virtualFile.getUrl(), false);
      rootModel.commit();
    } else {
      ErrorDialog.showErrorDialog(
          module.getProject(),
          "Can't find Content Root",
          "Can't find Content Root for %s",
          virtualFile);
    }
  }

  private static ContentEntry getContentRootFor(VirtualFile url, ModifiableRootModel rootModel) {
    for (ContentEntry entry : rootModel.getContentEntries()) {
      if (VfsUtilCore.isEqualOrAncestor(entry.getUrl(), url.getUrl())) {
        return entry;
      }
    }
    return null;
  }
}
