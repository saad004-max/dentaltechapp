package ma.dentalTech.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;


public abstract class Utilisateur extends BaseEntity {

    public String login;
    public String motDePass;
    public LocalDate lastLoginDate;
    public Role role; // The field whose setter/getter is causing issues


    public String getMotDePass() {
        return motDePass;
    }
    public void setMotDePass(String motDePass) {
        this.motDePass = motDePass;
    }

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    public void setLastLoginDate(LocalDate lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public LocalDate getLastLoginDate() {
        return lastLoginDate;
    }
    public Role getRole() {
        return role;
    }


    public Utilisateur() {

    }
}