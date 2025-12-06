package ma.dentalTech.entities.Dossier;

import ma.dentalTech.entities.BaseEntity;
import java.time.LocalDate;

public abstract class Certificat extends BaseEntity {

    private Long idCertif;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private int duree;
    private String noteMedecin;


    public Certificat() {
        super();
    }
}