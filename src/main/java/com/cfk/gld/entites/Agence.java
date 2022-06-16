package com.cfk.gld.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Agence {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    @ManyToOne
    @JoinColumn(name = "admin_id")
    private Utilisateur admin;
    private String adresse;
    private String numTel;
    private LocalDate dateCreation;
    private LocalDate dateModif;

}
