package ma.dentalTech.entities.finance;

import ma.dentalTech.entities.BaseEntity;
import java.time.LocalDateTime;

public abstract class Charges extends BaseEntity {

    private String titre;
    private String description;
    private Double montant;
    private LocalDateTime date;

    public Charges() {
        super();
    }
}