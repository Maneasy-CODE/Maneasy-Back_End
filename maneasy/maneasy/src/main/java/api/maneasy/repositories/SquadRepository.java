package api.maneasy.repositories;

import api.maneasy.models.SquadModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SquadRepository extends JpaRepository<SquadModel, UUID> {

}