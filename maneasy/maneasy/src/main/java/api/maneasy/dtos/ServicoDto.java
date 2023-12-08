package api.maneasy.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.Date;

public record ServicoDto (
        @NotBlank String nome_servicos,
        @NotNull Date data_criacao,
        @NotNull Date data_inicio,
        @NotNull Date data_termino,
        @NotBlank String descricao_servicos,
        @NotBlank BigDecimal orcamento,
        @NotNull int tempo_servico,
        @NotNull String anexo,
        Boolean tipo_servicos,
        @NotBlank String Consultoria,
        @NotBlank byte status_servicos
) {

}
