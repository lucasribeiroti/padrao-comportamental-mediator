package src.main.java;

public class Producao implements Setor {

    public String receberReclamacao(String mensagem) {
        return "O setor de Produção analisará a reclamação: " + mensagem;
    }

    public String receberElogio(String mensagem) {
        return "O setor de Produção agradece o elogio: " + mensagem;
    }

    public String receberSugestao(String mensagem) {
        return "O setor de Produção considerará a sugestão: " + mensagem;
    }
}
