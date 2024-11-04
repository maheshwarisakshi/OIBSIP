# OIBSIP

#TASK 1- ONLINE RESERVATION SYSTEM

## Overview
A Java-based train reservation system with features for user login, ticket booking, viewing, and cancellation, using SQL for data storage.

## Features
- **User Authentication**
- **Ticket Booking**
- **View Reservation Details**
- **Cancellation**
- **Database Connectivity**

## Project Structure
- **Main Classes**: `Login.java`, `Reservation.java`, `Cancellation.java`, `FetchDetails.java`, `Menu.java`
- **Database Connection**: `DBConnection.java`
- **Dependencies**: `jcalendar-1.4.jar`, `mysql-connector-j-8.0.33.jar`, `protobuf-java-3.21.9.jar`

## Database Schema
**Tables**:
1. **`reservations`**: Stores ticket details (`reservationID`, `trainNumber`, `trainName`, etc.)
2. **`users`**: Stores user credentials (`userID`, `username`, `password`)

## Prerequisites
- **JDK 18**
- **MySQL Server**
- **NetBeans IDE** or any compatible IDE


