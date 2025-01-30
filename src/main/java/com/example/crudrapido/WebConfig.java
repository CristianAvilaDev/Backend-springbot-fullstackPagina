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
                .allowedOrigins("*")  // Permitir cualquier origen
                .allowedMethods("GET", "POST", "PUT", "DELETE")  // Métodos permitidos
                .allowedHeaders("*");  // Permitir todos los encabezados
    }
}
