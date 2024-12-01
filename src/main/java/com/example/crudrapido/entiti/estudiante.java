package com.example.crudrapido.entiti;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="tbl_student")
public class estudiante {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long studentId;

    private String firstName;
    private String lastName;
    @Column(name="email_andress")
    private String email;
}
