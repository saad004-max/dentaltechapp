package ma.dentalTech.entities.finance;

import ma.dentalTech.entities.BaseEntity;
// Importez vos Enums StatutSFEnum, EnPromoEnum

public class SituationFinancière extends BaseEntity {

    private Long idSF;
    private Double totaleDesActes;
    private Double totalePayé;
    private Double crédit;
    // private StatutSFEnum statut;
    // private EnPromoEnum enPromo;

    // Association 1-1 vers Patient
    // Association 1-N vers Facture

    public SituationFinancière() {
        super();
    }
    // ... Getters et Setters ...
}