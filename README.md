# spring-microservice-hackathon #

[![Build Status](https://travis-ci.org/peterszatmary/spring-microservice-hackathon.svg?branch=master)](https://travis-ci.org/peterszatmary/spring-microservice-hackathon)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/1de3dcd6720b46dfa1025dd1911813c3)](https://www.codacy.com/app/peterszatmary/spring-microservice-hackathon?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=peterszatmary/spring-microservice-hackathon&amp;utm_campaign=Badge_Grade)

Project about how to build microservices with spring ecosystem.

## Used Spring modules / technologies ##

-   **spring cloud config server** : for holding all configuration files for all microservices.

## Microservice application architecture with communication ##

-   **[user-microservice](https://github.com/peterszatmary/spring-microservice-hackathon/blob/master/user-microservice/README.md)** : simple microservice with any external communication. Communicates just at the beginning with configuration-server microservice to obtain configs.
-   **[config-server](https://github.com/peterszatmary/spring-microservice-hackathon/tree/master/configuration-server/README.md)** : holds all configs for all microservices in all spring profiles.
-   **[parser-microservice](https://github.com/peterszatmary/spring-microservice-hackathon/blob/master/parser-microservice/README.md)** : very simple spark microservice example.
-   **[ui-microservice](https://github.com/peterszatmary/spring-microservice-hackathon/blob/master/ui-microservice/README.md)** : ui frontend simple microservice.

## TODO and NOTES ##

-   missing something like lagom:runAll for run all microservices at one
-   parser-microservice needs apache spark have to be downloaded manually and spark.home have to be set. Download page : http://spark.apache.org/releases/spark-release-2-1-0.html
-   ui-microservice is here just one. Think about microservices. You can give to one team one or more microservices. Microservice  is really separate so team can develop it independently. ui-microservice is for simplicity just one. Aditional communication beetwen  teams can / must occur here. This is not exactly what microservice design should be. See Conways law. Here have to ui team communicate with all teams that developing microservices and vice versa.