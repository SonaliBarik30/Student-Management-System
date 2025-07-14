# 🎓 Student Management System (RESTful Web App)

A backend-focused Spring Boot application that manages student data using REST APIs and full CRUD functionality.  
Built using Java, Spring Boot, Spring Data JPA, and MySQL, following clean code and layered architecture principles.

---

## 🛠 Tech Stack

- **Language**: Java 17+
- **Framework**: Spring Boot
- **Database**: MySQL
- **ORM**: Spring Data JPA (Hibernate)
- **API Style**: RESTful APIs
- **Build Tool**: Maven

---

## ✨ Key Features

- 🔄 Full **CRUD operations** on student records (Create, Read, Update, Delete)
- ⚙️ **Layered architecture** (Controller → Service → Repository)
- 🗂️ Clean **REST API endpoints**
- 🛡️ Robust and maintainable codebase
- 🛢️ Persistent database using **MySQL**
- ⚡ Project build and dependency management using **Maven**

---

## 📂 Project Structure

src/

└── main/

├── java/


│ └── net/springboot/sms/


│ ├── controller/ # REST Controllers


│ ├── entity/ # JPA Entities


│ ├── repository/ # Spring Data JPA Repositories


│ ├── service/ # Service Layer (Business Logic)


│ └── SmsApplication.java # Main Class


└── resources/
├── application.properties



---

## 🚀 How to Run

###clone the repo


git clone https://github.com/SonaliBarik30/Student-Management-System


cd student-management-system

###Configure your database
Make sure MySQL is running, then update application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/student_db


spring.datasource.username=root


spring.datasource.password=your_password


spring.jpa.hibernate.ddl-auto=update

###Create the database manually in MySQL:

CREATE DATABASE student_db;

 Run the app
Use your IDE or terminal:

./mvnw spring-boot:run


---

## 📡 API Endpoints


Method	Endpoint	Description


GET	   /api/students	List all students


POST	   /api/students	Create new student


GET	   /api/students/{id}	Get student by ID


PUT	/api/students/{id}	Update student


DELETE	   /api/students/{id}	Delete student
