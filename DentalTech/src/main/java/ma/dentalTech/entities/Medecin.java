package ma.dentalTech.entities;


import ma.dentalTech.entities.agenda.AgendaMensuel;

public abstract class Medecin extends Utilisateur {

    private String specialite;
    private AgendaMensuel agendaMensuel;

    public Medecin() {
        super();
    }

}