package ma.dentalTech.repository.modules.auth;

import ma.dentalTech.entities.Medecin;
import java.util.Optional;
import java.util.List;

public interface MedecinRepo {


    Medecin save(Medecin medecin);

    Optional<Medecin> findById(Long id);

    List<Medecin> findBySpecialite(String specialite);


    Optional<Medecin> findByAgendaMensuelId(Long agendaId);

}