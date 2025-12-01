package ma.dentalTech.entities;

import java.util.List;
import java.time.Month;

public abstract class AgendaMensuel extends BaseEntity {

    private List<Jour> joursNonDisponible;

    private Medecin medecin;


}