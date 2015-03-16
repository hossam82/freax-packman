# Introduction #

We mainly develop FPM in eclipse, you can develop it in any manner you want, even with vi! :-)
Just to summarize, the main development environment is linux with eclipse and openjdk 1.6.

# Details #

In detail, my personal development environment is:
  * openSUSE 11.4 64 bit
  * java version "1.6.0\_20"
> > OpenJDK Runtime Environment (IcedTea6 1.9.7) (suse-1.2.1-x86\_64)<br>
<blockquote>OpenJDK 64-Bit Server VM (build 19.0-b09, mixed mode)<br>
</blockquote><ul><li>Eclipse Helios 64 bit<br>
</li><li>for now the project needs these libraries (there are also stored in the svn):<br>
<ol><li>jakarta-commons-compress-1.1<br>
</li><li>jakarta-commons-io-1.3.2<br>
</li><li>log4j-1.2.15<br>
</li><li>jdom-1.1.1<br>
</li></ol></li></ul><blockquote>In the future we will update this page on every new JAR we will including in the fpm project. Soon we will have to import also runcc, no info about the version, because we plan to use it as the ebnf parsing engine.</blockquote>

Now once you have the required software for the setup you can start your brand new version of eclipse and import your copy of the project, as described in the project page for source code download.<br>
<br>
There are some required plugins for eclipse, that you want to know for fully interoperate with this project's members, that are listed below:<br>
<ul><li>Subclipse<br>
</li><li>EclEmma<br>
</li><li>Code Metrics (State of Flow plugin)