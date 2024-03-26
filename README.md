### This is a library management system project.

### Tech stack:
  - Spring Boot
  - Spring Data Jpa
  - H2 Database
  - Thymeleaf
  - Bootstrap4

### Requirements

For building and running the application you need:
- [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) or newer
- [Maven 3](https://maven.apache.org)
- [Lombok](https://projectlombok.org)

### Build & Run 

```
  mvn clean install && mvn --projects backend spring-boot:run
  
Jenkins: Executive shell
  mvn clean install
  java-jar ./*.jar
```
  
### Port
```
Then go to http://127.0.0.1:8081 in your browser
Then go to http://EC2_IP:8081 in your browser
```


###To run the program in local server  by using the Docker use the following command
```
docker build -t LibMgmt_img:latest .
docker run -it --name LibMgmt -p 8081:8081 LibMgmt_img:latest
`````


###To Build the AWS Pipline use the following Steps

