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
@Table(name = "tb_chamado")
public class ChamadoModel implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(
            name = "id_chamado",
            nullable = false
    )
    private UUID id;
    private String setor;
    private String nome_solicitante;
    private String chapa_usuario;
    private String nome_atendente;
    private Date data_criacao;
    private Date data_inicio;
    private Date data_termino;
    private String descricao_chamado;
    private String anexo;
    private String url_img;

//    public UUID getId() {
//        return this.id;
//    }
//
//    public String getSetor() {
//        return this.setor;
//    }
//
//    public String getNome_solicitante() {
//        return this.nome_solicitante;
//    }
//
//    public String getChapa_usuario() {
//        return this.chapa_usuario;
//    }
//
//    public String getNome_atendente() {
//        return this.nome_atendente;
//    }
//
//    public Date getData_criacao() {
//        return this.data_criacao;
//    }
//
//    public Date getData_inicio() {
//        return this.data_inicio;
//    }
//
//    public Date getData_termino() {
//        return this.data_termino;
//    }
//
//    public String getDescricao_chamado() {
//        return this.descricao_chamado;
//    }
//
//    public String getAnexo() {
//        return this.anexo;
//    }
//
//    public String getUrl_img() {
//        return this.url_img;
//    }
//
//    public void setId(final UUID id) {
//        this.id = id;
//    }
//
//    public void setSetor(final String setor) {
//        this.setor = setor;
//    }
//
//    public void setNome_solicitante(final String nome_solicitante) {
//        this.nome_solicitante = nome_solicitante;
//    }
//
//    public void setChapa_usuario(final String chapa_usuario) {
//        this.chapa_usuario = chapa_usuario;
//    }
//
//    public void setNome_atendente(final String nome_atendente) {
//        this.nome_atendente = nome_atendente;
//    }
//
//    public void setData_criacao(final Date data_criacao) {
//        this.data_criacao = data_criacao;
//    }
//
//    public void setData_inicio(final Date data_inicio) {
//        this.data_inicio = data_inicio;
//    }
//
//    public void setData_termino(final Date data_termino) {
//        this.data_termino = data_termino;
//    }
//
//    public void setDescricao_chamado(final String descricao_chamado) {
//        this.descricao_chamado = descricao_chamado;
//    }
//
//    public void setAnexo(final String anexo) {
//        this.anexo = anexo;
//    }
//
//    public void setUrl_img(final String url_img) {
//        this.url_img = url_img;
//    }
}