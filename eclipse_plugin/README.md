# google-java-format Eclipse Plugin

This subproject packages the google formatter into an Eclipse plugin. 

Additionally, the plugin provides two options to control the formatting behavior.

1. **Organize imports**  
	When selected, the plugin reorders the imports by using google-java-format. It is recommended to add a [Save Action](https://help.eclipse.org/2021-03/index.jsp?topic=%2Forg.eclipse.platform.doc.isv%2Freference%2Fmisc%2Fp2_dropins_format.html) so that the code will be formatted automatically when saving. Make sure, that the `Organize imports` option is unchecked.
2. **Remove unused imports**  
	When selected, the plugin also removes unused imports.

## Enabling

google-java-format Eclipse plugin can be downloaded from the [releases](https://github.com/ae42/google-java-format-eclipse-plugin/releases) page. [Drop it](https://help.eclipse.org/2021-03/index.jsp?topic=%2Forg.eclipse.platform.doc.isv%2Freference%2Fmisc%2Fp2_dropins_format.html) into the Eclipse drop-ins folder to activate the plugin.

The plugin adds a `google-java-format` formatter implementation that can be configured in `Window > Preferences > Java > Code Style > Formatter > Formatter Implementation`.

If the plugin is not recognized correctly, it may help to
1. switch to default Eclipse formatter in preferences 
2. close Eclipse
3. delete `google-java-format-eclipse-plugin-x.x.x.jar` from dropins folder
4. start Eclipse using the `--clean` option
5. close Eclipse again
6. drop `google-java-format-eclipse-plugin-x.x.x.jar` into dropins folder
7. start Eclipse using the `--clean` option

## Development
The plugin can either be built directly with [Eclipse Tycho](https://projects.eclipse.org/projects/technology.tycho) or exported from the Eclipse plugin project. Both approaches were tested with Linux only. 

Before you can open the plugin project within Eclipse or build the plugin with Tycho, the necessary libraries must be copied.

### Copy dependencies

Make sure [Apache Maven](https://maven.apache.org/download.cgi) is installed and the binary can run

```
$ mvn -version
```

Make sure that at least a JDK 11 (e.g. [AdoptOpenJDK](https://adoptopenjdk.net/)) is installed and configured in the environment variable `JAVA_HOME`.

```
$ echo $JAVA_HOME
```

From the **base directory** execute

```
$ mvn clean install
```

to build current google-java-formatter and copy the libraries to the Eclipse subproject. 

### Building plugin using Tycho

After copying the necessary libraries, execute from the **base directory**

```
$ cd ./eclipse_project
$ mvn clean install
```
The created plugin `google-java-format-eclipse-plugin-x.x.x.jar` is placed in the `eclipse_plugin/target` directory.

### Building plugin using Eclipse
As an alternative to building with Tycho, the plugin can be exported directly from the Eclipse Plugin Project.. Open the `eclipse_plugin` project in a recent Eclipse SDK build. From `File > Export` select `Plugin-in Development > Deployable plugin-ins and fragments` and follow the wizard to export a plugin jar.

This was tested with Eclipse Version 2021-03 (4.19.0).
