package api.maneasy.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.websocket.Decoder;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

public record ServicoDto (
<<<<<<< HEAD
     @NotBlank String nome_servicos,
    @NotBlank Date data_criacao,
    @NotBlank Date data_inicio,
    @NotBlank Date data_termino,
    @NotBlank String descricao_servicos,
    @NotBlank float orcamento,
    @NotBlank int tempo_servico,
    String anexo,
    boolean tipo_servicos,
=======
        @NotBlank String nomeServicos,
    @NotNull Date dataCriacao,
    @NotNull Date dataInicio,
    @NotNull Date dataTermino,
    @NotBlank String descricaoServicos,
    @NotBlank BigDecimal orcamento,
    @NotNull int tempoServico,
    @NotNull String anexo,
    Boolean tipoServicos,
>>>>>>> 89159e1e202fa78e723e8c0bd9c081bc12d2f5e0
    String consultoria,
        @NotBlank String statusServicos
){

}
