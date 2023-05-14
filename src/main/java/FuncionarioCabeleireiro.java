public class FuncionarioCabeleireiro extends Funcionario {

    public FuncionarioCabeleireiro(Funcionario funcionario) {
        atendimentoFuncionario.add(Cabeleireiro.getInstance());
        setFuncionarioServico(funcionario);
    }

    @Override
    public String getTipoServicoPorAtendente() {
        return "Atendimento para serviço de cabeleireiro.";
    }
}
