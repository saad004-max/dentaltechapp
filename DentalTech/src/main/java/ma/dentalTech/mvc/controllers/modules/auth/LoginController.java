package ma.dentalTech.mvc.controllers.modules.auth;

import ma.dentalTech.repository.modules.auth.UserService ;
import ma.dentalTech.entities.Utilisateur;

public class LoginController {

    private final UserService userService;

    public LoginController(UserService userService) {
        this.userService = userService;
    }

    public void handleLogin(String login, String password) {
        try {
            Utilisateur authenticatedUser = userService.authenticate(login, password);

            System.out.println("Connexion reussie! Bienvenue " + authenticatedUser.getNom());

        } catch (SecurityException e) {
            System.err.println("Echec de la connexion: " + e.getMessage());
        }
    }
}