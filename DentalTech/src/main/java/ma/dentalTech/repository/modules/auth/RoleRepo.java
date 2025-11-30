package ma.dentalTech.repository.modules.auth;

import ma.dentalTech.entities.Role;
import java.util.Optional;

public interface RoleRepo {

    Role save(Role role);
    Optional<Role> findById(Long id);
    Optional<Role> findByLibelle(String libelle);
}