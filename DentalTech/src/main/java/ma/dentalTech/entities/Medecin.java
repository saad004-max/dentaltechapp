package ma.dentalTech.entities;

// Importez votre entité AgendaDocteur ou AgendaMensuel
// import ma.dentalTech.entities.agenda.AgendaMensuel;

public abstract class Medecin extends Utilisateur {

    private String specialite;
    private AgendaMensuel agendaMensuel;

    public Medecin() {
        super();
    }

    // ... Getters et Setters ...
}