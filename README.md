# 💬 Java Console Chatbot with JDBC & MySQL

This is a simple **console-based chatbot** project developed in **Java** that allows real-time chatting between users. All user messages and credentials are stored securely using **MySQL** through **JDBC**.

## 🧠 Project Description

This chatbot simulates a real-time messaging system in the console where:

- Users can **register** and **login**
- Messages are stored in a **MySQL database**
- Chat history can be accessed anytime
- No GUI involved — it's a pure console-based experience

This project focuses on the backend logic and database connectivity using Java and JDBC.

## 🛠️ Technologies Used

- **Java SE** (Core Java)
- **JDBC (Java Database Connectivity)**
- **MySQL Database**

## 🧩 Features

- 👤 User Registration & Login System  
- 💬 Live console chat (user-to-chatbot interaction)  
- 🗃️ Persistent message storage using MySQL  
- 🔐 Basic input validation  
- 🕵️ Admin can view all chat logs (optional feature)

## 🗃️ Database Schema

- **Users Table**: Stores username and password  
- **Messages Table**: Stores sender, timestamp, and message content

```sql
CREATE TABLE users (
    id INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(50) UNIQUE,
    password VARCHAR(50)
);

CREATE TABLE messages (
    id INT PRIMARY KEY AUTO_INCREMENT,
    sender VARCHAR(50),
    message TEXT,
    timestamp DATETIME DEFAULT CURRENT_TIMESTAMP
);

