package ma.dentalTech.repository.modules.agenda;

import ma.dentalTech.entities.Dossier.Consultation;
import ma.dentalTech.entities.Dossier.DossierMedical;
import ma.dentalTech.entities.patient.Patient;
import ma.dentalTech.entities.agenda.RDV;
import java.util.List;
import java.util.Optional;

public interface ConsultationRepository {

    Consultation save(Consultation consultation);
    Optional<Consultation> findById(Long id);


    List<Consultation> findAllByDossierMedical(DossierMedical dossierMedical);

    Optional<Consultation> findByRdvAssocie(RDV rdv);

    List<Consultation> findAllByPatient(Patient patient);
}