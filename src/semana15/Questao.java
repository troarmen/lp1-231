package semana15;

public class Questao {
    protected double numero;
    protected double tipo;
    protected String enunciado;

    public Questao(double numero, double tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public double getTipo() {
        return tipo;
    }

    public void setTipo(double tipo) {
        this.tipo = tipo;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }
}
