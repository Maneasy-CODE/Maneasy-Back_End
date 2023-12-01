package api.maneasy.repositories;

import api.maneasy.models.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.security.core.userdetails.UserDetails;

import java.util.UUID;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, UUID> {
    UsuarioModel findByEmail(String email);
    UsuarioModel findByChapa(String chapa);

}