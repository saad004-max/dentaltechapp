package ma.dentalTech.repository.modules.medicament;

import ma.dentalTech.entities.Medicament;
import java.util.List;
import java.util.Optional;

public interface MedicamentRepository {

    Medicament save(Medicament medicament); // Gère l'ajout de médicaments au catalogue
    Optional<Medicament> findById(Long id);
    List<Medicament> findAll();

    // Recherche de médicaments dans le catalogue
    List<Medicament> findByNomContaining(String nom);
    List<Medicament> findByLaboratoire(String laboratoire);
}