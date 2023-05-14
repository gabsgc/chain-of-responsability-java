public class Massagem implements TipoServico {
    private static Massagem massagem = new Massagem();

    private Massagem (){}

    public static Massagem getInstance() { return massagem; }

    @Override
    public String tipoServicoRealizado() {
        return "Massagem";
    }
}
