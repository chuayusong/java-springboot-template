# java-springboot-template

This repository serves as a template for future web application using springboot.

## Purpose

This application is a simple RESTful web service that allows you to store and retrieve records. Each record consists of a name and an amount.

## Setup

To build and run this project, you will need:

*   Java 17 or later
*   Maven

To build the project, run the following command in the root directory:

```bash
mvn clean install
```

To run the project, run the following command:

```bash
mvn spring-boot:run
```

The application will start on port 8080.

## Usage

The following endpoints are available:

*   `GET /pingMe`: A simple endpoint to check if the service is running.
*   `POST /record/{name}/{amount}`: Creates a new record.
*   `GET /record/{name}`: Retrieves a record by its name.

### Examples

**Create a record:**

```bash
curl -X POST http://localhost:8080/record/my-record/123
```

**Get a record:**

```bash
curl http://localhost:8080/record/my-record
```

## Swagger-ui
List of endpoints at:
http://localhost:8080/swagger-ui/index.html