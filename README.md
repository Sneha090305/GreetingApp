# GreetingApp

## Overview
GreetingApp is a Spring Boot REST API that performs CRUD operations for greeting messages using a layered architecture (Controller, Service, Repository) with MySQL database integration.

## Tech Stack
- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- MySQL
- Maven

## API Endpoints

Create Greeting  
POST /greeting  
Example: http://localhost:8080/greeting?message=Hello

Get Greeting by ID  
GET /greeting/{id}

Get All Greetings  
GET /greetings

Update Greeting  
PUT /greeting/{id}?message=Updated Message

Delete Greeting  
DELETE /greeting/{id}

## Use Cases Implemented
UC1 – Greeting Controller  
UC2 – Service Layer  
UC3 – Dynamic Greeting  
UC4 – Greeting Entity & Repository  
UC5 – Get Greeting by ID  
UC6 – List All Greetings  
UC7 – Persist Greeting to Database  
UC8 – Update Greeting  
UC9 – Delete Greeting

## Run Application
mvn spring-boot:run

Server runs at:
http://localhost:8080
