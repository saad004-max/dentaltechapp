package ma.dentalTech.entities.Dossier;

import ma.dentalTech.entities.BaseEntity;
import java.time.LocalDate;

public abstract class Certificat extends BaseEntity {

    private Long idCertif;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private int durée;
    private String noteMedecin;

    // Association vers DossierMédicale (relation 1-N)

    public Certificat() {
        super();
    }
    // ... Getters et Setters ...
}