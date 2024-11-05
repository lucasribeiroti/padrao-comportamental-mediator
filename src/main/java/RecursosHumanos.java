package src.main.java;

public class RecursosHumanos implements Setor {

    public String receberReclamacao(String mensagem) {
        return "O setor de RH considerará a reclamação: " + mensagem;
    }

    public String receberElogio(String mensagem) {
        return "O setor de RH agradece o elogio: " + mensagem;
    }

    public String receberSugestao(String mensagem) {
        return "O setor de RH avaliará a sugestão: " + mensagem;
    }
}