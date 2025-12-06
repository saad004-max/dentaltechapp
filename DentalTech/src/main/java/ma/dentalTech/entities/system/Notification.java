package ma.dentalTech.entities.system;

import ma.dentalTech.entities.BaseEntity;
import java.time.LocalDate;
import java.time.LocalTime;

public abstract class Notification extends BaseEntity {

    private Long id;
    private String message;
    private LocalDate date;
    private LocalTime time;

    private String description;


    public Notification() {
        super();
    }
}