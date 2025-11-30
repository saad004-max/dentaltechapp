package ma.dentalTech.entities.Dossier;

import ma.dentalTech.entities.BaseEntity;


public abstract class Acte extends BaseEntity {

    private Long idActe;
    private String libelle;
    // private CategorieActeEnum catégorie;
    private Double prixDeBase;

    public Acte() {
        super();
    }
    // ... Getters et Setters ...
}