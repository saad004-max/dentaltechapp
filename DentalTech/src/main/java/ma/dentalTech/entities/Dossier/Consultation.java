package ma.dentalTech.entities.Dossier;

import ma.dentalTech.entities.BaseEntity;
import java.time.LocalDate;

public abstract class Consultation extends BaseEntity {

    private Long idConsultation;
    private LocalDate Date;
    private String observationMedecin;


    public Consultation() {
        super();
    }

}