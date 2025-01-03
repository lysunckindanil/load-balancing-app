Configuring:

- Eureka Netflix Client/Server

- API Gateway

- Load Balancing

- Cloud Config Client/Server through GitHub

- Zipkin Docker

Observation

- there are 2 copies of a main-service

- test-service requests main-service through API Gateway

- test-service prints the instance-id of main-service which responded the request

- so there is seen in the end that main-service is load balanced, because they respond one by one, not only one


