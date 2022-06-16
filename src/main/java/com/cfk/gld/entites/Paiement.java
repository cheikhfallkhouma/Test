package com.cfk.gld.entites;

import com.cfk.gld.enums.MoyenPaiement;
import com.cfk.gld.enums.Statut;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Paiement {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate datePaiement;
    private double montantEtFrais;
    @Enumerated(EnumType.STRING)
    private MoyenPaiement moyenDePaiement;
    @ManyToOne
    @JoinColumn(name = "contrat_location_id")
    private ContratLocation contratLocation;
    @Enumerated(EnumType.STRING)
    private Statut statut;
    private LocalDate dateCreation;
    private LocalDate dateModif;
}
