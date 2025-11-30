package ma.dentalTech.repository.modules.auth;

import ma.dentalTech.entities.Medecin; // Assurez-vous d'avoir l'entité Medecin
import java.util.Optional;
import java.util.List;

public interface MedecinRepo {

    // --- Opérations Spécifiques aux Médecins ---

    /** Sauvegarde un Médecin (création ou mise à jour). */
    Medecin save(Medecin medecin);

    /** Trouve un Médecin par son identifiant. */
    Optional<Medecin> findById(Long id);

    /** Recherche un Médecin par sa spécialité. */
    List<Medecin> findBySpecialite(String specialite); // Basé sur l'attribut spécialité

    /** * Récupère un Médecin en utilisant l'ID de son Agenda Mensuel.
     * Utile pour la gestion de l'Agenda.
     */
    Optional<Medecin> findByAgendaMensuelId(Long agendaId);

    // Note : Les méthodes comme findByLogin() seront souvent implémentées
    // par l'implémentation concrète qui gère l'héritage de l'Utilisateur.
}