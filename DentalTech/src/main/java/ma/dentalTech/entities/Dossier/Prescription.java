package ma.dentalTech.entities.Dossier;

import ma.dentalTech.entities.BaseEntity;

public abstract class Prescription extends BaseEntity {

    private Long idPr;
    private int quantite;
    private String frequence;
    private int dureeEnJours;


    public Prescription() {
        super();
    }
}