# sbweb-base
simple web-base on top of springboot
* Ref: [Spring Initializr](https://start.spring.io/)
* Support REST API under: AppContext/rest/*: done  
  * Support Swagger: AppContext/swagger-ui/*: done
* Support SOAP API under: AppContext/soap/*: todo
* Support Web pages under: AppContext/web/*: todo

## UnitTest
* Run SbwebBaseApplicationTests.main()
* See demo available under:
  localhost:8090/hvdangApp/swagger-ui/

## How to use?
* Use release sbweb-base-1.0.1.jar as your base dependency in Java projects
* Rebuild maven:package with profile "standalone-build"
  * Then run executable JAR (on top of springboot) for demo
  * Try result at: localhost:8090/hvdangApp/swagger-ui/
