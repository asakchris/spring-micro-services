### Microservice Architecture using Spring Boot
#### Eureka - Service Discovery
Run the main class in `discovery` module to start Eureka server
```
http://localhost:8761
```
#### Zuul - API Gateway
Run the main class in `gateway` module to start Zuul
#### Welcome Service
Run the main class in `welcome` module to start Welcome Service, any number instance can be run
```
http://localhost:8790/welcome/message
```
#### Random Service
Run the main class in `random` module to start Random Service, any number instance can be run
```
http://localhost:8790/random/number
```
#### Spring Boot Admin
Run the main class in `admin` module to start Spring Boot Admin
```
http://localhost:8080
```