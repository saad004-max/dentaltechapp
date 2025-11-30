package ma.dentalTech.entities;

import java.util.List;

// Importez votre Enum RoleEnum si nécessaire

public class Role extends BaseEntity {

    private Long idRole;
    // private RoleEnum libellé;
    private List<String> privilèges;

    // Association vers Utilisateur (relation N-1 ou N-N selon la gestion des rôles)

    public Role() {
        super();
    }
    // ... Getters et Setters ...
}