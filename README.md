# Backend para Proyecto Fullstack con Spring Boot y PostgreSQL

Este repositorio contiene el backend de un proyecto fullstack desarrollado con Spring Boot, diseñado para proporcionar los endpoints necesarios para el frontend construido con Angular. La API RESTful permite realizar operaciones CRUD y se conecta a una base de datos PostgreSQL.

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
- Aplicación en funcionamiento: https://inspiratendencias.netlify.app/








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
