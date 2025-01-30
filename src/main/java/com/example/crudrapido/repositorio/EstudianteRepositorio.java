package com.example.crudrapido.repositorio;

import com.example.crudrapido.entidades.EstudianteEntidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepositorio extends JpaRepository<EstudianteEntidad, Long> {
}

