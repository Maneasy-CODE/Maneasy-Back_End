package api.maneasy.dtos;

import api.maneasy.models.TipoModel;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record UsuarioDto(
        @NotBlank String nome_usuario,

        @NotBlank @Email(message = "O email deve estar no formato válido") String email,

        @NotBlank String chapa,

        @NotBlank String senha,

        @NotNull TipoModel tipos_usuario
)
{

}
