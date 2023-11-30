package api.maneasy.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public record UsuarioDto(
        @NotBlank String nome_usuario,

        @NotBlank @Email(message = "O email deve estar no formato válido") String email,

        @NotBlank String chapa_usuario,

        @NotBlank String senha,

        @NotBlank String tipos_usuario,

        UUID id_usuario
)
{

}
