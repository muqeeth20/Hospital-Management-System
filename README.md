# 🏥 Hospital Management System

> A modular, console-based Hospital Management System developed using **Java** and **Object-Oriented Programming (OOP)** principles.

The application provides a simple way to manage **patients, doctors, and appointments** through a menu-driven console interface.

---

## ✨ Features

### 👨‍⚕️ Doctor Management

* Add new doctors
* Store doctor details
* Search doctors by ID
* Display all registered doctors
* Store doctor specialization and contact information

### 🧑‍🤝‍🧑 Patient Management

* Add new patients
* Store patient medical information
* Search patients by ID
* Display patient records
* Update basic patient information

### 📅 Appointment Management

* Book appointments between patients and doctors
* Validate patient and doctor availability
* Store appointment date and time
* Display all scheduled appointments

### 🛡️ Input Validation

* Validate names and phone numbers
* Validate patient age
* Validate appointment details
* Prevent appointments for unavailable patients or doctors

---

## 🛠️ Technologies Used

| Technology                | Purpose                    |
| ------------------------- | -------------------------- |
| ☕ Java                    | Core programming language  |
| 🧱 OOP                    | Modular application design |
| 📋 ArrayList              | Dynamic record storage     |
| 🔄 Loops & Conditions     | Application logic          |
| ⌨️ Scanner                | User input                 |
| 🧩 Methods & Constructors | Object management          |

---

## 🧠 Java Concepts Demonstrated

This project demonstrates fundamental Java concepts including:

* Classes and Objects
* Constructors
* Encapsulation
* Private data members
* Getters and Setters
* Methods
* ArrayList
* Loops
* Conditional Statements
* Switch-Case
* Input Validation
* Modular Programming

---

## 📁 Project Structure

```text
Hospital-Management-System/
│
├── Main.java
├── Hospital.java
├── Patient.java
├── Doctor.java
├── Appointment.java
├── Utils.java
├── .gitignore
└── README.md
```

### 📌 File Responsibilities

**`Main.java`**
Handles the menu-driven user interface and user input.

**`Hospital.java`**
Manages patients, doctors, and appointments using `ArrayList`.

**`Patient.java`**
Represents patient information and patient-related operations.

**`Doctor.java`**
Represents doctor information and specialization details.

**`Appointment.java`**
Stores appointment details such as patient, doctor, date, and time.

**`Utils.java`**
Contains reusable input-validation methods.

---

## 🔄 Application Workflow

```text
                 ┌──────────────┐
                 │   Main.java  │
                 └──────┬───────┘
                        │
                        ▼
               ┌─────────────────┐
               │  Hospital.java  │
               └─────┬─────┬─────┘
                     │     │
          ┌──────────┘     └──────────┐
          ▼                           ▼
   ┌─────────────┐             ┌─────────────┐
   │ Patient.java│             │ Doctor.java │
   └──────┬──────┘             └──────┬──────┘
          │                           │
          └───────────┬───────────────┘
                      ▼
              ┌───────────────┐
              │Appointment.java│
              └───────────────┘
                      
                 Utils.java
              Input Validation
```

---

## 🚀 How to Run

### 1. Clone the repository

```bash
git clone https://github.com/YOUR-USERNAME/Hospital-Management-System.git
```

### 2. Navigate to the project

```bash
cd Hospital-Management-System
```

### 3. Compile the Java files

```bash
javac *.java
```

### 4. Run the application

```bash
java Main
```

---

## 🖥️ Main Menu

```text
======================================
       HOSPITAL MANAGEMENT SYSTEM
======================================

1. Add Patient
2. Add Doctor
3. Search Patient
4. Search Doctor
5. Book Appointment
6. Display All Patients
7. Display All Doctors
8. Display Appointments
9. Exit

Enter your choice:
```

---

## 🎯 Learning Outcomes

Through this project, I practiced:

* Designing applications using OOP principles
* Creating relationships between multiple classes
* Managing collections using `ArrayList`
* Implementing CRUD-style record operations
* Validating user input
* Building a menu-driven Java application
* Organizing code into separate reusable files

---

## 🔮 Future Enhancements

Possible improvements for future versions:

* 🗄️ Integrate **MySQL/Oracle database**
* 🌐 Develop a web-based interface
* 🔐 Add user authentication and role-based access
* 💳 Add billing and payment management
* 💊 Add medicine and prescription management
* 📊 Generate patient and appointment reports
* 📝 Add persistent data storage

---

## 👨‍💻 Author

**Muqeeth**

B.Tech — Information Technology

---

## ⭐ Project Status

**Completed — Basic Console Version**

This project is developed for learning and demonstrates fundamental Java programming and Object-Oriented Programming concepts.
