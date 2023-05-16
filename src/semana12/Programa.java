package semana12;

public class Programa {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(10.0);
        // quadrado.lado = 10.0;

        double area = quadrado.calcularArea();
        System.out.println(area);

        double perimetro = quadrado.calcularPerimetro();
        System.out.println(perimetro);

        Retangulo r1 = new Retangulo(10, 5);
        Retangulo r2 = new Retangulo(20, 30);
        Retangulo r3 = new Retangulo(15);

        System.out.println(r3.base);
        System.out.println(r3.altura);


    }
}

