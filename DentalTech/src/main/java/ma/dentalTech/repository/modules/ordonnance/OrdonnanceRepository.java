package ma.dentalTech.repository.modules.ordonnance;

import ma.dentalTech.entities.Dossier.Ordonnance;
import ma.dentalTech.entities.Dossier.DossierMedical;
import java.util.List;
import java.util.Optional;

public interface OrdonnanceRepository {

    Ordonnance save(Ordonnance ordonnance); // Créer/Modifier une ordonnance
    Optional<Ordonnance> findById(Long id);
    void delete(Ordonnance ordonnance); // Supprimer une ordonnance

    // Lister les ordonnances liées à un dossier spécifique
    List<Ordonnance> findAllByDossierMedical(DossierMedical dossier);
}