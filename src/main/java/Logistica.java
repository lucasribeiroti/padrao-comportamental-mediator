package src.main.java;

public class Logistica implements Setor {

    public String receberReclamacao(String mensagem) {
        return "O setor de Logística revisará a reclamação: " + mensagem;
    }

    public String receberElogio(String mensagem) {
        return "O setor de Logística agradece o elogio: " + mensagem;
    }

    public String receberSugestao(String mensagem) {
        return "O setor de Logística analisará a sugestão: " + mensagem;
    }
}