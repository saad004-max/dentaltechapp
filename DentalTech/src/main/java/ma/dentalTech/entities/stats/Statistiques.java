package ma.dentalTech.entities.stats;

import ma.dentalTech.entities.BaseEntity;
import java.time.LocalDate;
// Importez votre Enum CategorieStatistiqueEnum

public class Statistiques extends BaseEntity {

    private Long id;
    private String nom;
    // private CategorieStatistiqueEnum catégorie;
    private Double chiffre;
    private LocalDate dateCalcul;

    // Association vers Médecin ou Cabinet (pour savoir qui/où la stat s'applique)

    public Statistiques() {
        super();
    }
    // ... Getters et Setters ...
}