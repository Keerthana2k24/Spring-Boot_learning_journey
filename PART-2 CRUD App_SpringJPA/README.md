# SpringJPA - Part 2 Learning Project
It demonstrates CRUD operations on Movie Database using Spring Boot, Spring Data JPA, MySQL, and REST APIs.

## Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- Lombok
- Postman

## Features

- Add Movie
- Get All Movies
- Update Movie
- Delete Single Movie
- Delete All Movies
- Find Movie by Title
- Filter Movies by Genre and Director

## Project Structure

src/main/java/com/example/SpringJPA

- Controller
- Service
- Repository
- Model

## Database Configuration

Update `src/main/resources/application.properties`

```properties
spring.application.name=SpringJPA

spring.datasource.url=jdbc:mysql://localhost:3306/springjpa
spring.datasource.username=root
spring.datasource.password=your_password_here

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
