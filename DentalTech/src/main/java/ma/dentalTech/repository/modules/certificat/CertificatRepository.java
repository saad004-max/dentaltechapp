package ma.dentalTech.repository.modules.certificat;

import ma.dentalTech.entities.Dossier.Certificat;
import ma.dentalTech.entities.patient.Patient;
import java.util.List;
import java.util.Optional;

public interface CertificatRepository {

    Certificat save(Certificat certificat);
    Optional<Certificat> findById(Long id);
    void delete(Certificat certificat);

    List<Certificat> findAllByPatient(Patient patient);

    List<Certificat> findByType(String type);
}