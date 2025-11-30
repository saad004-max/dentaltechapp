package ma.dentalTech.entities.system;

import ma.dentalTech.entities.BaseEntity;
import java.time.LocalDate;
import java.time.LocalTime;
// Importez vos Enums TitreNotificationEnum, TypeNotificationEnum, PrioritéEnum

public abstract class Notification extends BaseEntity {

    private Long id;
    // private TitreNotificationEnum titre;
    private String message;
    private LocalDate date;
    private LocalTime time;
    // private TypeNotificationEnum type; // type: Enum
    // private PrioritéEnum Priorité; // Priorité: Enum
    private String description;

    // Association vers Utilisateur (le destinataire)

    public Notification() {
        super();
    }
    // ... Getters et Setters ...
}