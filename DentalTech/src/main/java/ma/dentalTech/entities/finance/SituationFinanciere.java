package ma.dentalTech.entities.finance;

import ma.dentalTech.entities.BaseEntity;

public abstract class SituationFinanciere extends BaseEntity {

    private Long idSF;
    private Double totaleDesActes;
    private Double totalePaye;
    private Double credit;



    public SituationFinanciere() {
        super();
    }
}