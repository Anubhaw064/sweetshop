# 🍬 Sweet Shop Management System – Spring Boot REST API

A backend Spring Boot RESTful application for managing a sweet shop inventory.
Designed for company technical assessments with clean architecture and database integration.

## 🚀 Features
- Add new sweets
- View all sweets
- Update sweet details
- Delete sweets
- Search sweets by name
- Search sweets by category
- Purchase sweets (reduces quantity)
- Restock sweets
- MySQL database integration
- RESTful API design

## 🛠 Tech Stack
- Java 17
- Spring Boot
- Spring Data JPA
- Spring Security (basic configuration)
- MySQL
- Hibernate
- Maven

## 📂 Project Structure
src/main/java/com/sweetshop/sweetshop
├── auth
├── config
├── sweet
│ ├── controller
│ ├── repository
│ └── service
├── user
│ ├── repository
│ └── service
└── SweetshopApplication.java
## 🔌 API Endpoints
| Method | Endpoint | Description |
|------|---------|-------------|
| POST | /api/sweets | Add sweet |
| GET | /api/sweets | Get all sweets |
| PUT | /api/sweets/{id} | Update sweet |
| DELETE | /api/sweets/{id} | Delete sweet |
| GET | /api/sweets/search/name | Search by name |
| GET | /api/sweets/search/category | Search by category |
| PUT | /api/sweets/purchase/{id} | Purchase sweet |
| PUT | /api/sweets/restock/{id} | Restock sweet |

## ⚙️ How to Run
1. Install Java 17 and MySQL
2. Create a MySQL database
3. Configure database credentials in application.properties
4. Run SweetshopApplication
5. Application runs on:
   http://localhost:8080

## 🧪 Testing
APIs tested using browser and IntelliJ HTTP client.

Example:
GET http://localhost:8080/api/sweets

## 📌 Notes
- Backend-only project
- Built for company assessment
- Clean layered architecture

## 👤 Author
Anubhaw
