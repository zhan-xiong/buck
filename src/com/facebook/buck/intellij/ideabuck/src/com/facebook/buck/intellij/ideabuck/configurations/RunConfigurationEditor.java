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

package com.facebook.buck.intellij.ideabuck.configurations;

import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.options.SettingsEditor;
import com.intellij.ui.components.JBLabel;
import com.intellij.ui.components.JBTextField;
import com.intellij.util.ui.JBUI;
import java.awt.*;
import javax.swing.*;
import org.jetbrains.annotations.NotNull;

public class RunConfigurationEditor extends SettingsEditor<BuckRunConfiguration> {
  private final JBTextField mTarget;
  private final JBTextField mAdditionalParams;
  private final JPanel root;

  public RunConfigurationEditor() {
    root = new JPanel(new GridBagLayout());
    final JBLabel targetLabel = new JBLabel();
    targetLabel.setText("Target");
    mTarget = new JBTextField();
    mTarget.getEmptyText().setText("Leave empty to run all tests");

    final JBLabel additionalParamsLabel = new JBLabel();
    additionalParamsLabel.setText("Additional params");
    mAdditionalParams = new JBTextField();
    mAdditionalParams.getEmptyText().setText("May be empty");

    final GridBagConstraints constraints =
        new GridBagConstraints(
            0,
            0,
            1,
            1,
            0,
            0,
            GridBagConstraints.WEST,
            GridBagConstraints.NONE,
            JBUI.emptyInsets(),
            0,
            0);
    constraints.insets = JBUI.insetsRight(8);
    root.add(targetLabel, constraints);
    constraints.gridx = 1;
    constraints.gridy = 0;
    constraints.weightx = 1;
    constraints.fill = GridBagConstraints.HORIZONTAL;
    root.add(mTarget, constraints);

    constraints.gridx = 0;
    constraints.gridy = 2;
    constraints.weightx = 0;
    constraints.fill = GridBagConstraints.NONE;
    root.add(additionalParamsLabel, constraints);

    constraints.gridx = 1;
    constraints.gridy = 2;
    constraints.weightx = 1;
    constraints.fill = GridBagConstraints.HORIZONTAL;
    root.add(mAdditionalParams, constraints);
  }

  @Override
  protected void resetEditorFrom(@NotNull BuckRunConfiguration runConfiguration) {
    mTarget.setText(runConfiguration.data.target);
    mAdditionalParams.setText(runConfiguration.data.additionalParams);
  }

  @Override
  protected void applyEditorTo(@NotNull BuckRunConfiguration runConfiguration)
      throws ConfigurationException {
    runConfiguration.data.target = mTarget.getText().trim();
    runConfiguration.data.additionalParams = mAdditionalParams.getText().trim();
  }

  @NotNull
  @Override
  protected JComponent createEditor() {
    return root;
  }
}
