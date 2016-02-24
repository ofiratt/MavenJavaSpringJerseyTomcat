# MavenJavaSpringJerseyTomcat

Please read first some good rest guide like 

1. Check that you have maven: **mvn --version**
  1. Download maven if needed- https://maven.apache.org/download.cgi (the binary one)
  2. Unzip it
  3. Put it in you Environment Variable for example: C:\apache-maven-3.3.9\bin
2. Java 7 or above on your PC
3. Eclipse or other environment to write your code at

1. Run **mvn clean install** to compile your code
2. Run **mvn eclipse:eclipse** in order to see the project at eclipse and run it again when you change your project hierarchy or adding new libraries  to the pom.xml file
3. Run tomcat server **mvn clean install tomcat7:run**
  * See your host will be at http://localhost:9090
  * Try to run http://127.0.0.1:9090/getText And http://127.0.0.1:9090/getText?name=ofir
