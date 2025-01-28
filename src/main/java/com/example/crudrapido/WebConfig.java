package com.example.crudrapido;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // Configuración global para habilitar CORS
        registry.addMapping("/**")  // Aplicarlo a todas las rutas
                .allowedOrigins("http://localhost:4200", "https://merry-jalebi-ae8efb.netlify.app")  // Orígenes permitidos (tu aplicación Angular y el sitio adicional)
                .allowedMethods("GET", "POST", "PUT", "DELETE")  // Métodos permitidos
                .allowedHeaders("*")  // Permitir todos los encabezados
                .allowCredentials(true);  // Si se necesita permitir credenciales (cookies, autenticación)
    }
}
