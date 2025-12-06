package ma.dentalTech.repository.modules.dossierMedical;

import ma.dentalTech.entities.Dossier.DossierMedical;
import ma.dentalTech.entities.patient.Patient;
import java.util.Optional;
import java.util.List;

public interface DossierMedicalRepository {

    DossierMedical save(DossierMedical dossier);
    Optional<DossierMedical> findById(Long id);

    Optional<DossierMedical> findByPatient(Patient patient);

    List<DossierMedical> findAllByPatient(Patient patient);
}