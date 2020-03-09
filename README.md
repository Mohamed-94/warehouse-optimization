# Warehouse Optimization

<p align="center">
  <a href="#about">About</a> •
  <a href="#usage & prerequisities">Usage & Prerequisities</a> •
  <a href="#install dependencies">Install Dependencies</a> •
  <a href="#run">Run</a> •
  <a href="#api">API/a> •
  <a href="#license">License</a>
</p>

##About
This project is a Spring application for a Supply Chain warehouse optimization and management.
Warehouse Optimization is a REST API based and designed with M ~V~ C of spring boot's starter.
-Views are not done yet .
 
To get you started you can simply clone the `warehouse-optimization` repository and install the dependencies(You can quickly look at pom.xml)


## Usage & Prerequisites

To clone and edit this application you will need [git](https://git-scm.com/) and [SpringBoot](https://projects.spring.io/spring-boot/)

You will also need [Java™ SE Development Kit 8](http://www.oracle.com/technetwork/java/javase/downloads) and [Maven](https://maven.apache.org/download.cgi).

-IDE used:[STS4](https://spring.io/tools)/Eclipse EE with [STS](https://spring.io/tools) plugin


Clone the `warehouse-optimization` repository using git:

```bash
git clone https://github.com/Mohamed94/warehouse-optimization
# Go into it
cd warehouse-optimization

```

### Install Dependencies

In order to install the dependencies and generate the Uber jar you must run:

```bash
mvn clean install
```

### Run
 
```bash

java -jar target/warehouse-optimization-1.0.jar
```

## API

Considering the REST API you will find the swagger UI at http://localhost:8080/swagger-ui.html

First generate a token with the following command:

```bash
curl testjwtclientid:XY7kmzoNzl100@localhost:8080/oauth/token -d grant_type=password -d username=user -d password=jwtpass
```

##Licence

Apache 2.0

> GitHub [@Mohamed-94](https://github.com/Mohamed-94) &nbsp;&middot;&nbsp;
