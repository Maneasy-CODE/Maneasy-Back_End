package api.maneasy.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "tb_dados_volkswagen")
public class DadosVolkswagenModel implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_dados_volkswagen", nullable = false)
    private UUID id_dados_volkswagen;
    private String chapa_usuario;
    private String nome_usuario;
    private String email;
    private String tipos_usuario;

}
