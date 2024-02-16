package api.maneasy.dtos;

import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public record ProfissionalSquadsDto(
        UUID id_profissionais_squads,
        UUID id_profissional,
        @NotNull UUID id_squads
) {
}
