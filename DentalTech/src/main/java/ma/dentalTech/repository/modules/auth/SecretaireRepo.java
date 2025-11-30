package ma.dentalTech.repository.modules.auth;

import ma.dentalTech.entities.Secretaire; // Assurez-vous d'avoir l'entité Secretaire
import java.util.Optional;
import java.util.List;

public interface SecretaireRepo {

    // --- Opérations Spécifiques aux Secrétaires ---

    /** Sauvegarde une Secrétaire (création ou mise à jour). */
    Secretaire save(Secretaire secretaire);

    /** Trouve une Secrétaire par son identifiant. */
    Optional<Secretaire> findById(Long id);

    /** Recherche une Secrétaire par son numéro CNSS (spécifique à l'entité) */
    Optional<Secretaire> findByNumCnss(String numCnss); // Basé sur l'attribut numCNSS

    /** Recherche toutes les secrétaires (peut être utile pour l'administration). */
    List<Secretaire> findAll();
}