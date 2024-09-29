
# 🌐 E-Commerce Advanced

Welcome to **E-Commerce Advanced**! This project is a state-of-the-art e-commerce platform designed for an effortless shopping experience for users and powerful management capabilities for administrators. Let’s revolutionize online shopping! 🚀

## ✨ Features
- 📱 **Responsive Design**: Sleek and modern UI for both mobile and desktop devices.
- 🛍️ **Product Management**: Add, edit, delete products with just a few clicks.
- 🔐 **User Management**: Full control over users, orders, and activities via the admin dashboard.
- 💳 **Payment Gateway Integration**: Smooth, secure, and reliable payment options for users.
- 🗄️ **Database Access Modes**: Choose between `JPA` and other access modes.

## 🔥 Quick Start

### 🚨 Prerequisites
Ensure you have **Java 17** installed. Download it [here](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html).

### ⚙️ Setup Guide

1. **Clone the repository**:

   ```bash
   git clone https://github.com/shaan372/e-commerce-adv.git
   ```

2. **Set environment variables**:

   On **Windows**:
   ```bash
   set DATABASE_ACCESS_MODE=jpa
   set DATABASE_NAME=postgres
   set DATABASE_PASSWORD=root123
   set DATABASE_URL=jdbc:postgresql://0.0.0.0:5432/ecom
   ```

   On **Linux/macOS**:
   ```bash
   export DATABASE_ACCESS_MODE=jpa
   export DATABASE_NAME=postgres
   export DATABASE_PASSWORD=root123
   export DATABASE_URL=jdbc:postgresql://0.0.0.0:5432/ecom
   ```

3. **Build and run the project**:

   ```bash
   ./mvnw spring-boot:run
   ```

### 📜 Environment Variables

| Variable Name           | Description                                      | Example Value                                      |
|-------------------------|--------------------------------------------------|----------------------------------------------------|
| `DATABASE_ACCESS_MODE`   | Defines the database access mode (e.g., `jpa`)   | jpa                                                |
| `DATABASE_NAME`          | The name of the PostgreSQL database              | postgres                                           |
| `DATABASE_PASSWORD`      | The password for the database                    | root123                                            |
| `DATABASE_URL`           | The connection URL for PostgreSQL                | jdbc:postgresql://0.0.0.0:5432/ecom                |

## 🤝 How to Contribute

We love contributions! Whether it’s a bug fix, feature request, or any improvement, feel free to help make **E-Commerce Advanced** even better.

### Contributing Guide:
1. **Fork the repo**
2. **Create a new branch** (`git checkout -b feature/AmazingFeature`)
3. **Commit your changes** (`git commit -m 'Add some AmazingFeature'`)
4. **Push to your branch** (`git push origin feature/AmazingFeature`)
5. **Open a Pull Request**

Your contributions make this project awesome! 🙌

## 📂 What's Inside

When you clone this repository, you’ll find these key directories and files:

| File/Folder             | Description                                      |
|------------------------ |--------------------------------------------------|
| `src/`                  | Main source code for the e-commerce platform     |
| `pom.xml`               | Maven build configuration file                   |
| `README.md`             | This documentation                               |
| `docker-compose.yml`    | Docker setup for easy local environment creation |
| `.env`                  | Sample environment variables                     |

## 🌟 Repository

Check out the official repository here: [E-Commerce Advanced](https://github.com/shaan372/e-commerce-adv.git) and don't forget to give us a ⭐ if you like the project!

