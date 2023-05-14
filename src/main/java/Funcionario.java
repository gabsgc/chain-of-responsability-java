import java.util.ArrayList;

public abstract class Funcionario {
    protected ArrayList<TipoServico> atendimentoFuncionario = new ArrayList<>();
    private Funcionario funcionario;

    public Funcionario getFuncionarioServico() { return funcionario; }

    public void setFuncionarioServico(Funcionario funcionario) { this.funcionario = funcionario;}

    public abstract String getTipoServicoPorAtendente();

    public String realizarServico(Atendimento atendimento) {
        if (atendimentoFuncionario.contains(atendimento.getTipoServico())) {
            return getTipoServicoPorAtendente();
        } else {
            if (funcionario != null) {
                return funcionario.realizarServico(atendimento);
            } else {
                return "Serviço indisponível no momento.";
            }
        }
    }
}
