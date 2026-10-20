# BC Java - Assignment 09 - RESTful API

![Status](https://img.shields.io/badge/status-completed-brightgreen)
![Java](https://img.shields.io/badge/Java-%23ED8B00.svg?logo=openjdk&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJIDEA-000000.svg?logo=intellij-idea&logoColor=white)

<!-- TOC -->

* [BC Java - Assignment 09 - RESTful API](#bc-java---assignment-09---restful-api)
    * [Requirements](#requirements)
        * [Question 1: API Hello World (Onboarding task)](#question-1-api-hello-world-onboarding-task)
        * [Question 2: Service Greeting (Dependency Injection)](#question-2-service-greeting-dependency-injection)
        * [Question 3: API Máy tính đơn giản (Calculator)](#question-3-api-máy-tính-đơn-giản-calculator)
        * [Question 4: Quản lý sản phẩm (Product CRUD – In-Memory)](#question-4-quản-lý-sản-phẩm-product-crud--in-memory)
        * [Question 5: Quản lý sinh viên (Student API)](#question-5-quản-lý-sinh-viên-student-api)
        * [Question 6: Tạo Bean Config thủ công (AppConfig)](#question-6-tạo-bean-config-thủ-công-appconfig)
        * [Question 7: Tìm kiếm sách (Book Search API)](#question-7-tìm-kiếm-sách-book-search-api)
        * [Question 8: Quản lý nhân viên (Employee + Exception Handling)](#question-8-quản-lý-nhân-viên-employee--exception-handling)
        * [Question 9: Kiến trúc chuẩn 3 Layer (Customer API)](#question-9-kiến-trúc-chuẩn-3-layer-customer-api)
        * [Question 10: Quản lý đơn hàng (Order với Product – OneToMany)](#question-10-quản-lý-đơn-hàng-order-với-product--onetomany)
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
- URL: <http://localhost:8080/hello>

### Question 2: Service Greeting (Dependency Injection)

- Problem:
    - Product Owner muốn một API chào người dùng.
    - Tạo GreetingService với method `sayHello(String name)`.
    - API GET `/greet?name=Alice` → trả về `Hello Alice!`.
- Solution: [Full source: Question 2](src/main/java/com/cybersoft/restfulapi/question2)
    - [GreetingController](src/main/java/com/cybersoft/restfulapi/question2/controller/GreetingController.java)
    - [GreetingService](src/main/java/com/cybersoft/restfulapi/question2/service/GreetingService.java)
- URL: <http://localhost:8080/greet?name=Alice>

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
    - Add: <http://localhost:8080/calc/add?x=10&y=5>
    - Subtract: <http://localhost:8080/calc/subtract?x=10&y=5>
    - Multiply: <http://localhost:8080/calc/multiply?x=10&y=5>
    - Divide: <http://localhost:8080/calc/divide?x=10&y=5>

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
    - Lấy danh sách sản phẩm (GET): <http://localhost:8080/products>
    - Lấy thông tin chi tiết của sản phầm theo ID (GET) <http://localhost:8080/products/1>
    - Thêm mới một sản phẩm (POST): <http://localhost:8080/products/>

      ```json
      {
        "name": "iPhone Dual",
        "price": 999.99,
        "quantity": 1000
      }
      ```

    - Cập nhật thông tin sản phẩm (PUT): <http://localhost:8080/products/1>

      ```json
      {
        "name": "iPhone 84",
        "price": 2026,
        "quantity": 84
      }
      ```

    - Xóa sản phẩm (DELETE): <http://localhost:8080/products/1>

### Question 5: Quản lý sinh viên (Student API)

- Problem:
    - Team education cần API quản lý student.
    - API:
        - POST `/students` → thêm student từ JSON
        - GET `/students/{id}` → trả về student theo ID
- Solution: [Full source: Question 5](src/main/java/com/cybersoft/restfulapi/question5)
    - [Controller](src/main/java/com/cybersoft/restfulapi/question5/controller/StudentController.java)
    - [Service](src/main/java/com/cybersoft/restfulapi/question5/service/StudentService.java)
    - [Model](src/main/java/com/cybersoft/restfulapi/question5/model/Student.java)
- URLs:
    - Lấy thông tin sinh viên theo ID (GET): <http://localhost:8080/students/1>
        - Thêm mới sinh viên (POST): <http://localhost:8080/students/>

          ```json
          {
            "email": "ngkhang@gmail.com",
            "fullName": "Nguyễn Khang"
          }
          ```

### Question 6: Tạo Bean Config thủ công (AppConfig)

- Problem:
    - CTO muốn bạn thử tạo Bean thủ công thay vì @Service.
        - Tạo AppConfig với @Configuration.
        - Định nghĩa @Bean cho GreetingService.
        - Inject vào Controller để sử dụng.
- Solution: [Full source: Question 6](src/main/java/com/cybersoft/restfulapi/question6)
    - [Controller](src/main/java/com/cybersoft/restfulapi/question6/controller/GreetingControllerV2.java)
    - [Service](src/main/java/com/cybersoft/restfulapi/question6/service/GreetingServiceV2.java)
    - [AppConfig](src/main/java/com/cybersoft/restfulapi/question6/AppConfig.java)
- URL: GET <http://localhost:8080/greet-v2>

### Question 7: Tìm kiếm sách (Book Search API)

- Problem:
    - Khách hàng muốn API tìm kiếm sách theo tác giả.
        - GET `/books/search?author=abc` → trả về danh sách sách của tác giả đó.
- Solution: [Full source: Question 7](src/main/java/com/cybersoft/restfulapi/question7)
    - [Controller](src/main/java/com/cybersoft/restfulapi/question7/controller/BookController.java)
    - [Service](src/main/java/com/cybersoft/restfulapi/question7/service/BookService.java)
    - [Model](src/main/java/com/cybersoft/restfulapi/question7/model/Book.java)
- URL:
    - Tìm danh sách của sách theo tác giả (GET): <http://localhost:8080/books/search?author=abc>

### Question 8: Quản lý nhân viên (Employee + Exception Handling)

- Problem:
    - Team HR cần API quản lý nhân viên.
    - GET `/employees/{id}` → trả về nhân viên.
        - Nếu không có ID → trả về lỗi:
          `{ "error": "Employee not found", "status": 404 }`

- Solution: [Full source: Question 8](src/main/java/com/cybersoft/restfulapi/question8)
- URL: Lấy thông tin nhân viên theo ID (GET)
    - ID tồn tại: <http://localhost:8080/employees/0>
    - ID không tồn tại: <http://localhost:8080/employees/999>

### Question 9: Kiến trúc chuẩn 3 Layer (Customer API)

- Problem:
    - Tech lead muốn project chia đúng tầng:
        - Controller: nhận request.
        - Service: xử lý logic.
        - Repository: quản lý dữ liệu (In-memory).
        - Entity Customer(id, name, phone).
- Solution: [Full source: Question 9](src/main/java/com/cybersoft/restfulapi/question9)
- URL:
    - Lấy danh sách khách hàng (GET): <http://localhost:8080/customer>

### Question 10: Quản lý đơn hàng (Order với Product – OneToMany)

- Problem:
    - Khách hàng muốn API quản lý Order.
        - Entity Order(id, customerName, List<Product>).
        - POST `/orders` → tạo order với danh sách sản phẩm.
        - GET `/orders` → trả về toàn bộ order.
- Solution: [Full source: Question 10](src/main/java/com/cybersoft/restfulapi/question10)
    - URL:
        - Lấy danh sách đơn hàng (GET): <http://localhost:8080/orders>
            - Tạo đơn hàng mới (POST): <http://localhost:8080/orders>
                - Body:

                    ```json
                    {
                        "customerName": "Nguyễn Văn A",
                        "products": [
                            {
                                "id": 2,
                                "productName": "Mac mini",
                                "price": 900,
                                "quantity": 2
                            }
                        ]
                    }
                    ```

## Prerequisites

### Project Structure

```text
./
│   .gitattributes
│   .gitignore
│   HELP.md
│   mvnw
│   mvnw.cmd
│   pom.xml
│   README.md
│
├───.mvn
│   └───wrapper
└───src
    └───main
        ├───java
        │   └───com
        │       └───cybersoft
        │           └───restfulapi
        │               ├───question1
        │               ├───question2
        │               │   ├───controller
        │               │   └───service
        │               ├───question3
        │               │   ├───controller
        │               │   └───service
        │               ├───question4
        │               │   ├───controller
        │               │   ├───dto
        │               │   ├───model
        │               │   ├───repository
        │               │   └───service
        │               ├───question5
        │               │   ├───controller
        │               │   ├───model
        │               │   └───service
        │               ├───question6
        │               │   ├───controller
        │               │   └───service
        │               ├───question7
        │               │   ├───controller
        │               │   ├───model
        │               │   └───service
        │               ├───question8
        │               │   ├───controller
        │               │   ├───exception
        │               │   ├───model
        │               │   └───service
        │               ├───question9
        │               │   ├───controller
        │               │   ├───model
        │               │   ├───repository
        │               │   └───service
        │               └───question10
        │                   ├───controller
        │                   ├───model
        │                   ├───repository
        │                   └───service
        └───resources
            └───application.properties
```

### Environment

- IDE: IntelliJ
- Java 21

## Author

Khang Nguyen
