package com.example.crudrapido.repositorio;

import com.example.crudrapido.entiti.estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepositorio extends JpaRepository<estudiante, Long> {
}

