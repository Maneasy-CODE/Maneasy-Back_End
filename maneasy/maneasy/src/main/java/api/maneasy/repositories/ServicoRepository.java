package api.maneasy.repositories;


import api.maneasy.models.ServicoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ServicoRepository extends JpaRepository<ServicoModel, UUID> {
    @Query("SELECT s FROM ServicoModel s WHERE LOWER(s.nome_servicos) LIKE LOWER(CONCAT('%', :nome_servicos, '%'))")
    List<ServicoModel> findByNome_servicosContainingIgnoreCase(@Param("nome_servicos") String nomeServicos);
}
