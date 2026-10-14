# BC Java - Assignment 09 - RESTful API

<!-- TOC -->

* [BC Java - Assignment 09 - RESTful API](#bc-java---assignment-09---restful-api)
    * [Requirements](#requirements)
        * [Question 1: API Hello World (Onboarding task)](#question-1-api-hello-world-onboarding-task)
        * [Question 2: Service Greeting (Dependency Injection)](#question-2-service-greeting-dependency-injection)
        * [Question 3: API Máy tính đơn giản (Calculator)](#question-3-api-máy-tính-đơn-giản-calculator)
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

### Question 3: API Máy tính đơn giản (Calculator)

- Problem:
    - Khách hàng muốn một service tính toán online.
        - GET `/calc/add?x=10&y=5` → `15`
        - GET `/calc/subtract?x=10&y=5` → `5`
        - GET `/calc/multiply?x=10&y=5` → `50`
        - GET `/calc/divide?x=10&y=5` → `2`
- Solution:
    - [CalculatorController](src/main/java/com/cybersoft/restfulapi/controller/CalculatorController.java)
    - [CalculatorService](src/main/java/com/cybersoft/restfulapi/service/CalculatorService.java)
    - [OperatorCalculation](src/main/java/com/cybersoft/restfulapi/app/OperatorCalculation.java): Define operation
      calculator enum
    - [StringToOperationTypeCalculator](src/main/java/com/cybersoft/restfulapi/utils/StringToOperationTypeCalculator.java):
      Convert string (path) to enum
- URL:
    - Add: <http:localhost:8080/calc/add?x=10&y=5>
    - Subtract: <http:localhost:8080/calc/subtract?x=10&y=5>
    - Multiply: <http:localhost:8080/calc/multiply?x=10&y=5>
    - Divide: <http:localhost:8080/calc/divide?x=10&y=5>

## Prerequisites

### Project Structure

### Environment

- IDE: IntelliJ
- Java 21

## Author

Khang Nguyen
