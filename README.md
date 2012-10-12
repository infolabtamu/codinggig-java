codinggig-java
==============

Java sample code for Coding Gig. It parses a user.json file and prints the
reputation of the user with the highest reputation.

You will need to add json-simple to your CLASSPATH. If you're working from a
unix-like command line, the following code should work:

    export CLASSPATH=".:json-simple-1.1.1.jar"
    javac BestRep.java
    java BestRep

## Acknowledgments

The sample data is from http://photo.stackexchange.com/ , and is shared under
the [cc-wiki](http://creativecommons.org/licenses/by-sa/3.0/) license.

[Json Simple](http://code.google.com/p/json-simple/) is used under the Apache
License 2.0.
