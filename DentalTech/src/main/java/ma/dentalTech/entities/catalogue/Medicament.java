package ma.dentalTech.entities.catalogue;

import ma.dentalTech.entities.BaseEntity;

public abstract class Medicament extends BaseEntity {

   private Long IdMct;
   private String nom;
   private String laboratoire;
   private String type;
   private boolean remboursable;
   private Double prixUnitaire;
   private String Description;

    public Medicament() {
        super();
    }

}