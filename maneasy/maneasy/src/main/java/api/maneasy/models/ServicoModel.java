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
<<<<<<< HEAD

    @Column(name = "id_servicos", nullable = false)
    private UUID id;


    private String nome_servicos;
    private Date data_criacao;
    private Date data_inicio;
    private Date data_termino;
    private String descricao_servicos;
    private float orcamento;
    private int tempo_servico;
    private String anexo;
    private boolean tipo_servicos;
=======
    @Column(name = "id_servico", nullable = false)
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
    private Boolean tipoServicos;
>>>>>>> 89159e1e202fa78e723e8c0bd9c081bc12d2f5e0
    private String consultoria;
    private String statusServicos;

}