package api.maneasy.models;

public enum StatusProfissional {
    ATIVO("ativo"),
    INATIVO("inativo"),
    FERIAS("ferias"),
    AFASTADO("afastado");
    private String statusProfissional;

    StatusProfissional(String statusProfissionalRecebido){
        this.statusProfissional = statusProfissionalRecebido;
    }

    public String getRole(){
        return statusProfissional;
    }
}
