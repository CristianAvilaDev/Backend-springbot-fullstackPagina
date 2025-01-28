package com.example.crudrapido.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.crudrapido.repositorio.EstudianteRepositorio;
import com.example.crudrapido.entiti.estudiante;

import java.util.List;
import java.util.Optional;

@Service
public class studentService {

    @Autowired
    EstudianteRepositorio EstudianteRepositorio;

    // Método para obtener un estudiante por su ID
    public Optional<estudiante> getEstudiante(Long id) {
        return EstudianteRepositorio.findById(id); // Busca un estudiante por ID
    }

    // Método para guardar un estudiante (insertar o actualizar)
    public void saveEstudiante(estudiante nuevoEstudiante) {
         EstudianteRepositorio.save(nuevoEstudiante); // Guarda o actualiza un estudiante
    }
    public List<estudiante> getEstudianteTodos() {
        return  EstudianteRepositorio.findAll(); // Devuelve todos los estudiantes
    }


    // Método para eliminar un estudiante por su ID
    public void deleteEstudiante(Long id) {
        EstudianteRepositorio.deleteById(id); // Elimina un estudiante por ID
    }
}
