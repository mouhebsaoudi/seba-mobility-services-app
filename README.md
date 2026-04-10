# SEBA Mobility Services App

Backend project for a mobility rental application that allows customers to rent vehicles for flexible time periods.  
The project was developed in **Java** using **Spring Boot** and focuses on backend development, persistence, REST APIs, validation, and security.

## Overview

The SEBA Mobility Services App models the core backend logic of a mobility service platform.  
It supports the management of customers, employees, vehicles, rentals, invoices, and service points.

The project was built as part of a university software engineering / business application development course and demonstrates practical experience in designing and implementing a structured backend application.

## Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- H2 Database
- Spring Security
- REST API
- JPQL

## Features

- Persistent domain model using JPA/Hibernate
- Inheritance mapping for entity hierarchies
- CRUD operations for core entities
- REST controllers for multiple business entities
- Request validation with meaningful error responses
- Global exception handling with proper HTTP status codes
- Advanced JPQL queries
- Basic user management and authentication with Spring Security
- Testing and inspection through H2 console

## Implemented Functionality

### Domain Modeling & Persistence
- Annotated all required classes for database persistence
- Implemented the **Mapped Superclass** strategy for the `User` hierarchy
- Implemented the **Joined Table** strategy for the `Vehicle` hierarchy
- Modeled associations between entities based on the UML design
- Created repositories and service layers for the application entities

### CRUD Operations
Implemented basic CRUD functionality for the main entities, including:
- `save()`
- `findAll()`
- `findById()`
- `deleteById()`

### Advanced Queries
Implemented JPQL queries for:
- finding all completed rentals
- finding all customers with unpaid invoices
- finding all vehicles for a given service point

### REST API
Created REST controllers for:
- Rental
- Invoice
- Vehicle
- Customer
- Employee
- ServicePoint

Implemented full CRUD operations for:
- VehicleController
- CustomerController

### Validation & Error Handling
- Added validation annotations to improve data quality
- Implemented request validation to provide clearer API responses
- Added global exception handling so missing entities return **HTTP 404**

### Security
- Integrated **Spring Security**
- Added basic user management to the application

## Learning Outcomes

This project helped strengthen my skills in:
- backend development with Spring Boot
- object-relational mapping with JPA/Hibernate
- REST API design
- database persistence and query design
- validation and exception handling
- secure application design with Spring Security
- structuring applications with repositories, services, and controllers

## Project Structure

The application follows a layered backend architecture, typically including:
- **entities** for domain models
- **repositories** for data access
- **services** for business logic
- **controllers** for REST endpoints
- **exception / validation handling** for robust API behavior

## How to Run

1. Clone the repository
2. Open the project in your IDE
3. Build and run the Spring Boot application
4. Access the H2 console and API endpoints locally

## Notes

This project was developed in an academic context and is intended to demonstrate backend engineering concepts and practical implementation skills in Java and Spring Boot.
