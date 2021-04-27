# google-java-format Eclipse Plugin

## Enabling

google-java-format Eclipse plugin can be downloaded from the [releases page](https://github.com/ae42/google-java-format-eclipse-plugin/releases). Drop it into the Eclipse
[drop-ins folder](https://help.eclipse.org/2021-03/index.jsp?topic=%2Forg.eclipse.platform.doc.isv%2Freference%2Fmisc%2Fp2_dropins_format.html) to activate the plugin.

If the plugin is not recognized correctly, it may help to start Eclipse using the `--clean` option.

The plugin adds a `google-java-format` formatter implementation that can be configured in `Window > Preferences > Java > Code Style > Formatter > Formatter Implementation`.

Additionally, the plugin provides two options to control the formatting behavior.

1. **Organize imports**  
	When selected, the plugin rearranges the imports. It is recommended to add a [Save Action](https://help.eclipse.org/2021-03/index.jsp?topic=%2Forg.eclipse.platform.doc.isv%2Freference%2Fmisc%2Fp2_dropins_format.html) so that the code will be formatted automatically when saving. Make sure, that the `Organize imports` option is unchecked. You should also make sure that there is no project-specific configuration.  
		
2. **Remove unused imports**  
	When selected, the plugin also removes unused imports.

## Development
The plugin can either be built directly with [Eclipse Tycho](https://projects.eclipse.org/projects/technology.tycho) or exported from the Eclipse plugin project. Both approaches were tested with Linux only. Please make sure that a JDK 11 is installed and configured in the environment variable JAVA_HOME.

### Using Tycho
1. Check environment variable `JAVA_HOME` to see if it references at least a JDK11.
2. Run `mvn install` in the base directory. 

The plugin is created and placed in the `eclipse_plugin/target` directory.

### Using Eclipse
1. Open the `eclipse_plugin` project in a recent Eclipse SDK build. It was tested with Eclipse Version 2021-03 (4.19.0).
2. From `File > Export` select `Plugin-in Development > Deployable plugin-ins and fragments` and follow the wizard to export a plugin jar.
