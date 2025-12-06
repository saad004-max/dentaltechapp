package ma.dentalTech.entities.Dossier;

import ma.dentalTech.entities.BaseEntity;
import java.time.LocalDate;

public abstract class Ordonnance extends BaseEntity {

    private Long idOrd;
    private LocalDate date;



    public Ordonnance() {
        super();
    }
}