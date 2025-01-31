package com.example.crudrapido.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.crudrapido.repositorio.EstudianteRepositorio;
import com.example.crudrapido.entidades.EstudianteEntidad;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Sort;

@Service
public class StudentService {

    @Autowired
    EstudianteRepositorio EstudianteRepositorio;

    // Método para obtener un estudiante por su ID
    public Optional<EstudianteEntidad> getEstudiante(Long id) {
        return EstudianteRepositorio.findById(id); // Busca un estudiante por ID
    }

    // Método para guardar un estudiante (insertar o actualizar)
    public void saveEstudiante(EstudianteEntidad nuevoEstudiante) {
         EstudianteRepositorio.save(nuevoEstudiante); // Guarda o actualiza un estudiante
    }
    public List<EstudianteEntidad> getEstudianteTodos() {

        return EstudianteRepositorio.findAll(Sort.by(Sort.Order.asc("studentId"))); //
    }


    // Método para eliminar un estudiante por su ID
    public void deleteEstudiante(Long id) {
        EstudianteRepositorio.deleteById(id); // Elimina un estudiante por ID
    }
}


