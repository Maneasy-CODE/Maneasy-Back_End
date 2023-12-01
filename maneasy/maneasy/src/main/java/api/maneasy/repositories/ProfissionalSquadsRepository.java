package api.maneasy.repositories;

import api.maneasy.models.ProfissionalModel;
import api.maneasy.models.ProfissionalSquadsModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProfissionalSquadsRepository extends JpaRepository<ProfissionalSquadsModel, UUID> {
}
