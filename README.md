# Kafka Microservices Example with Spring Boot

This repository demonstrates a simple implementation of a messaging system using Apache Kafka and Spring Boot. It comprises two microservices:

## Producer Microservice

This microservice produces messages and sends them to a Kafka topic.

### Technologies Used:
- Spring Boot
- Apache Kafka

### Instructions:
1. Configure Kafka broker settings in `application.yaml`.
2. Run the application.
3. Access endpoints to produce messages.

### Endpoints:
- `/produce`: Endpoint to produce messages.

## Consumer Microservice

This microservice consumes messages from the Kafka topic.

### Technologies Used:
- Spring Boot
- Apache Kafka

### Instructions:
1. Configure Kafka broker settings in `application.yaml`.
2. Run the application.
3. Consumers will automatically start consuming messages.
