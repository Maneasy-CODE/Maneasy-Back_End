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
@Table(name = "tb_profissionais")
public class ProfissionalModel implements Serializable{
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_profissional", nullable = false)
    private UUID id;

    private StatusProfissional statusProfissional;

    @Temporal(TemporalType.DATE)
    private Date inicioFerias;

    @Temporal(TemporalType.DATE)
    private Date terminoFerias;
    private Short jornadaTrabalhoProfissional;
    private Short horaExtra;

    @ManyToOne
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
    private UsuarioModel usuario;

}
