package semana21a;

import java.util.ArrayList;

public class Tela {
    private int numeroQuadrados;
    private int numeroRetangulos;
    private ArrayList<Quadrado> quadrados;
    private ArrayList<Retangulo> retangulos;
    
    public Tela(){
        numeroQuadrados = 0;
        numeroRetangulos = 0;
        quadrados = new ArrayList<>();
        retangulos = new ArrayList<>();
    }
    
    public void addQuadrado(Quadrado q){
        quadrados.add(q);
        numeroQuadrados += 1;
    }

    public void addRetangulo(Retangulo r){
        retangulos.add(r);
        numeroRetangulos += 1;
    }

    public double areaTotal(){
        double total = 0.0;
        for (Quadrado quadrado : quadrados) {
            total += quadrado.calcularArea();
        }
        return total;
    }
              
    public double perimetroTotal(){
        double total = 0.0;
        for (Quadrado quadrado : quadrados) {
            total += quadrado.calularPerimetro();
        }
        return total;
    }
}
