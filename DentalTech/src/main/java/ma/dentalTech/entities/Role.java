package ma.dentalTech.entities;

import java.util.List;

public class Role extends BaseEntity {

    private Long idRole;
    private List<String> privileges;

    public Role() {}
}