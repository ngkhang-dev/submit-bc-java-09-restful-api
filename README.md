# BC Java - Assignment 09 - RESTful API

<!-- TOC -->

* [BC Java - Assignment 09 - RESTful API](#bc-java---assignment-09---restful-api)
    * [Requirements](#requirements)
        * [Question 1: API Hello World (Onboarding task)](#question-1-api-hello-world-onboarding-task)
        * [Question 2: Service Greeting (Dependency Injection)](#question-2-service-greeting-dependency-injection)
        * [Question 3: API Máy tính đơn giản (Calculator)](#question-3-api-máy-tính-đơn-giản-calculator)
        * [Question 4: Quản lý sản phẩm (Product CRUD – In-Memory)](#question-4-quản-lý-sản-phẩm-product-crud--in-memory)
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
- Solution: [Full source: Question 1](src/main/java/com/cybersoft/restfulapi/question1)
    - [HelloController](src/main/java/com/cybersoft/restfulapi/question1/HelloController.java)
- URL: <http:localhost:8080/hello>

### Question 2: Service Greeting (Dependency Injection)

- Problem:
    - Product Owner muốn một API chào người dùng.
    - Tạo GreetingService với method `sayHello(String name)`.
    - API GET `/greet?name=Alice` → trả về `Hello Alice!`.
- Solution: [Full source: Question 2](src/main/java/com/cybersoft/restfulapi/question2)
    - [GreetingController](src/main/java/com/cybersoft/restfulapi/question2/controller/GreetingController.java)
    - [GreetingService](src/main/java/com/cybersoft/restfulapi/question2/service/GreetingService.java)
- URL: <http:localhost:8080/greet?name=Alice>

### Question 3: API Máy tính đơn giản (Calculator)

- Problem:
    - Khách hàng muốn một service tính toán online.
        - GET `/calc/add?x=10&y=5` → `15`
        - GET `/calc/subtract?x=10&y=5` → `5`
        - GET `/calc/multiply?x=10&y=5` → `50`
        - GET `/calc/divide?x=10&y=5` → `2`
- Solution: [Full source: Question 3](src/main/java/com/cybersoft/restfulapi/question3)
    - [CalculatorController](src/main/java/com/cybersoft/restfulapi/question3/controller/CalculatorController.java)
    - [CalculatorService](src/main/java/com/cybersoft/restfulapi/question3/service/CalculatorService.java)
    - [OperatorCalculation](src/main/java/com/cybersoft/restfulapi/question3/OperatorCalculation.java): Define operation
      calculator enum
    - [StringToOperationTypeCalculator](src/main/java/com/cybersoft/restfulapi/question3/StringToOperationTypeCalculator.java):
      Convert string (path) to enum
- URL:
    - Add: <http:localhost:8080/calc/add?x=10&y=5>
    - Subtract: <http:localhost:8080/calc/subtract?x=10&y=5>
    - Multiply: <http:localhost:8080/calc/multiply?x=10&y=5>
    - Divide: <http:localhost:8080/calc/divide?x=10&y=5>

### Question 4: Quản lý sản phẩm (Product CRUD – In-Memory)

- Problem:
    - Team muốn mock thử một API quản lý sản phẩm.
        - GET `/products` → trả về danh sách.
        - POST `/products` (JSON) → thêm sản phẩm.
        - GET `/products/{id}` → xem chi tiết.
        - PUT `/products/{id}` → cập nhật sản phẩm.
        - DELETE `/products/{id}` → xóa sản phẩm.
- Solution: [Full source: Question 4](src/main/java/com/cybersoft/restfulapi/question4)
    - [Controller](src/main/java/com/cybersoft/restfulapi/question4/controller/ProductController.java)
    - [DTO](src/main/java/com/cybersoft/restfulapi/question4/dto/ProductDTO.java)
    - [Model](src/main/java/com/cybersoft/restfulapi/question4/model/Product.java)
    - [Repository](src/main/java/com/cybersoft/restfulapi/question4/repository/ProductRepository.java)
    - [Service](src/main/java/com/cybersoft/restfulapi/question4/service/ProductService.java)
- URLs:
    - Lấy danh sách sản phẩm (GET): <http:localhost:8080/products>
    - Lấy thông tin chi tiết của sản phầm theo ID (GET) <http:localhost:8080/products/1>
    - Thêm mới một sản phẩm (POST): <http:localhost:8080/products/>

      ```json
      {
        "name": "iPhone Dual",
        "price": 999.99,
        "quantity": 1000
      }
      ```

    - Cập nhật thông tin sản phẩm (PUT): <http:localhost:8080/products/1>

      ```json
      {
        "name": "iPhone 84",
        "price": 2026,
        "quantity": 84
      }
      ```

    - Xóa sản phẩm (DELETE): <http:localhost:8080/products/1>

## Prerequisites

### Project Structure

### Environment

- IDE: IntelliJ
- Java 21

## Author

Khang Nguyen
