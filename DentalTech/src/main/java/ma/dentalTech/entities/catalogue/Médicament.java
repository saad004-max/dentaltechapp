package ma.dentalTech.entities.catalogue;

import ma.dentalTech.entities.BaseEntity;
// Importez votre Enum FormeEnum

public class Médicament extends BaseEntity {

   private Long IdMct;
   private String nom;
   private String laboratoire;
   private String type;
   //private FormeEnum forme;
   private boolean remboursable;
   private Double prixUnitaire;
   private String Description;

    public Médicament() {
        super();
    }

    // ... Getters et Setters ...
}