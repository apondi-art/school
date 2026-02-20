#  School Management System (OOP Project)

## Overview

This is a **terminal-based school management system** built using **Object-Oriented Programming (OOP)** principles in Java. The system models a basic school environment with **staff, students, courses, classrooms, and applicants**, demonstrating clean OOP design including **abstraction, inheritance, encapsulation, polymorphism, and aggregation**.

The project allows interaction with each department/role through a console menu.

---

## Features

### Principal
- Admit applicants based on age
- Expel students from a classroom
- View all students

### Teacher
- Teach courses
- Assign teachers to courses

### Student
- Take courses
- View enrolled courses

### Non-Academic Staff
- Clean the school environment
- Perform non-academic duties

### General
- Terminal-based menu for role selection and actions
- Clean separation of concerns: model classes vs application logic
- Easy to extend for additional features

---

## Project Structure

school/
├── src/
│ ├── model/ # Business logic and OOP models
│ │ ├── Person.java
│ │ ├── Staff.java
│ │ ├── Principal.java
│ │ ├── Teacher.java
│ │ ├── NonAcademicStaff.java
│ │ ├── Student.java
│ │ ├── Applicant.java
│ │ ├── Course.java
│ │ └── ClassRoom.java
│ ├── app/ # Terminal menu & interactions
│ │ └── SchoolApp.java
│ └── Main.java # Entry point


---

## OOP Concepts Used

| Concept         | How It Is Used                                                                 |
|-----------------|-------------------------------------------------------------------------------|
| **Abstraction** | `Person` and `Staff` are abstract classes preventing direct instantiation     |
| **Inheritance** | `Principal`, `Teacher`, `NonAcademicStaff` extend `Staff`; `Student` and `Applicant` extend `Person` |
| **Encapsulation** | All class fields are private and accessed via getters/setters                |
| **Polymorphism** | `performDuties()` method overridden in different staff types                |
| **Aggregation** | `ClassRoom` has `List<Student>`; `Student` has `List<Course>`                |
| **Single Responsibility** | Each class does one main thing (Principal manages admission, Student takes courses, etc.) |

---

## Terminal Interaction

Example workflow:
