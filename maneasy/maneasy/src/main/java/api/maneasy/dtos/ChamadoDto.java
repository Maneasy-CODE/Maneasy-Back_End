package api.maneasy.dtos;

import org.springframework.web.multipart.MultipartFile;
import java.util.Date;


public record ChamadoDto(

        MultipartFile anexo, String chapa_usuario, Date data_criacao, Date data_inicio, Date data_termino, String descricao_chamado, String nome_atendente, String nome_solicitante, String setor) {
    public ChamadoDto(MultipartFile anexo, String chapa_usuario, Date data_criacao, Date data_inicio, Date data_termino, String descricao_chamado, String nome_atendente, String nome_solicitante, String setor) {
        this.anexo = anexo;
        this.chapa_usuario = chapa_usuario;
        this.data_criacao = data_criacao;
        this.data_inicio = data_inicio;
        this.data_termino = data_termino;
        this.descricao_chamado = descricao_chamado;
        this.nome_atendente = nome_atendente;
        this.nome_solicitante = nome_solicitante;
        this.setor = setor;
    }

    public MultipartFile anexo() {
        return this.anexo;
    }

    public String chapa_usuario() {
        return this.chapa_usuario;
    }

    public Date data_criacao() {
        return this.data_criacao;
    }

    public Date data_inicio() {
        return this.data_inicio;
    }

    public Date data_termino() {
        return this.data_termino;
    }

    public String descricao_chamado() {
        return this.descricao_chamado;
    }

    public String nome_atendente() {
        return this.nome_atendente;
    }

    public String nome_solicitante() {
        return this.nome_solicitante;
    }

    public String setor() {
        return this.setor;
    }
}