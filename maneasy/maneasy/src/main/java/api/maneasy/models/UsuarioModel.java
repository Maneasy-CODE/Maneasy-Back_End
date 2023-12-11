package api.maneasy.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serial;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "tb_usuarios")
public class UsuarioModel implements Serializable, UserDetails {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_usuario", nullable = false)
    private UUID id;

    private String nome_usuario;
    @Column(name = "chapa_usuario", nullable = false)
    private String chapa;
    private String email;
    private String senha;
    @Enumerated(EnumType.STRING)
    private TipoModel tipos_usuario;

    public UsuarioModel() {
    }

    public UsuarioModel(String nome_usuario, String chapa, String email, String senha, TipoModel tipos_usuario) {
        this.nome_usuario = nome_usuario;
        this.chapa = chapa;
        this.email = email;
        this.senha = senha;
        this.tipos_usuario = tipos_usuario;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        if (this.tipos_usuario == TipoModel.ADMIN){
            return List.of(
                    new SimpleGrantedAuthority("ROLE_ADMIN"),
                    new SimpleGrantedAuthority("ROLE_GESTOR"),
                    new SimpleGrantedAuthority("ROLE_PROFISSIONAL"),
                    new SimpleGrantedAuthority("ROLE_COMUM")
            );
        } else if (this.tipos_usuario == TipoModel.GESTOR) {
            return List.of(
                    new SimpleGrantedAuthority("ROLE_GESTOR"),
                    new SimpleGrantedAuthority("ROLE_PROFISSIONAL"),
                    new SimpleGrantedAuthority("ROLE_COMUM")
            );
        } else if (this.tipos_usuario == TipoModel.PROFISSIONAL) {
            return List.of(
                    new SimpleGrantedAuthority("ROLE_PROFISSIONAL")
            );
        } else if (this.tipos_usuario == TipoModel.COMUM) {
            return List.of(
                    new SimpleGrantedAuthority("ROLE_COMUM")
            );
        }

            return null;
    }


    @Override
    public String getPassword() {
        return senha;
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
