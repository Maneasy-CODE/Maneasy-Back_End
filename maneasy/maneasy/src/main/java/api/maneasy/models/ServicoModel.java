package api.maneasy.models;

import jakarta.persistence.*;
import jakarta.websocket.Decoder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "tb_servicos")
public class ServicoModel implements Serializable, UserDatails {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "id_servico", nullable = false)
    private UUID id;

    private boolean id_servicos;
    private String nome_servicos;
    private Date data_criacao;
    private Date data_inicio;
    private Date data_termino;
    private String descricao_servicos;
    private float orcamento;
    private int tempo_servico;
    private String anexo;
    private Decoder.Binary tipo_servicos;
    private String consultoria;
    private Enum status_servicos;

}