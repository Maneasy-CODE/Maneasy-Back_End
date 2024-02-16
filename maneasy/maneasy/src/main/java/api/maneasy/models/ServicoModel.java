package api.maneasy.models;

import jakarta.persistence.*;
import jakarta.websocket.Decoder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "tb_servicos")
public class ServicoModel implements Serializable{
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_servicos", nullable = false)
    private UUID id;
    private String nomeServicos;
    @Temporal(TemporalType.DATE)
    private Date dataCriacao;
    @Temporal(TemporalType.DATE)
    private Date dataInicio;
    @Temporal(TemporalType.DATE)
    private Date dataTermino;
    private String descricaoServicos;
    private BigDecimal orcamento;
    private int tempoServico;
    private String anexo;
    @Enumerated(EnumType.ORDINAL)
    private TipoServicoModel tipoServicos;
    private String consultoria;
    private StatusServicosModel statusServicos;

}