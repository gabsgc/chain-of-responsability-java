public class Manicure implements TipoServico {
    private static Manicure manicure = new Manicure();

    private Manicure (){}

    public static Manicure getInstance() { return manicure; }

    @Override
    public String tipoServicoRealizado() {
        return "Manicure";
    }
}
