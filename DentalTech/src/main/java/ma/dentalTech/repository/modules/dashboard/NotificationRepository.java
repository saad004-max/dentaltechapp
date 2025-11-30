package ma.dentalTech.repository.modules.dashboard;

import ma.dentalTech.entities.system.Notification;
import ma.dentalTech.entities.Utilisateur;
import java.util.List;
import java.util.Optional;

public interface NotificationRepository {

    Notification save(Notification notification);
    Optional<Notification> findById(Long id);

    List<Notification> findAllByUtilisateur(Utilisateur utilisateur);

    void markAsRead(Notification notification);
    List<Notification> findByReadStatus(boolean isRead);
}