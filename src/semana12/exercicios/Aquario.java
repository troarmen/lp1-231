package semana12.exercicios;

public class Aquario {
    public double comprimento;
    public double altura;
    public double largura;
    public double temperaturaAmbiente;
    public double temperaturaDesejada;

    public Aquario(double comprimento, double altura, double largura){
        this.comprimento = comprimento;
        this.altura = altura;
        this.largura = largura;
    }
    public Aquario(double valor){
        this(valor, valor, valor);
    }

    public  double calcularVolume(){
        return (comprimento * altura * largura) / 1000;
    }
    public  double potenciaTermostato(){
        return calcularVolume()*0.05*(temperaturaAmbiente-temperaturaDesejada);
    }
    public  double filtragemPorHora(){
        return calcularVolume() * 3;
    }    
}
