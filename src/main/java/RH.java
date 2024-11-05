package src.main.java;

public class RH implements Departamento {

    private static RH instancia = new RH();

    private RH() {}

    public static RH getInstancia() {
        return instancia;
    }

    public String receberReclamacao(String mensagem) {
        return "O RH vai avaliar a reclamação: " + mensagem;
    }

    public String receberElogio(String mensagem) {
        return "O RH agradece a mensagem: " + mensagem;
    }

    public String receberSugestao(String mensagem) {
        return "O RH vai considerar a sugestão: " + mensagem;
    }
}
