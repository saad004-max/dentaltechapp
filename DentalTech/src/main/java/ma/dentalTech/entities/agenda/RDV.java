package ma.dentalTech.entities.agenda;

import ma.dentalTech.entities.BaseEntity;
import java.time.LocalDate;
import java.time.LocalTime;


public abstract class RDV extends BaseEntity {

    private Long idRDV;
    private LocalDate Date;
    private LocalTime heure;
    private String motif; //
    private String noteMedecin;


    public RDV() {
        super();
    }
}