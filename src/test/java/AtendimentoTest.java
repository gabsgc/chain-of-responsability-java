import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtendimentoTest {
    FuncionarioManicure funcionarioManicure;
    FuncionarioMassagem funcionarioMassagem;
    FuncionarioCabeleireiro funcionarioCabeleireiro;

    @BeforeEach
    void setUp() {
        funcionarioManicure = new FuncionarioManicure(funcionarioManicure);
        funcionarioCabeleireiro = new FuncionarioCabeleireiro(funcionarioCabeleireiro);
        funcionarioMassagem = new FuncionarioMassagem(null);
    }

    @Test
    void deveRetornarAtendimentoManicure() {
        assertEquals("Atendimento para serviços de manicure",
                funcionarioManicure.realizarServico(new Atendimento(Manicure.getInstance())));
    }

    @Test
    void deveRetornarAtendimentoCabeleireiro() {
        Atendimento atendimento = new Atendimento(Cabeleireiro.getInstance());
        assertEquals("Atendimento para serviço de cabeleireiro.", funcionarioCabeleireiro.realizarServico(atendimento));
    }

    @Test
    void deveRetornarAtendimentoMassagem() {
        Atendimento atendimento = new Atendimento(Massagem.getInstance());
        assertEquals("Atendimento para serviço de massagem.", funcionarioMassagem.realizarServico(atendimento));
    }

    @Test
    void deveRetornarServicoIndisponivel() {
        Atendimento atendimento = new Atendimento(Massagem.getInstance());
        funcionarioMassagem.atendimentoFuncionario.remove(0);
        assertEquals("Serviço indisponível no momento.", funcionarioMassagem.realizarServico(atendimento));
    }
}