package ma.dentalTech.repository.modules.caisse;

import ma.dentalTech.entities.finance.Facture;
import ma.dentalTech.entities.patient.Patient;
import java.util.List;
import java.util.Optional;

public interface FactureRepository {

    Facture save(Facture facture);
    Optional<Facture> findById(Long id);
    void delete(Facture facture);


    List<Facture> findAllByPatient(Patient patient);
    List<Facture> findByStatus(String status);
}