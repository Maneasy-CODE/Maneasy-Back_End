package api.maneasy.models;

public enum TipoModel {
    ADMIN("admin"),
    GESTOR("gestor"),
    PROFISSIONAL("profissional"),
    COMUM("comum");

    private String tipo;

    TipoModel(String tipoRecebido){
        this.tipo = tipoRecebido;
    }

    public String getRole(){
        return tipo;
    }
}