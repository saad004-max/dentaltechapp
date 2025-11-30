package ma.dentalTech.entities.Dossier;

import ma.dentalTech.entities.BaseEntity;

public abstract class InterventionMedecin extends BaseEntity {

    private Long IdIM;
    private Double prixDePatient;
    private Integer numDent;

    // Association vers Acte (relation N-1)
    // Association vers Consultation (relation N-1)

    public InterventionMedecin() {
        super();
    }
    // ... Getters et Setters ...
}