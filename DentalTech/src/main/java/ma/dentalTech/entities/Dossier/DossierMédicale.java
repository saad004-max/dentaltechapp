package ma.dentalTech.entities.dossier;

import ma.dentalTech.entities.BaseEntity;
import java.time.LocalDate;

public class DossierMédicale extends BaseEntity {

    private Long IdDM;
    private LocalDate dateDeCréation;

    // Association vers Patient (relation 1-1, implicite dans le diagramme)

    public DossierMédicale() {
        super();
    }

    // ... Getters et Setters ...
}