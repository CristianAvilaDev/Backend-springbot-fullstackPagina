package com.example.crudrapido.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public RedirectView home(HttpServletRequest request) {
        String baseUrl = request.getScheme() + "://" + request.getServerName()
                + ":" + request.getServerPort();  // Siempre usa el puerto sin filtrar

        // Redirigir directamente a la URL deseada
        return new RedirectView(baseUrl + EstudianteController.BASE_PATH + "/inicio");
    }
}
