# Match Web Service

This project is a functional web service for managing sports matches and their odds. It is built using **Spring Boot**, **JPA**, and **PostgreSQL**. The web service allows creating, retrieving, updating, and deleting matches and their associated odds. It is containerized using **Docker** and **Docker Compose** for easy deployment.

## Features

- **Match Management**: Create, read, update, and delete matches.
- **Odds Management**: Associate odds with specific matches and manage them.
- **PostgreSQL**: Uses PostgreSQL as the database for storing match data.
- **Docker**: The application is containerized with Docker for easy deployment.

## Tech Stack

- **Backend**: Java, Spring Boot, JPA (Hibernate)
- **Database**: PostgreSQL
- **Docker**: Docker, Docker Compose
- **Frontend**: (If applicable, can add more info here)

## Prerequisites

Before running the application, make sure you have the following installed:

- **Docker**: [Install Docker](https://www.docker.com/get-started)
- **Docker Compose**: Docker Compose comes bundled with Docker Desktop.
- **Maven**: To build the project locally (optional if building with Docker).

## Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/takisparas23/accepted.git
cd accepted

```
### 2.Once the application is running, you can interact with it via the following endpoints:

1. Create Match: POST /api/matches
2. Get All Matches: GET /api/matches
3. Get Match by ID: GET /api/matches/{id}
4. Update Match: PUT /api/matches/{id}
5. Delete Match: DELETE /api/matches/{id}
6. Create Match Odds: POST /api/matches/{matchId}/odds
7. Get Match Odds by ID: GET /api/matches/{matchId}/odds/{id}
You can use tools like Postman 

### 3.Postman Collection
A Postman collection is included in the project for easier testing of the API. You can import the collection into Postman and test the endpoints directly.

To import the collection:

Open Postman.
Click on Import in the top left.
Choose File and select the Match_API_Collection.json file from the postman directory in the project.
The collection will be loaded, and you can start testing the API.