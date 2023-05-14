public class FuncionarioManicure extends Funcionario {

    public FuncionarioManicure(Funcionario funcionario) {
        atendimentoFuncionario.add(Manicure.getInstance());
        setFuncionarioServico(funcionario);
    }

    @Override
    public String getTipoServicoPorAtendente() {
        return "Atendimento para serviços de manicure";
    }
}
