package com.example.schoolzoo.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "student")
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nomStudent;
    private String prenomStudent;
    private String seledMois;
    private Integer seledJour;
    private Integer seledAnnee;
    private String sexeStudent;
    private String niveauEtudeStudent;
    private String emailStudent;
    private String telephoneStudent;
}