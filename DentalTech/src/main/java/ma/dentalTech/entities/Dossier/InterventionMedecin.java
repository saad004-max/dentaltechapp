package ma.dentalTech.entities.Dossier;

import ma.dentalTech.entities.BaseEntity;

public abstract class InterventionMedecin extends BaseEntity {

    private Long IdIM;
    private Double prixDePatient;
    private Integer numDent;



    public InterventionMedecin() {

        super();
    }
}