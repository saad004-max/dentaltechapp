package ma.dentalTech.entities.agenda;

import ma.dentalTech.entities.BaseEntity;
import ma.dentalTech.entities.Jour;
import ma.dentalTech.entities.Medecin;

import java.util.List;

public abstract class AgendaMensuel extends BaseEntity {

    private List<Jour> joursNonDisponible;

    private Medecin medecin;


}