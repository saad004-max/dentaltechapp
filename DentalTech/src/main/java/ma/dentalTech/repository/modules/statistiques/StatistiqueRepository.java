package ma.dentalTech.repository.modules.statistiques;

import ma.dentalTech.entities.stats.Statistiques;
import java.util.List;
import java.time.LocalDate;
import java.util.Optional;

public interface StatistiqueRepository {

    Statistiques save(Statistiques statistique);
    Optional<Statistiques> findById(Long id);

    Optional<Statistiques> findByNom(String nom);

    // Recuperer les statistiques calculees sur une periode donnée
    List<Statistiques> findByDateCalculBetween(LocalDate debut, LocalDate fin);
}