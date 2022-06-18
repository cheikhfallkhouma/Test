package com.cfk.gld.entites;

import com.cfk.gld.enums.TypeBien;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor

public class Bien {
     @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
     @Enumerated(EnumType.STRING)
    private TypeBien typeBien;
    private double superficie;
    private double prixLoyerFixe;
    private String proprietaire;
    private int nombreChambre;
    private int nombreSalon;
    private String adresse;
    private String commentaire;

    private boolean dispo;
    private LocalDate dateCreation;
    private LocalDate dateModif;

}


