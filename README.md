# IntPatronat
Intive Patronat Java task

Parking Space Mapper
This application allows you to map parking spaces, add users and add reservations.

Technologies
Java 11.0.2 Springboot
Gradle
H2 database


Setup

Usage

Use the following CURLs

REST urls

1. POST http://localhost:8080/reservation



2. POST http://localhost:8080/parking-space
3. POST http://localhost:8080/user
4. GET http://localhost:8080/reservation/user/{userName}
5. GET http://localhost:8080/parking-space/free