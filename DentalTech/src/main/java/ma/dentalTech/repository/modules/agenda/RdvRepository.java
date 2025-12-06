package ma.dentalTech.repository.modules.agenda;

import ma.dentalTech.entities.agenda.RDV;
import ma.dentalTech.entities.Medecin;
import ma.dentalTech.entities.patient.Patient;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface RdvRepository {

    RDV save(RDV rdv);
    Optional<RDV> findById(Long id);
    void delete(RDV rdv);

    List<RDV> findAllByMedecinAndDate(Medecin medecin, LocalDate date); // Visualiser le calendrier par jour
    List<RDV> findAllByPatient(Patient patient);

    List<RDV> findByDateAndHeureBetween(LocalDate date, java.time.LocalTime startTime, java.time.LocalTime endTime);
}