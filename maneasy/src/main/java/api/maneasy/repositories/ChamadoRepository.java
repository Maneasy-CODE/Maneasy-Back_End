package api.maneasy.repositories;

import api.maneasy.models.ChamadoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ChamadoRepository extends JpaRepository<ChamadoModel, UUID> {
}
