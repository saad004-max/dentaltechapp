package ma.dentalTech.repository.modules.auth;

import ma.dentalTech.entities.Secretaire; // Assurez-vous d'avoir l'entité Secretaire
import java.util.Optional;
import java.util.List;

public interface SecretaireRepo {


    Secretaire save(Secretaire secretaire);

    Optional<Secretaire> findById(Long id);

    Optional<Secretaire> findByNumCnss(String numCnss); // Basé sur l'attribut numCNSS

    List<Secretaire> findAll();
}