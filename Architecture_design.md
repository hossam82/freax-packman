# Introduction #

The fpm architecture design is quite simple as a great design, as well as a little tricky when the game goes on real life in the code structure.

Mainly in a Eclipse way there are 4 projects, that I will list here below:
  * fpm-compiler
> > It is a project for a (not yet written, but structured) compiler that will be available just when I finish my Compilers Design works on some books, and I hope this will happens in the release 2.0 of fpm system.

  * fpm-util
> > It is a project where all the utilities I've written since now are placed. Any developer can feel free to add classes or add code to existent classes when a useful method used in any code you will write can be generalized and used widely in the entire system.

  * fpm-test
> > It is a project where you can put all of your test code, including main classes and unit tests, all of your code for testing purpose anything it is. In the entire architecture the testing code will go there so any other testing code found in any other package than this will be moved here. One single exception there is for the fpm-compiler project (not used now, and this is the reason).

  * fpm-core
> > Last but not least the core package of the fpm system. It is really the heart of the system and it has the classes to do nearly all the stuff that fpm needs to work well and bring the packages from the start to the end of the workflow. Its classes are used for all the freax purposes and are divided (unless util and test) into design structure (interfaces and abstract classes) and implementations. I'll talk later of these as it is the entire argument of this wiki page.


# Details #

Let's start from the core project of FPM.
This project should have almost all the classes (and the structure of ancestor classes) needed to solve the problems in software management such as software data retrieving, dependency solving, compilation, installation, system stability maintenance across software modification.

Here is a class diagram of what we have now (automatically updated from svn, here is the path: ${our\_svn}/trunk/fpm-core/object-diagrams/Core Lib.PNG).
http://freax-packman.googlecode.com/svn/trunk/fpm-core/object-diagrams/Core%20Lib.PNG