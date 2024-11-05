package src.main.java;

public class FeedbackCentral {

    private static FeedbackCentral instancia = new FeedbackCentral();

    private FeedbackCentral() {}

    public static FeedbackCentral getInstancia() {
        return instancia;
    }

    public String receberElogioRH(String mensagem) {
        return "A Central de Feedback agradece seu contato.\n" +
                "O RH respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + RH.getInstancia().receberElogio(mensagem);
    }

    public String receberReclamacaoRH(String mensagem) {
        return "A Central de Feedback agradece seu contato.\n" +
                "O RH respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + RH.getInstancia().receberReclamacao(mensagem);
    }

    public String receberSugestaoRH(String mensagem) {
        return "A Central de Feedback agradece seu contato.\n" +
                "O RH respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + RH.getInstancia().receberSugestao(mensagem);
    }
}
