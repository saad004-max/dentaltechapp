package ma.dentalTech.entities;

import java.time.LocalDate;

public class Jour {

    private LocalDate date;
    private String motif;

    // private java.time.LocalTime heureDebut;
    // private java.time.LocalTime heureFin;

    public Jour(LocalDate date, String motif) {
        this.date = date;
        this.motif = motif;
    }

    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public String getMotif() {
        return motif;
    }
    public void setMotif(String motif) {
        this.motif = motif;
    }
}