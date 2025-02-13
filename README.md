# Shoe Store API Spring Boot

## Overview

This project is a simple Spring Boot application that provides a RESTful API for managing a shoe store. It is designed for testing and learning purposes with students.

## API Endpoints

### 1. Get All Shoes

- **Endpoint:** `/shoes`
- **Method:** `GET`
- **Description:** Retrieves a list of all shoes in the store.
- **Response:**
  ```json
  [
    {
      "id": 1,
      "name": "Air Max",
      "brand": "Nike",
      "price": 120.00,
      "stock": 10
    },
    {
      "id": 2,
      "name": "UltraBoost",
      "brand": "Adidas",
      "price": 180.00,
      "stock": 5
    }
  ]
  ```

### 2. Get Shoe by ID

- **Endpoint:** `/shoes/{id}`
- **Method:** `GET`
- **Description:** Retrieves a shoe by its ID.
- **Response:**
  ```json
  {
    "id": 1,
    "name": "Air Max",
    "brand": "Nike",
    "price": 120.00,
    "stock": 10
  }
  ```

## Getting Started

To get started with the project, clone the repository and build the project using Maven or your preferred Java build tool.

### Prerequisites

- Java 8 or higher
- Maven

### Building and Running

1. Clone the repository:
   ```sh
   git clone https://github.com/yourusername/shoe-store-api-springboot.git
   ```
2. Navigate to the project directory:
   ```sh
   cd shoe-store-api-springboot
   ```
3. Build the project:
   ```sh
   mvn clean install
   ```
4. Run the application:
   ```sh
   mvn spring-boot:run
   ```

## License

This project is licensed under the MIT License.
