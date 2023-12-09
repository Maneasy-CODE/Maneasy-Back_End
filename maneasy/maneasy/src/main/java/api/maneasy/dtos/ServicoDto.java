package api.maneasy.dtos;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.util.Date;

public record ServicoDto (
        @NotBlank String nome_servicos,
        Date data_criacao,
        Date data_inicio,
        Date data_termino,
        String descricao_servicos,
        @DecimalMin(value = "0.0", inclusive = false) BigDecimal orcamento,
        int tempo_servico,
        String anexo,
        Boolean tipo_servicos,
        @NotBlank String Consultoria,
        byte status_servicos
) {

}