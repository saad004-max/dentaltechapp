package ma.dentalTech.entities.stats;

import ma.dentalTech.entities.BaseEntity;
import java.time.LocalDate;

public abstract class Statistiques extends BaseEntity {

    private Long id;
    private String nom;
    private Double chiffre;
    private LocalDate dateCalcul;


    public Statistiques() {
        super();
    }
}