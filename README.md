# 🏥 Clínica Spring Boot Balvin

## 📘 Descripción del proyecto

**ClínicaSpringBootBalvin** es un proyecto desarrollado en **Java** utilizando el framework **Spring Boot**, que implementa un sistema básico para la gestión de una clínica médica.  
El proyecto tiene como objetivo modelar las entidades principales del entorno clínico, estableciendo relaciones entre pacientes, médicos y su respectiva información profesional y clínica.

---

## ⚙️ Tecnologías utilizadas

- **Java**  
- **Spring Boot**  
  - DevTools  
  - Spring Web  
  - JPA (Java Persistence API)  
  - MySQL Driver  
  - H2 Database  
- **IntelliJ IDEA** (entorno de desarrollo)  
- **XAMPP** (para la gestión del servidor MySQL)

---

## 🧩 Estructura del proyecto

El proyecto se organiza en la carpeta `models`, donde se encuentran las entidades principales del sistema:

1. **Paciente**  
   - Representa los datos personales del paciente.

2. **Historia Clínica**  
   - Contiene la información médica y antecedentes del paciente.  
   - Se relaciona con la entidad **Paciente** mediante una relación **1:1**.

3. **Médico**  
   - Almacena los datos básicos de los médicos de la clínica.

4. **Tarjeta Profesional**  
   - Incluye la información de la licencia o credencial profesional del médico.  
   - Se relaciona con la entidad **Médico** mediante una relación **1:1**.

Estas entidades son gestionadas por **Spring Data JPA**, lo que permite que se creen automáticamente como tablas en la base de datos **MySQL**.

---

## 🗃️ Base de datos

- **Motor:** MySQL  
- **Gestor:** XAMPP (phpMyAdmin)  
- **Configuración:** Spring Boot se conecta a MySQL mediante el driver correspondiente, permitiendo la creación automática de las tablas y sus relaciones a partir de las entidades definidas en el proyecto.


---

## 🧠 Objetivo académico

Este proyecto fue desarrollado con fines de aprendizaje y práctica del uso de **Spring Boot**, la gestión de **relaciones entre entidades JPA**, y la integración con una base de datos **MySQL**, fortaleciendo los conocimientos en desarrollo backend con Java.


---

## 👨‍💻 Autor

**Kevin Stiward Balvin García**  
Desarrollador del proyecto **ClínicaSpringBootBalvin**


