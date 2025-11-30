package ma.dentalTech.repository.modules.auth;

import ma.dentalTech.entities.Utilisateur; // Importez l'entité Utilisateur
import java.util.List;
import java.util.Optional;

public interface UserRepo {


    Utilisateur save(Utilisateur user);

    Optional<Utilisateur> findById(Long id);

    List<Utilisateur> findAll();

    void delete(Utilisateur user);



    Optional<Utilisateur> findByLogin(String login);


    List<Utilisateur> findByRole(String role);


    Optional<Utilisateur> findByCin(String cin);
}