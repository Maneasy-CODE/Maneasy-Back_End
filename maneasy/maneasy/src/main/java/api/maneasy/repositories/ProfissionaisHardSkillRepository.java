package api.maneasy.repositories;

import api.maneasy.models.ProfissionaisHardSkillModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProfissionaisHardSkillRepository extends JpaRepository<ProfissionaisHardSkillModel, UUID> {

}
