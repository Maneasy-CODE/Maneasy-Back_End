package api.maneasy.dtos;

import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public record SquadDto(
        UUID id_servicos
) {
}
