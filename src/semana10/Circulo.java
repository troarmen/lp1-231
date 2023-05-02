package semana10;

public class Circulo {
    public double raio;

    public static double calcularArea(double raio){
        return 3.14 * (raio * raio);
    }

    public static double calcularPerimetro(double raio){
        return 2 * 3.14 * raio;
    }
}
