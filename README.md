# Warehouse Optimization
<br>

<p align="center">
  <a href="#about">About</a> 
<br>
  <a href="#usage-&-prerequisities">Usage & Prerequisities</a> 
  <br>
  <a href="#install-dependencies">Install Dependencies</a> 
  <br>
  <a href="#run">Run</a> 
  <br>
  <a href="#api">API</a> 
    <br>
  <a href="#license">License</a>
</p>
<br>
  
## About
  
This project is a Spring application for a Supply Chain warehouse optimization and management.

Warehouse Optimization is a REST API based and designed with M ~V~ C of spring boot's starter.
 
*Note: Views are not done yet .
  
To get you started you can simply clone the `warehouse-optimization` repository and install the dependencies ( You can quickly look at [pom.xml](https://github.com/Mohamed94/warehouse-optimization/pom.xml))


## Usage & Prerequisites

To clone and edit this application you will need [git](https://git-scm.com/) and [Spring Boot](https://projects.spring.io/spring-boot/)

You will also need [Java™ SE Development Kit 8](http://www.oracle.com/technetwork/java/javase/downloads) and [Maven](https://maven.apache.org/download.cgi).
<br>

IDEs used: [STS4](https://spring.io/tools)/[Eclipse EE](https://www.eclipse.org/downloads/packages/release/kepler/sr2/eclipse-ide-java-ee-developers) with [STS](https://spring.io/tools) plugin


Clone the `warehouse-optimization` repository using git:

```bash
git clone https://github.com/Mohamed-94/warehouse-optimization
# Go into it
cd warehouse-optimization

```

## Install Dependencies

In order to install the dependencies and generate the Uber jar you must run:

```bash
mvn clean install
```

### Run
 
```bash

java -jar target/warehouse-optimization-1.0.jar
```

### API
<br>

Considering the REST API you will find the swagger UI at http://localhost:8080/swagger-ui.html

First generate a token with the following command:

```bash
curl testjwtclientid:XY7kmzoNzl100@localhost:8080/oauth/token -d grant_type=password -d username=user -d password=jwtpass
```
<br>

## Licence

Apache 2.0
<br>
<br>

> GitHub [@Mohamed-94](https://github.com/Mohamed-94) &nbsp;&middot;&nbsp;
