# google-java-format 1.7 Eclipse Plugin

## Enabling

See https://github.com/google/google-java-format#eclipse

## Development

Please note: This branch was forked from 1.8 development but the version of the Eclipse plugin is 1.7.1 and uses the currently stable Google Formatter 1.7.

1) Uncomment `<module>eclipse_plugin</module>` in the parent `pom.xml`

2) Run `mvn install` in the base directory, which will copy the dependences of the plugin to
`eclipse_plugin/lib`. Additionally google-java-format-1.7.jar is already added to the lib-folder.

2) If you are using Java 9, add

    ```
    -vm
    /Library/Java/JavaVirtualMachines/jdk1.8.0_91.jdk/Contents/Home/bin/java
    ```

    to `/Applications/Eclipse.app/Contents/Eclipse/eclipse.ini`.

3) Open the `eclipse_plugin` project in a recent Eclipse SDK build. It was tested with Eclipse Version 2019-09 R (4.13.0).

4) From `File > Export` select `Plugin-in Development > Deployable plugin-ins and fragments` and follow the wizard to export a plugin jar or just run `mvn install` in the eclipse_plugin directory.
