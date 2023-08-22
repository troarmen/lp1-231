package semana15;

import java.util.List;

public class MultiplaEscolha extends Questao {
    private List<String> opcoes;
    private List<Integer> respostas;

    public MultiplaEscolha(double numero, double tipo, List<String> opcoes, List<Integer> respostas) {
        super(numero, tipo);
        this.opcoes = opcoes;
        this.respostas = respostas;
    }

    public List<String> getOpcoes() {
        return opcoes;
    }

    public void setOpcoes(List<String> opcoes) {
        this.opcoes = opcoes;
    }

    public List<Integer> getResposta() {
        return respostas;
    }
    
    public void setResposta(List<Integer> respostas) {
        this.respostas = respostas;
    }

    public boolean verificarRespostas(List<Integer> escolhas) {
        return escolhas.containsAll(respostas) && respostas.containsAll(escolhas);
    }

    
    
}
