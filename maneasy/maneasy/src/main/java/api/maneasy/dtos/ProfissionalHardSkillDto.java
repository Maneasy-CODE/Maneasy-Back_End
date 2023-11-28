package api.maneasy.dtos;

import jakarta.validation.constraints.NotBlank;

import java.util.UUID;

public record ProfissionalHardSkillDto(

        @NotBlank UUID id_profissional,
        @NotBlank UUID id_hard_skill

) {
}
