public class Cabeleireiro implements TipoServico {
    private static Cabeleireiro cabeleireiro = new Cabeleireiro();

    private Cabeleireiro (){}

    public static Cabeleireiro getInstance() { return cabeleireiro; }

    @Override
    public String tipoServicoRealizado() {
        return "Cabeleireiro";
    }
}
