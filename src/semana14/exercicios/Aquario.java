package semana14.exercicios;

public class Aquario {
    public double altura;
    public double comprimento;
    public double largura;
    public double temperaturaAmbiente;
    public double temperaturaDesejada;
    
    public Aquario(double altura, double comprimento, double largura){
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
    
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if(altura <= 0){
            throw new RuntimeException("Valor inválido. Somente positivos são aceitos");
        }
        this.altura = altura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        if(comprimento <= 0){
            throw new RuntimeException("Valor inválido. Somente positivos são aceitos");
        }
        this.comprimento = comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if(largura <= 0){
            throw new RuntimeException("Valor inválido. Somente positivos são aceitos");
        }
        this.largura = largura;
    }

    public double getTemperaturaAmbiente() {
        return temperaturaAmbiente;
    }

    public void setTemperaturaAmbiente(double temperaturaAmbiente) {
        if(temperaturaAmbiente <= 0){
            throw new RuntimeException("Valor inválido. Somente positivos são aceitos");
        }
        this.temperaturaAmbiente = temperaturaAmbiente;
    }
    public double getTemperaturaDesejada() {
        return temperaturaDesejada;
    }
    public void setTemperaturaDesejada(double temperaturaDesejada) {
        if(temperaturaDesejada <= 0){
            throw new RuntimeException("Valor inválido. Somente positivos são aceitos");
        }
        this.temperaturaDesejada = temperaturaDesejada;
    }
}
