package api.maneasy.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "tb_squads")
public class SquadModel implements Serializable{

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_squad", nullable = false)
    private UUID id;

    //@ManyToOne
    //@JoinColumn(name = "id_chamado", referencedColumnName = "id_chamado")
    //private ChamadoModel id_chamado;

    @ManyToOne
    @JoinColumn(name = "id_servicos", referencedColumnName = "id_servicos")
    private ServicoModel id_servicos;

}