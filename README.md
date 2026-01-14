# 📦 Product Management System - REST API

This project is a robust **RESTful API** developed using **Spring Boot** to manage a product catalog. It demonstrates modern Java backend practices, including global exception handling and database integration.

## 🛠 Tech Stack & Architecture
- **Framework:** Spring Boot (Java 17)
- **Database:** H2 In-Memory Database
- **ORM:** Spring Data JPA (Hibernate)
- **Tools:** Postman for API Testing, Maven for Dependency Management

## 🚀 API Use Cases & HTTP Methods

### 1️⃣ Create a New Product
- **Endpoint:** `POST /api/v1/products`
- **Description:** Adds a new product entry to the database and returns the created object.
- **Status Code:** `201 Created`
- 
![Image Alt](https://github.com/Kamronbeks/Final-Project-Task2/blob/edaa75b4c93657af388f7c9e601e7c6dcd5cae04/Screenshot%202026-01-14%20084236.png)

### 2️⃣ Retrieve Product by ID
- **Endpoint:** `GET /api/v1/products/{id}`
- **Description:** Fetches detailed information about a product using its unique identifier.
- **Status Code:** `200 OK`

![Image Alt](https://github.com/Kamronbeks/Final-Project-Task2/blob/ac0ce89f53846e8fc2424087c835b4d02f9a0cc5/Screenshot%202026-01-14%20084425.png)

### 3️⃣ Update Existing Product
- **Endpoint:** `PUT /api/v1/products/{id}`
- **Description:** Updates the name and attributes of an existing product.
- **Status Code:** `200 OK`

![Image Alt](https://github.com/Kamronbeks/Final-Project-Task2/blob/071408609e9d071ac8a530c6bc299c1fe9d78fb1/Screenshot%202026-01-14%20084537.png)

### 4️⃣ Delete a Product
- **Endpoint:** `DELETE /api/v1/products/{id}`
- **Description:** Permanently removes a product from the database catalog.
- **Status Code:** `204 No Content`

![Image Alt](https://github.com/Kamronbeks/Final-Project-Task2/blob/2600fd1a239028b35fea93fd44dac86b9e0df602/Screenshot%202026-01-14%20084950.png)

### 5️⃣ Database Management (H2 Console)
- **Console URL:** `http://localhost:8080/h2-console`
- **Description:** Real-time data persistence monitoring. You can verify records in the `PRODUCTS` table directly.

![Image Alt](https://github.com/Kamronbeks/Final-Project-Task2/blob/0d37b01df72fa1793b859e565b581d42e294472d/Screenshot%202026-01-14%20084856.png)

### 6️⃣ Exception Handling & Validation
- **Description:** Custom error responses using `@ControllerAdvice`. If a product ID is not found, the API returns a structured error message.
- **Status Code:** `404 Not Found`

![Image Alt](https://github.com/Kamronbeks/Final-Project-Task2/blob/8be6d4abf3e61ebfbaa0fa401eb45ae6ed7f329f/Screenshot%202026-01-14%20085043.png)
