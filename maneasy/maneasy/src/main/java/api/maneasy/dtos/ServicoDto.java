package api.maneasy.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.websocket.Decoder;

import java.util.Date;
import java.util.Objects;

public record ServicoDto (
     @NotBlank String nome_servicos,
    @NotBlank Date data_criacao,
    @NotBlank Date data_inicio,
    @NotBlank Date data_termino,
    @NotBlank String descricao_servicos,
    @NotBlank float orcamento,
    @NotBlank int tempo_servico,
    String anexo,
    Decoder.Binary tipo_servicos,
    String consultoria,
     @NotBlank Enum status_servicos
){}
