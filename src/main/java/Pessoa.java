package src.main.java;

public abstract class Pessoa {

    public String elogiarRH(String mensagem) {
        return FeedbackCentral.getInstancia().receberElogioRH(mensagem);
    }

    public String reclamarRH(String mensagem) {
        return FeedbackCentral.getInstancia().receberReclamacaoRH(mensagem);
    }

    public String sugerirRH(String mensagem) {
        return FeedbackCentral.getInstancia().receberSugestaoRH(mensagem);
    }
}