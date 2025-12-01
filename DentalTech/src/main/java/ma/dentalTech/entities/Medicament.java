package ma.dentalTech.entities;

public class Medicament extends BaseEntity {

    private Long idMct;
    private String nom;
    private String laboratoire;
    private String type;
    private String forme;
    private boolean remboursable;
    private Double prixUnitaire;
    private String description;

    public Medicament() {
        super();
    }


    public Long getIdMct() {
        return idMct;
    }

    public void setIdMct(Long idMct) {
        this.idMct = idMct;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getLaboratoire() {
        return laboratoire;
    }

    public void setLaboratoire(String laboratoire) {
        this.laboratoire = laboratoire;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getForme() {
        return forme;
    }

    public void setForme(String forme) {
        this.forme = forme;
    }

    public boolean isRemboursable() {
        return remboursable;
    }

    public void setRemboursable(boolean remboursable) {
        this.remboursable = remboursable;
    }

    public Double getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(Double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}