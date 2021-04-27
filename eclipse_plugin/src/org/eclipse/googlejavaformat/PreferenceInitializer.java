package org.eclipse.googlejavaformat;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/** Class used to initialize default preference values. */
public class PreferenceInitializer extends AbstractPreferenceInitializer {

  public void initializeDefaultPreferences() {
    IPreferenceStore store = GoogleFormatterActivator.getDefault().getPreferenceStore();
    store.setDefault(PreferenceConstants.P_ORGANIZE_IMPORTS, true);
    store.setDefault(PreferenceConstants.P_REMOVE_UNUSED_IMPORTS, true);
  }
}
