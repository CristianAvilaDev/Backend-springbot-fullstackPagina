## **Backend para el Proyecto FullstackPagina con Spring Boot y PostgreSQL**

Este repositorio contiene el backend de FullstackPagina, un proyecto fullstack que consta de un frontend desarrollado en Angular y un backend en Spring Boot. Este backend está diseñado para realizar operaciones CRUD y se conecta a una base de datos PostgreSQL. Los endpoints proporcionados están específicamente diseñados para ser consumidos por el frontend Angular, ofreciendo la funcionalidad necesaria para la aplicación. 

## Características principales:

- Desarrollado utilizando Spring Boot.
- Permite realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) con los datos de la base de datos.
- Base de datos PostgreSQL hospedada en supabase.com.
- Diseñado para ser consumido por el frontend en Angular del proyecto FullstackPagina.
- Dockerizado: El backend está empaquetado en un contenedor Docker, lo que facilita el despliegue y ejecución en cualquier entorno compatible con Docker.
- Despliegue en Render.com, donde se ejecuta la imagen Docker en producción

## Acceso al Backend:
- Backend en producción: [https://crudrapido-app-latest.onrender.com](https://crudrapido-app-latest.onrender.com)
  
## Frontend:
- Repositorio del frontend: [Aquí](https://github.com/CristianAvilaDev/FullstackPagina-frontend-v1)
- Aplicación en funcionamiento: https://inspiratendencias.netlify.app/








## Requisitos

Antes de ejecutar el proyecto localmente, asegúrate de tener instalados los siguientes programas:

- **Java 17 o superior** (recomendado Java 23) .


## Instalación y despliegue local

### Clonar el repositorio

```bash
git clone https://github.com/CristianAvilaDev/FullstackPagina-backend-v1

```

### Ejecutar el backend:

 accede a:  [http://localhost:8080](http://localhost:8080/)


Notas: 

Si deseas usar una base de datos diferente, configura las propiedades de la base de datos en el archivo application.properties según corresponda.
