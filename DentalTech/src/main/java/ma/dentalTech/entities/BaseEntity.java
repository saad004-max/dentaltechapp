package ma.dentalTech.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class BaseEntity {

    public Long idEntite;
    public LocalDate dateCreation;
    public LocalDateTime dateDerniereModification;
    public String modifiePar;
    public String creePar;

    public abstract String getNom();
}
