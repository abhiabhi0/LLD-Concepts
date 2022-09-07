# Instructions to run java program using maven in Linux

### How do I make my first Maven project?

`mvn -B archetype:generate -DgroupId=com.mycompany.app -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4`

### How do I compile my application sources?

`mvn compile`

### How do I create a JAR and install it in my local repository?

`mvn package`

`mvn install`

### Run program 

`mvn compile exec:java -Dexec.mainClass=mypackage.classnamehavingmain`

Here

`mvn compile exec:java -Dexec.mainClass=com.programmercave.javaconcepts.App`