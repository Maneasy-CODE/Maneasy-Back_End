package api.maneasy.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Date;
import java.util.UUID;

public record ProfissionalDto(
        @NotBlank String statusProfissional,
        Date inicioFerias,
        Date terminoFerias,
        Short jornadaTrabalhoProfissional,
        Short horaExtra,
        @NotNull UUID id_profissional
) { }
