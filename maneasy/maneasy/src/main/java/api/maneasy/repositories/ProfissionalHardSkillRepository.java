package api.maneasy.repositories;

import api.maneasy.models.ProfissionalHardSkillModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProfissionalHardSkillRepository extends JpaRepository<ProfissionalHardSkillModel, UUID> {
    ProfissionalHardSkillModel findById_profissional ();

}
