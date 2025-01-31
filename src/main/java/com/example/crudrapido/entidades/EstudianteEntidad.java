package com.example.crudrapido.entidades;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="tbl_student2")
public class EstudianteEntidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private long studentId;
    private String email;  // Ahora email es solo un campo de texto normal
    private String firstName;
    private String lastName;


}
