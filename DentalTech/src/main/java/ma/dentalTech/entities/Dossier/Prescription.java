package ma.dentalTech.entities.Dossier;

import ma.dentalTech.entities.BaseEntity;

public class Prescription extends BaseEntity {

    private Long idPr;
    private int quantité;
    private String fréquence;
    private int duréeEnJours;

    // Association vers Médicament (relation N-1)
    // Association vers Ordonnance (relation N-1)

    public Prescription() {
        super();
    }
    // ... Getters et Setters ...
}