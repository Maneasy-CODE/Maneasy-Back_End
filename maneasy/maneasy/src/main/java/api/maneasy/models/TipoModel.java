package api.maneasy.models;

public enum TipoModel {
    ADMINISTRADOR("adm"),
    GESTOR("gestor"),
    PROFISSIONAL("prof"),
    COMUM("comum");

    private String tipo;

    TipoModel(String tipoRecebido){
        this.tipo = tipoRecebido;
    }
    public String getRole(){
        return tipo;
    }
}