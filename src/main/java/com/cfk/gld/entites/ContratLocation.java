package com.cfk.gld.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class ContratLocation {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "agence_id")
    private Agence agence;
    @ManyToOne
    @JoinColumn(name = "locataire_id")
    private Utilisateur locataire;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private LocalDate jourPaiement;
    @ManyToOne
    @JoinColumn(name = "bien_id")
    private Bien bien;
    private LocalDate dateCreation;
    private LocalDate dateModif;


}
