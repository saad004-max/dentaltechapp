package ma.dentalTech.entities;

// Importez votre entité AgendaDocteur ou AgendaMensuel
// import ma.dentalTech.entities.agenda.AgendaMensuel;

public class Medecin extends Utilisateur {

    private String spécialité;
    private AgendaMensuel agendaMensuel;

    public Medecin() {
        super();
    }

    // ... Getters et Setters ...
}