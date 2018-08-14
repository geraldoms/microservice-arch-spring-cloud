# Microservice Arch Spring Cloud

This is a basic example of a microservice architecture using Spring Cloud.
It has five modules:

* [Config-server](https://github.com/geraldoms/microservice-arch-spring-cloud/tree/master/config-server): 
 This module contains the config service to provide and centralize the configuration for the services.

* [Discovery-server](https://github.com/geraldoms/microservice-arch-spring-cloud/tree/master/discovery-server): 
This module contains a discovery service implemented using Netflix Eureka to enable services to find each other.

* [Gateway-server](https://github.com/geraldoms/microservice-arch-spring-cloud/tree/master/gateway-server): 
This module contains the gateway service implemented using Netflix Zuul that acts as a reverse proxy.

* [Book-app](https://github.com/geraldoms/microservice-arch-spring-cloud/tree/master/book-app):
This module contains the book service with a simple API to access book information.

* [Rating-app](https://github.com/geraldoms/microservice-arch-spring-cloud/tree/master/rating-app):
This module contains the rating service with a simple API to access the book rating.

The order to run the services, in this example, matters. To simplify this task we used the docker-compose.

## Requirements
* JDK 8 or later
* Redis 4.0+
* Maven 3.2+
* Docker 18+
* Docker-compose 1.2+

## Installation 
`$ mvn package`

## Usage 

...

## Request samples 

...
