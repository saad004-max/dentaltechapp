package ma.dentalTech.repository.modules.caisse;

import ma.dentalTech.entities.finance.SituationFinanciere;
import ma.dentalTech.entities.patient.Patient;
import java.util.Optional;

public interface SituationFinanciereRepository {

    SituationFinanciere save(SituationFinanciere situation);
    Optional<SituationFinanciere> findById(Long id);

    Optional<SituationFinanciere> findByPatient(Patient patient);
}