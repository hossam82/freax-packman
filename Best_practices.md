# Introduction #

This wiki page describes some coding best practices to use when coding FPM.


# Details #

There is a Constants class located in it.freax.fpm.util, under the fpm-util java project.
This class consists of a set of constants used in various scenarios for the FPM project. There are values for the standard paths for some critical filenames (like the fpm.conf) and for some tokens used to parse specific files during the fpm processes.

To invoke a Constants class you should get the default instance doing the following:
```
Constants c = Constants.getOne(clazz);
// use the constants class...
```

There are two main methods to access the constants class: getOne(Class<?>) and getOneReset(Class<?>).
The meanng is well explained:
As getOne method will get the Constants class with any possible changes on its values because of the singleton it has in, getOneReset invalidates the singleton on every use and reloads the configuration files every time it is called.
**Generally is preferable to call getOneReset only when it is strictly necessary to revert some bad changes that prevent fpm to work as expected.**
You should note that the Class instance is very important because a ClassLoader will be called from this instance in order to search the configuration files in the right place. Obviously if the files are on disk this instance value becomes less important or not important at all.

Another BP is the use of the Log system built in fpm, and powered by log4j.
To create a Logger class is quite simple as a single call to a static method.
The snippet line to create a Logger instance to use in your class is below:
```
private final Logger log = LogConfigurator.getOne(this.getClass()).configure(true);
```

This snippet code reads from the configuration file (or from its built in default configuration) and configures a log4j.Logger class to use in your code.
Same thing works in this case with the Class<?> instance used as well as the Constants class (that it calls however) to search in the right place for the configuration files.

A tip from the team can be to search in util package before write your own needed service code, maybe you can find some methods that can work for your case, the util library has become very useful and grows very fast in the project!