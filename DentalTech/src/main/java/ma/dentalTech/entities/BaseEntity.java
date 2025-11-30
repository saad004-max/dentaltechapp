package ma.dentalTech.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class BaseEntity {

    private Long idEntité;
    private LocalDate dateCréation;
    private LocalDateTime dateDernièreModification;
    private String modifiéPar;
    private String crééPar;

    // ... Constructeur, Getters et Setters ...
}