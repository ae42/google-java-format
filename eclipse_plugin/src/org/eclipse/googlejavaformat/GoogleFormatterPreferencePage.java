package org.eclipse.googlejavaformat;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class GoogleFormatterPreferencePage extends FieldEditorPreferencePage
    implements IWorkbenchPreferencePage {

  public GoogleFormatterPreferencePage() {
    super(GRID);
    setPreferenceStore(GoogleFormatterActivator.getDefault().getPreferenceStore());
    setDescription(
        "\nThis plugin uses the Google Formatter version "
            + PreferenceConstants.GOOGLE_FORMATTER_VERSION
            + ".\n");
  }

  public void createFieldEditors() {

    BooleanFieldEditor organizeImportsfield =
        new BooleanFieldEditor(
            PreferenceConstants.P_ORGANIZE_IMPORTS,
            "&Organize imports (Google Formatter function 'ImportOrderer.reorderImports' is used)",
            getFieldEditorParent());
    addField(organizeImportsfield);

    BooleanFieldEditor removeUnusedImports =
        new BooleanFieldEditor(
            PreferenceConstants.P_REMOVE_UNUSED_IMPORTS,
            "&Remove unused imports (Google Formatter function 'RemoveUnusedImports.removeUnusedImports' is used)",
            getFieldEditorParent());
    addField(removeUnusedImports);
  }

  public void init(IWorkbench workbench) {}
}
