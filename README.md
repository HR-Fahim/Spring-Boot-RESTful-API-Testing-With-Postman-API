# About

This tutorial demonstrates how to build a simple RESTful API using the Spring Boot framework, display the user data on an HTML page, and test it
with Postman API.

## Prerequisites

Before starting this, make sure you have the following:

- Java Development Kit (JDK) installed
- Visual Studio Code (or any other IDE) installed
- Postman (or any other API testing tool) installed

## Getting Started

Follow the steps below to set up the project and run the application:

1. Clone the repository or download the project files.

2. Open the project in Visual Studio Code.

3. Open a terminal in Visual Studio Code (View -> Terminal).

4. Run the following command in the terminal to build and run the application:

   ```
   ./mvnw spring-boot:run
   ```

   This will start the Spring Boot application and listen for requests on `http://localhost:8080`.

5. Open Postman and create a new request.

6. Set the request method to `GET` and enter the following URL:

   ```
   http://localhost:8080/user
   ```

   This will retrieve the user data from the API.

7. The response should contain the user's name and email.

8. Open a web browser and navigate to `http://localhost:8080/index.html`.

   ![index](https://github.com/HR-Fahim/Spring-Boot-RESTful-API-Testing-With-Postman-API/assets/66734379/1b6f6d1f-16e9-4bae-92f0-04407269219b)

10. The HTML page will display the user's name and email obtained from the API.

## Project Structure

The project structure is as follows:

```
demo/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── example/
│       │           └── demo/
│       │               ├── controller/
│       │               │   └── UserController.java
│       │               └── DemoApplication.java
│       └── resources/
│           └── static/
│               └── index.html
└── pom.xml
```

- The `UserController` class in the `controller` package defines the API endpoint for retrieving user data.

- The `DemoApplication` class in the root package is the main entry point of the application.

- The `index.html` file in the `static` directory is the HTML page that displays the user data.

## Customize User Data

To customize the user data, follow these steps:

1. Open the `UserController` class (`src/main/java/com/example/demo/controller/UserController.java`).

2. Modify the `getUserInfo` method to return the desired user data. You can change the default values for the `name` and `email` parameters or fetch the data from a database or external service.

3. Rebuild and run the application to see the updated user data.

## API Testing

You can test the API endpoints using Postman or any other API testing tool.

![Postman V2](https://github.com/HR-Fahim/Spring-Boot-RESTful-API-Testing-With-Postman-API/assets/66734379/d2ea0b92-75e5-43b8-8daf-c31104442781)

## License

This project is licensed under the [GNU License](LICENSE).
