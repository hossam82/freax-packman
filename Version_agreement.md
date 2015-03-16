# Introduction #

To fully secure immediately the concept of the version string, I want to jot down an outline of what I think should be the string version of the FPM project.
Let's start by saying that a project is very young, just born, and yet there is no road map, which of course makes it very immature. I can say that with the road map will be releasing the first alpha version, meanwhile, say that you can set the version consists of 4 numbers in the form Xyzzzz, where obviously the first and second digits are the major and minor versions, the third is the svn version.
Explain: the third version number is just the svn release, the number assigned to the current checkin at the time of build.

# Details #
In example for the version 1.2.3 the parts, and their rules are:

  * **Major version**, is the [1](1.md) part of the _[1](1.md).2.3_ and there are no special rules with this number, it is only a number!
  * **Minor version**, is the [2](2.md) part of the _1.[2](2.md).3_ and it can be in the form [2](2.md) or in the form [02](02.md) alike.
  * **Checkin version**, is the [3](3.md) part of the _1.2.[3](3.md)_ and it can be in the form [3](3.md) or in the form [0003](0003.md) as well as other intermediate forms such as [003](003.md) or [03](03.md), alike.