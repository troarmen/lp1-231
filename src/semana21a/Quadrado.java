package semana21a;

public class Quadrado implements FiguraGeometrica{
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calularPerimetro() {
        return 4 * lado;
    }

    
}
