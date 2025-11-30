package ma.dentalTech.entities.finance;

import ma.dentalTech.entities.BaseEntity;
import java.time.LocalDateTime;

// Importez votre Enum StatutFactureEnum

public class Facture extends BaseEntity {

    private Long idFature;
    private Double totaleFacture;
    private Double totalePayé;
    private Double reste;
    // private StatutFactureEnum statut;
    private LocalDateTime dateFacture;

    // Association vers SituationFinancière (relation N-1)

    public Facture() {
        super();
    }
    // ... Getters et Setters ...
}