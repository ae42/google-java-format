package org.eclipse.googlejavaformat;

import org.eclipse.core.commands.operations.OperationStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

public class PluginActivator extends AbstractUIPlugin {

  public static final String PLUGIN_ID = "google-java-format-eclipse-plugin";

  private static PluginActivator plugin;

  public PluginActivator() {}

  @Override
  public void start(BundleContext context) throws Exception {
    super.start(context);
    plugin = this;
  }

  @Override
  public void stop(BundleContext context) throws Exception {
    plugin = null;
    super.stop(context);
  }

  public static PluginActivator getDefault() {
    return plugin;
  }

  /**
   * Displays the specified error in the ErrorLog-view.
   *
   * @param throwable
   */
  public static void logError(Throwable throwable) {
    log(Status.ERROR, "An error occurred while formatting the source code", throwable);
  }
  /**
   * Displays the specified message in the ErrorLog-view.
   *
   * @param message
   */
  public static void logInfo(String message) {
    log(Status.INFO, message, null);
  }

  private static void log(int status, String message, Throwable throwable) {
    getDefault()
        .getLog()
        .log(new OperationStatus(status, PluginActivator.PLUGIN_ID, Status.OK, message, throwable));
  }
}
