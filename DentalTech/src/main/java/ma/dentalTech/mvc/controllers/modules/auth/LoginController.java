package ma.dentalTech.mvc.controllers.modules.auth; // Adjust this package declaration if necessary

import ma.dentalTech.repository.modules.auth.UserService ; // <--- ADD THIS IMPORT
import ma.dentalTech.entities.Utilisateur; // <--- ADD THIS IMPORT

public class LoginController {

    private final UserService userService; // Resolved by import

    public LoginController(UserService userService) {
        this.userService = userService;
    }

    public void handleLogin(String login, String password) {
        try {
            // Error "Cannot resolve method 'authenticate(String, String)'" resolved by UserService import
            Utilisateur authenticatedUser = userService.authenticate(login, password);

            // Error "Cannot resolve method 'getNom' in 'Utilisateur'" resolved by Utilisateur import
            System.out.println("Connexion réussie! Bienvenue " + authenticatedUser.getNom());

        } catch (SecurityException e) {
            System.err.println("Échec de la connexion: " + e.getMessage());
        }
    }
}