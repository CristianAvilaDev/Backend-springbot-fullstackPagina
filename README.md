# Backend para Sistema CRUD con Spring Boot y PostgreSQL

Este repositorio contiene el backend de un sistema CRUD desarrollado con Spring Boot y que se conecta a una base de datos PostgreSQL. El backend está diseñado como una API RESTful, lista para ser consumida por un frontend construido con Angular.

## Características principales:
- API RESTful que permite operaciones CRUD (Crear, Leer, Actualizar, Eliminar).
- Desarrollado utilizando Spring Boot.
- Base de datos PostgreSQL hospedada en supabase.com.
- Contenedor Docker para facilidad de despliegue y ejecución.
- Despliegue en Render.com

## Acceso al Backend:
- Backend en producción: [https://crudrapido-app-latest.onrender.com](https://crudrapido-app-latest.onrender.com)
  
## Frontend:
- Repositorio del frontend: [Aquí](https://github.com/CristianAvilaDev/FullstackPagina-frontend-v1)
- Aplicación en funcionamiento: [https://merry-jalebi-ae8efb.netlify.app/](https://inspiratendencias.netlify.app/)








## Requisitos

Antes de ejecutar el proyecto localmente, asegúrate de tener instalados los siguientes programas:

- **Java 17 o superior** (para ejecutar el backend Spring Boot).
- **Docker** (si deseas correr la aplicación en un contenedor).

## Instalación y despliegue local

### Clonar el repositorio

```bash
git clone https://github.com/CristianAvilaDev/FullstackPagina-backend-v1

```

### Ejecutar el backend:

Si deseas ejecutar el proyecto de manera local:

#### usando el jar en  windows:
```bash
./mvnw spring-boot:run

```


Notas: 

Si deseas usar una base de datos diferente, configura las propiedades de la base de datos en el archivo application.properties según corresponda.
