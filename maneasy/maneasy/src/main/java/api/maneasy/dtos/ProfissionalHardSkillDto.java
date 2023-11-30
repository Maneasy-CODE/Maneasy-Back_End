package api.maneasy.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public record ProfissionalHardSkillDto(

       UUID id_profissionais_hardskills,
       UUID id_profissional,
       @NotNull UUID id_hard_skill

) {
}
