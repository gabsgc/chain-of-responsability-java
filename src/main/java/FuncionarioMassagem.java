public class FuncionarioMassagem extends Funcionario {

    public FuncionarioMassagem(Funcionario funcionario) {
        atendimentoFuncionario.add(Massagem.getInstance());
        setFuncionarioServico(funcionario);
    }

    @Override
    public String getTipoServicoPorAtendente() {
        return "Atendimento para serviço de massagem.";
    }
}
