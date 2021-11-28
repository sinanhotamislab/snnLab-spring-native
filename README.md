## snnLab Project - Spring Native Experimental with Spring Data MongoDB

* This Command Line Runner  app is implemented by experimenting Spring Native with Spring Data MongoDB.
* On installation process, MongoDB is created with ready db,collection, and data.


## Installation

* /installation directory, docker-compose and mongo-init.js is ready.
* Users can execute "docker-compose up" command and observe initial db/collection/data by using MongoDB Compass tool.

## Build And Execution

* Running on Docker is easier than local machine. However, accessing to local MongoDB is hard in case of host networking configuration. I don't want to waste time for this process. 

* To be generated Docker image from source code;
  ./mvnw spring-boot:build-image
  
* To be containerized Docker image;
  docker run spring-native-experimental:0.0.1-SNAPSHOT
  

## Important Notes

* To be native packaged process, should be increased memory size on pom.xml 									<BP_NATIVE_IMAGE_BUILD_ARGUMENTS>-J-Xmx4096m</BP_NATIVE_IMAGE_BUILD_ARGUMENTS>
  <BP_NATIVE_IMAGE_BUILD_ARGUMENTS>-J-Xmx4096m</BP_NATIVE_IMAGE_BUILD_ARGUMENTS>
  
* During the native compilation, you will see a lot of WARNING: Could not register
  reflection metadata messages. They are expected and will be removed in a future
  version, see #502 for more details.
  
## JVM Performance

* JIT Compiler with JVM : 1.3 -> 2.0 seconds.
* AOT Compiler with GraalVM 0.2 -> 0.3 seconds.

## References

https://docs.spring.io/spring-native/docs/current/reference/htmlsingle









