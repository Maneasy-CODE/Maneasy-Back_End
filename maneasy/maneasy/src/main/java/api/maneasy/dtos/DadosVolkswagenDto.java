package api.maneasy.dtos;

import java.util.UUID;

public record DadosVolkswagenDto(
        UUID id_dados_volkswagen,
        String chapa_usuario,
        String nome_usuario,
        String email,
        String tipos_usuario

) {
}
