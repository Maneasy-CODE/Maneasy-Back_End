package api.maneasy.repositories;

import api.maneasy.models.ProfissionalModel;
import api.maneasy.models.ServicoModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ServicoRepository extends JpaRepository<ServicoModel, UUID> {
}
