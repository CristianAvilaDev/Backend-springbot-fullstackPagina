package com.example.crudrapido.controller;

import com.example.crudrapido.entiti.estudiante;
import com.example.crudrapido.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApiController {


    @Autowired
    com.example.crudrapido.service.studentService studentService;

    // Endpoint para "/api/datos"
    @GetMapping("/api/datos")
    public List<String> obtenerDatos() {
        return List.of("Dato1", "Dato2", "Dato3");
    }

    // Endpoint para "/pagina1"
    @GetMapping("/pagina1")
    public String mostrarMensaje() {
        return "¡Hola desde /pagina1!";
    }

    // Nuevo endpoint para recibir un dato forma de texto
    @PostMapping(value = "/api/recibirDato", consumes = MediaType.TEXT_PLAIN_VALUE)
    public String recibirDato(@RequestBody String dato) {
        System.out.println("Dato recibido en el backend: " + dato);
        return "Dato recibido: " + dato;
    }

    @PostMapping(value = "/api/recibirDatoJson")
    public estudiante  recibirDato(@RequestBody estudiante dato) {
        // Imprime el estudiante recibido en consola
        System.out.println("Estudiante recibido en el backend: " + dato);

        studentService.saveEstudiante(dato);
        return dato;
    }




}



