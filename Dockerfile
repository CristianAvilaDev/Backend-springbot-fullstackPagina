# Usa una imagen base con OpenJDK 23 (Java 23)
FROM openjdk:23-jdk-slim

# Copia el archivo JAR generado al contenedor
COPY target/crudrapido-0.0.1-SNAPSHOT.jar app.jar

# Expón el puerto 8080 (por defecto en Spring Boot)
EXPOSE 8080

# Comando para ejecutar la aplicación cuando el contenedor se inicie
ENTRYPOINT ["java", "-jar", "/app.jar"]
