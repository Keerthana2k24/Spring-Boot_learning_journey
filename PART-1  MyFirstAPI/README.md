# Movie API

## Overview
A simple REST API built using Spring Boot to manage movie data using CRUD operations.

## Features
- View all movies
- View movie by ID
- Add a new movie
- Update existing movie
- Delete movie

## Tech Stack
- Java
- Spring Boot
- Maven
- Lombok
- Postman
- VS Code / IntelliJ IDEA

## Project Structure

src/main/java/com/example

- Controller/
  - MovieController.java
- Service/
  - MovieService.java
- Movie.java
- MyFirstApiApplication.java

## Layers Used

### Controller Layer
Handles HTTP requests and API endpoints.

### Service Layer
Contains business logic for CRUD operations.

### Model Layer
Movie class represents movie data.

## HTTP Methods Used

- GET `/` → Get all movies
- GET `/{id}` → Get movie by ID
- POST `/Movie` → Add new movie
- PUT `/Movie` → Update movie
- DELETE `/Movie/{id}` → Delete movie

## Run Locally

### In VS Code 

Install dependencies and build project:
```
.\mvnw.cmd clean install
```
```
.\mvnw.cmd spring-boot:run
```
**or IntelliJ (direct run on IDE)**
