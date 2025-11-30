package ma.dentalTech.entities.Dossier;

import ma.dentalTech.entities.BaseEntity;
import java.time.LocalDate;

public class Ordonnance extends BaseEntity {

    private Long idOrd;
    private LocalDate date;

    // Association vers DossierMédicale (relation 1-N)
    // Association vers Liste de Prescriptions (relation 1-N)

    public Ordonnance() {
        super();
    }
    // ... Getters et Setters ...
}