package src.main.java.test;

import org.junit.jupiter.api.Test;
import src.main.java.Empregado;

import static org.junit.jupiter.api.Assertions.*;

class EmpregadoTest {

    @Test
    void deveElogiarRH() {
        Empregado empregado = new Empregado();
        assertEquals(
                "A Central de Feedback agradece seu contato.\nO RH respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>O RH agradece a mensagem: Ambiente de trabalho excelente",
                empregado.elogiarRH("Ambiente de trabalho excelente")
        );
    }

    @Test
    void deveReclamarRH() {
        Empregado empregado = new Empregado();
        assertEquals(
                "A Central de Feedback agradece seu contato.\nO RH respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>O RH vai avaliar a reclamação: Falta de suporte",
                empregado.reclamarRH("Falta de suporte")
        );
    }

    @Test
    void deveSugerirRH() {
        Empregado empregado = new Empregado();
        assertEquals(
                "A Central de Feedback agradece seu contato.\nO RH respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>O RH vai considerar a sugestão: Adicionar mais benefícios",
                empregado.sugerirRH("Adicionar mais benefícios")
        );
    }
}
