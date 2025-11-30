package ma.dentalTech.entities.agenda;

import ma.dentalTech.entities.BaseEntity;
import java.time.LocalDate;
import java.time.LocalTime;

// Importez votre Enum StatutRDVEnum

public class RDV extends BaseEntity {

    private Long idRDV;
    private LocalDate Date;
    private LocalTime heure;
    private String motif; //
    // private StatutRDVEnum statut;
    private String noteMedecin; //

    // Associations vers Patient et Médecin

    public RDV() {
        super();
    }
    // ... Getters et Setters ...
}