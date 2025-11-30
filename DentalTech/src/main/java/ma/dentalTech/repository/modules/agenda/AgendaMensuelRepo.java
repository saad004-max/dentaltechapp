package ma.dentalTech.repository.modules.agenda;

import ma.dentalTech.entities.AgendaMensuel;
import ma.dentalTech.entities.Medecin;
import java.util.Optional;

public interface AgendaMensuelRepo {

    AgendaMensuel save(AgendaMensuel agenda);

    Optional<AgendaMensuel> findByMedecin(Medecin medecin);

    Optional<AgendaMensuel> findById(Long id);

}