package api.maneasy.repositories;

import api.maneasy.models.DadosVolkswagenModel;
import api.maneasy.models.HardSkillModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DadosVolkswagenRepository extends JpaRepository<DadosVolkswagenModel, UUID> {
}
