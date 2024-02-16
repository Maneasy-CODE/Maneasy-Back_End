package api.maneasy.models;

public enum TipoServicoModel {
        DEMANDA("0"),
        PROJETO("1");
        private String tipoServico;

        TipoServicoModel(String tipoServico){
            this.tipoServico = tipoServico;
        }

        public String getRole(){
            return tipoServico;
        }
}
