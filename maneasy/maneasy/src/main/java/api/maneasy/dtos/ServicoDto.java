package api.maneasy.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.websocket.Decoder;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

public record ServicoDto (
        String nomeServicos,
        Date dataCriacao,
        Date dataInicio,
        Date dataTermino,
        String descricaoServicos,
        BigDecimal orcamento,
        int tempoServico,
        String anexo,
        Boolean tipoServicos,
        String Consultoria,
        String statusServicos
) {

}
