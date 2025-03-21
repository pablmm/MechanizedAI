# MechanizedAI
TakeHomeProject
1. Modernize Transaction CRUD to Java:
Assumptions:
We'll focus on a simplified transaction service.
We'll use an in-memory H2 database for simplicity (for demonstration purposes, in production RDS or DynamoDB is recommended).
We'll implement basic CRUD operations (Create, Read, Update, Delete).
Implementation Steps:
Project Setup:
Create a Spring Boot project.
Add dependencies: Spring Web, Spring Data JPA, H2 Database.
Entity Definition:
Create a Transaction entity class.
Repository Interface:
Create a TransactionRepository interface extending JpaRepository.
Service Layer:
Create a TransactionService class to handle business logic.
Controller Layer:
Create a TransactionController class to expose RESTful endpoints.
