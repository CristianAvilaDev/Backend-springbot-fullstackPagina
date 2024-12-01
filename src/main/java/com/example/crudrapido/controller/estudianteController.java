package com.example.crudrapido.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.crudrapido.entiti.estudiante;
import com.example.crudrapido.service.studentService;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/estudiante")
public class estudianteController {



    @Autowired
    studentService studentService;

    // POST: guardar un estudiante
    @PostMapping
    public void save(@RequestBody estudiante nuevoEstudiante) {
        studentService.saveEstudiante(nuevoEstudiante); // Guarda el estudiante
    }

    // GET: obtener todos los estudiantes
    @GetMapping
    public List<estudiante> getEstudiantes() {
        return studentService.getEstudianteTodos(); // Retorna todos los estudiantes
    }

    // GET: obtener un estudiante por su ID
    @GetMapping("/{id}")
    public estudiante getEstudianteById(@PathVariable Long id) {
        return studentService.getEstudiante(id).orElseThrow(() -> new RuntimeException("Estudiante no encontrado"));
    }

    // DELETE: eliminar un estudiante por su ID
    @DeleteMapping("/{id}")
    public void deleteEstudiante(@PathVariable Long id) {
        studentService.deleteEstudiante(id); // Elimina el estudiante
    }
}
