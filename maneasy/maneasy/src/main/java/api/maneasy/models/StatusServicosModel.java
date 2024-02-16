package api.maneasy.models;

public enum StatusServicosModel {
    ABERTO("aberto"),
    ANDAMENTO("em andamento"),
    FINALIZADO("finalizado");
    private String statusServico;

    StatusServicosModel(String statusRecebido){
        this.statusServico = statusRecebido;
    }

    public String getRole(){
        return statusServico;
    }
}
