package ma.dentalTech.entities;

import java.util.List;
import java.time.Month;

public class AgendaMensuel extends BaseEntity {

    private List<Jour> joursNonDisponible; // Jours Non Disponible: List<Jour>

    private Medecin medecin; // Le médecin auquel cet agenda appartient


}