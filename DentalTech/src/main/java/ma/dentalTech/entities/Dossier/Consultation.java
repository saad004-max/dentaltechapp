package ma.dentalTech.entities.dossier;

import ma.dentalTech.entities.BaseEntity;
import java.time.LocalDate;
// Importez votre Enum StatutConsultationEnum

public class Consultation extends BaseEntity {

    private Long idConsultation;
    private LocalDate Date;
    private String observationMedecin;

    // Association vers DossierMédicale et Médecin

    public Consultation() {
        super();
    }

    // ... Getters et Setters ...
}