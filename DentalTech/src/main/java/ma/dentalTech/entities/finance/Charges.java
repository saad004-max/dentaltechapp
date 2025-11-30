package ma.dentalTech.entities.finance;

import ma.dentalTech.entities.BaseEntity;
import java.time.LocalDateTime;

public class Charges extends BaseEntity {

    // Note: Pas d'ID spécifique dans le diagramme, utilisons l'ID de BaseEntity
    private String titre;
    private String description;
    private Double montant;
    private LocalDateTime date;

    public Charges() {
        super();
    }
    // ... Getters et Setters ...
}