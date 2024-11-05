package src.main.java;

public class Pessoa {

    public String enviarReclamacao(Setor setor, String mensagem) {
        return ControleQualidade.getInstancia().receberReclamacao(setor, mensagem);
    }

    public String enviarElogio(Setor setor, String mensagem) {
        return ControleQualidade.getInstancia().receberElogio(setor, mensagem);
    }

    public String enviarSugestao(Setor setor, String mensagem) {
        return ControleQualidade.getInstancia().receberSugestao(setor, mensagem);
    }
}