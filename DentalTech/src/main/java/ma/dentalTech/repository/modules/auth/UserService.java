package ma.dentalTech.repository.modules.auth;

import ma.dentalTech.entities.Role;
import ma.dentalTech.entities.Utilisateur;
import ma.dentalTech.repository.modules.auth.RoleRepo;
import ma.dentalTech.repository.modules.auth.UserRepo;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class UserService {

    private final UserRepo userRepo;
    private final RoleRepo roleRepo;

    public UserService(UserRepo userRepo, RoleRepo roleRepo) {
        this.userRepo = userRepo;
        this.roleRepo = roleRepo;
    }

    public Utilisateur authenticate(String login, String password) throws SecurityException {
        Optional<Utilisateur> optionalUser = userRepo.findByLogin(login);

        if (optionalUser.isEmpty()) {
            throw new SecurityException("Identifiant incorrect ou utilisateur non trouvé.");
        }

        Utilisateur user = optionalUser.get();

        if (!user.getMotDePass().equals(password)) {
            throw new SecurityException("Mot de passe incorrect.");
        }

        user.setLastLoginDate(LocalDate.now());
        userRepo.save(user);

        return user;
    }

    public Utilisateur ajouterUtilisateur(Utilisateur newUser, String roleLibelle) {
        if (userRepo.findByLogin(newUser.getLogin()).isPresent()) {
            throw new IllegalArgumentException("Le login est déjà utilisé par un autre compte.");
        }

        Optional<Role> optionalRole = roleRepo.findByLibelle(roleLibelle);
        if (optionalRole.isEmpty()) {
            throw new IllegalArgumentException("Le rôle spécifié n'existe pas.");
        }

        newUser.setRole(optionalRole.get());

        return userRepo.save(newUser);
    }

    public Utilisateur reinitialiserMotDePasse(Long userId, String newPassword) throws Exception {
        Utilisateur user = userRepo.findById(userId)
                .orElseThrow(() -> new Exception("Utilisateur introuvable."));

        return userRepo.save(user);
    }

    public Utilisateur modifierPermission(Long userId, List<String> newPermissions) throws Exception {
        Utilisateur user = userRepo.findById(userId)
                .orElseThrow(() -> new Exception("Utilisateur introuvable."));

        return userRepo.save(user);
    }

    public List<Utilisateur> getListeUtilisateurs() {
        return userRepo.findAll();
    }

    public Utilisateur setCompteStatus(Long userId, boolean isActive) throws Exception {
        Utilisateur user = userRepo.findById(userId)
                .orElseThrow(() -> new Exception("Utilisateur introuvable."));

        return userRepo.save(user);
    }
}