package semana15;

import java.util.List;

public class UnicaEscolha extends Questao{
    
    private List<String> opcoes;
    private int resposta;

    public UnicaEscolha(double numero, double tipo, List<String> opcoes, int resposta) {
        super(numero, tipo);
        this.opcoes = opcoes;
        this.resposta = resposta;
    }

    public List<String> getOpcoes() {
        return opcoes;
    }

    public void setOpcoes(List<String> opcoes) {
        this.opcoes = opcoes;
    }

    public int getResposta() {
        return resposta;
    }

    public void setResposta(int resposta) {
        this.resposta = resposta;
    }

    public boolean verificarResposta(int escolha){
        return escolha == resposta;
    }
}
