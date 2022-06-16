package com.cfk.gld.entites;

import com.cfk.gld.enums.Role;
import com.cfk.gld.enums.Sexe;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Utilisateur {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    @Enumerated(EnumType.STRING)
    private Sexe sexe;
    private String email;
    private String numTel;
    @ManyToOne
    @JoinColumn(name = "agence_id")
    private Agence agence;
    @Enumerated(EnumType.STRING)
    private Role role;
    private LocalDate dateCreation;
    private LocalDate dateModif;
}
