# REST API Practice – Spring Boot

## Project Overview
This project is a simple Employee Management REST API developed using Java and Spring Boot.

The main purpose of this project is to understand REST API development, HTTP methods, request handling, and CRUD operations.

## Technologies Used
- Java
- Spring Boot
- Spring Web
- Maven
- IntelliJ IDEA
- Postman

## Features

- Add a new employee
- Retrieve all employees
- Retrieve an employee by ID
- Update employee details
- Delete an employee
- Filter employees by department
- Increment employee salary by percentage

## REST API Endpoints

| HTTP Method | Endpoint | Description |
|---|---|---|
| POST | `/employee` | Add a new employee |
| GET | `/employee` | Get all employees |
| GET | `/employee/{id}` | Get employee by ID |
| PUT | `/employee/{id}` | Update employee details |
| DELETE | `/employee/{id}` | Delete employee |
| GET | `/employee/department/{department}` | Get employees by department |
| PUT | `/employee/salary/{id}?percentage=10` | Increment employee salary |

## Sample JSON Request

```json
{
  "id": 1,
  "name": "Arun",
  "department": "IT",
  "salary": 30000
}
```

## API Concepts Practiced

- `@RestController`
- `@PostMapping`
- `@GetMapping`
- `@PutMapping`
- `@DeleteMapping`
- `@RequestBody`
- `@PathVariable`
- `@RequestParam`
- Java ArrayList
- Java Streams and Lambda Expressions
- Filtering data using Stream API

## Project Structure

```text
rest-api-practice
│
├── src/main/java/com/practice/rest_api_practice
│   ├── Employee.java
│   ├── EmployeeController.java
│   ├── GreetController.java
│   └── RestApiPracticeApplication.java
│
├── src/main/resources
├── src/test
├── .gitignore
├── mvnw
├── mvnw.cmd
└── pom.xml
```

## How to Run the Project

1. Clone the repository.
2. Open the project in IntelliJ IDEA.
3. Load Maven dependencies.
4. Run `RestApiPracticeApplication.java`.
5. Open Postman.
6. Test the REST API endpoints.

## Important Note

This project currently uses an in-memory ArrayList to store employee data. Data is not permanently stored in a database.

## Learning Objective

To gain practical experience in building REST APIs using Spring Boot and understanding CRUD operations.

## Author
P Aravindan

## License
This project is created for educational and learning purposes.
