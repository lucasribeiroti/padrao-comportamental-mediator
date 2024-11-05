package src.main.java;

public class ControleQualidade {

    private static ControleQualidade instancia = new ControleQualidade();

    private ControleQualidade() {}

    public static ControleQualidade getInstancia() {
        return instancia;
    }

    public String receberReclamacao(Setor setor, String mensagem) {
        return "Controle de Qualidade registrou sua reclamação.\n" + "Resposta do setor:\n" +
                ">> " + setor.receberReclamacao(mensagem);
    }

    public String receberElogio(Setor setor, String mensagem) {
        return "Controle de Qualidade registrou seu elogio.\n" + "Resposta do setor:\n" +
                ">> " + setor.receberElogio(mensagem);
    }

    public String receberSugestao(Setor setor, String mensagem) {
        return "Controle de Qualidade registrou sua sugestão.\n" + "Resposta do setor:\n" +
                ">> " + setor.receberSugestao(mensagem);
    }
}