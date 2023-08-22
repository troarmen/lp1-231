package semana15;

public class VerdadeiroFalso extends Questao{
    
    private boolean resposta;

    public VerdadeiroFalso(double numero, double tipo, boolean resposta) {
        super(numero, tipo);
        this.resposta = resposta;
    }

    public boolean isResposta() {
        return resposta;
    }

    public void setResposta(boolean resposta) {
        this.resposta = resposta;
    }

    public boolean verificarResposta(boolean escolha){
        return escolha == resposta;
    }
}