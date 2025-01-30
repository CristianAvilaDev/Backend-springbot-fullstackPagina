package com.example.crudrapido.entiti;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="tbl_student2")
public class estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long studentId;
    private String email;  // Ahora email es solo un campo de texto normal
    private String firstName;
    private String lastName;


}
