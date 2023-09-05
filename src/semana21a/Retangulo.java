package semana21a;

public class Retangulo implements FiguraGeometrica{
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        setBase(base);
        setAltura(altura);
    }

    @Override
    public double calcularArea() {
        // TODO Auto-generated method stub
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        // TODO Auto-generated method stub
        return 2 * (base +  altura);
    }

    public void setBase(double base) {
        if(base <= 0.0)
            throw new RuntimeException("Base inválida");
        this.base = base;
    }

    public void setAltura(double altura) {
        if(altura <= 0.0)
            throw new RuntimeException("Altura inválida");
        this.altura = altura;
    }

    
}
