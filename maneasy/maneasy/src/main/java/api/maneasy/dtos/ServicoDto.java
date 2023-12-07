package api.maneasy.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.websocket.Decoder;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

public record ServicoDto (
        @NotBlank String nomeServicos,
        @NotNull Date dataCriacao,
        @NotNull Date dataInicio,
        @NotNull Date dataTermino,
        @NotBlank String descricaoServicos,
        @NotBlank BigDecimal orcamento,
        //Fazer logica de tempo com tipo de serviço, se uma quantidade um tipo, se outra quantidade, outro tipo
        //+640h é do tipo projeto e menos é do tipo demanda
        @NotNull int tempoServico,
        @NotNull String anexo,
        Boolean tipoServicos,
        @NotBlank String Consultoria,
        @NotBlank byte statusServicos
) {

}
