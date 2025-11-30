package ma.dentalTech.repository.modules.actes;

import ma.dentalTech.entities.Dossier.Acte;
import java.util.List;
import java.util.Optional;

public interface ActeRepository {

    Acte save(Acte acte);
    Optional<Acte> findById(Long id);
    void delete(Acte acte);

    List<Acte> findAll();

    List<Acte> findByLibelleContaining(String libelle);
    List<Acte> findByCategorie(String categorie);
}