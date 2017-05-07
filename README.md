# spring-microservice-hackathon
[![Build Status](https://travis-ci.org/peterszatmary/spring-microservice-hackathon.svg?branch=master)](https://travis-ci.org/peterszatmary/spring-microservice-hackathon)

Project about how to build microservices with spring ecosystem.

## Used Spring modules / technologies
- **spring cloud config server** : for holding all configuration files for all microservices.
## Microservice application architecture with communication

- **[user-microservice](https://github.com/peterszatmary/spring-microservice-hackathon/blob/master/user-microservice/README.md)** : simple microservice with any external communication. Communicates just at the beginning with configuration-server microservice to obtain configs.
- **[config-server](https://github.com/peterszatmary/spring-microservice-hackathon/tree/master/configuration-server/README.md)** : holds all configs for all microservices in all spring profiles.
- **[parser-microservice](https://github.com/peterszatmary/spring-microservice-hackathon/blob/master/parser-microservice/README.md)** : very simple spark microservice example.

## TODO and NOTES
- missing something like lagom:runAll for run all microservices at one
- parser-microservice needs apache spark have to be downloaded manually and spark.home have to be set.
Download page : http://spark.apache.org/releases/spark-release-2-1-0.html

