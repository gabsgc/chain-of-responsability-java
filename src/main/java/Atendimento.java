public class Atendimento {
    private TipoServico tipoServico;

    public Atendimento(TipoServico tipoServico) {
        this.tipoServico = tipoServico;
    }

    public TipoServico getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(TipoServico tipoServico) {
        this.tipoServico = tipoServico;
    }
}
