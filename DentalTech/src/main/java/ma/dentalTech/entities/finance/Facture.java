package ma.dentalTech.entities.finance;

import ma.dentalTech.entities.BaseEntity;
import java.time.LocalDateTime;


public abstract class Facture extends BaseEntity {

    private Long idFature;
    private Double totaleFacture;
    private Double totalePaye;
    private Double reste;
    private LocalDateTime dateFacture;


    public Facture() {
        super();
    }
}