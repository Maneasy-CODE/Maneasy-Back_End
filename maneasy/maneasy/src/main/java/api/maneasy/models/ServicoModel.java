package api.maneasy.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
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
    private String nome_servicos;
    @Temporal(TemporalType.DATE)
    private Date data_criacao;
    @Temporal(TemporalType.DATE)
    private Date data_inicio;
    @Temporal(TemporalType.DATE)
    private Date data_termino;
    private String descricao_servicos;
    private BigDecimal orcamento;
    private int tempo_servico;
    private String anexo;
    private Boolean tipo_servicos;
    private String consultoria;
    private byte status_servicos;

}