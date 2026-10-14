# BC Java - Assignment 09 - RESTful API

<!-- TOC -->

* [BC Java - Assignment 09 - RESTful API](#bc-java---assignment-09---restful-api)
    * [Requirements](#requirements)
        * [Question 1: API Hello World (Onboarding task)](#question-1-api-hello-world-onboarding-task)
        * [Question 2: Service Greeting (Dependency Injection)](#question-2-service-greeting-dependency-injection)
    * [Prerequisites](#prerequisites)
        * [Project Structure](#project-structure)
        * [Environment](#environment)
    * [Author](#author)

<!-- TOC -->

## Requirements

### Question 1: API Hello World (Onboarding task)

- Problem:
    - Team muốn kiểm tra môi trường của bạn.
    - Hãy xây dựng một REST API: `GET /hello` → trả về `"Hello Spring Boot!"`
- Solution: [HelloController](src/main/java/com/cybersoft/restfulapi/controller/HelloController.java)
- URL: <http:localhost:8080/hello>

### Question 2: Service Greeting (Dependency Injection)

- Problem:
    - Product Owner muốn một API chào người dùng.
    - Tạo GreetingService với method `sayHello(String name)`.
    - API GET `/greet?name=Alice` → trả về `Hello Alice!`.
- Solution:
    - [GreetingController](src/main/java/com/cybersoft/restfulapi/controller/GreetingController.java)
    - [GreetingService](src/main/java/com/cybersoft/restfulapi/service/GreetingService.java)
- URL: <http:localhost:8080/greet?name=Alice>

## Prerequisites

### Project Structure

### Environment

- IDE: IntelliJ
- Java 21

## Author

Khang Nguyen
