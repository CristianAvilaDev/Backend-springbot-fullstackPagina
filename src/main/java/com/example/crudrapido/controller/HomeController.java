package com.example.crudrapido.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String home(HttpServletRequest request) {
        String baseUrl = request.getScheme() + "://" + request.getServerName()
                + ":" + request.getServerPort();  // Siempre usa el puerto sin filtrar

        // Usamos BASE_PATH desde EstudianteController
        return "Bienvenido a la API de Estudiantes de CRUD Rápido.<br><br>"
                + "Para ver la documentación, accede a: "
                + "<a href=\"" + baseUrl + EstudianteController.BASE_PATH + "/inicio\">"
                + baseUrl + EstudianteController.BASE_PATH + "/inicio</a>";
    }
}
