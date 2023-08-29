package semana21a;

import java.util.ArrayList;

// interface = contrato
// conjunto de métodos (somente assinatura, sem corpo)
// classe concreta que IMPLEMENTA a interface

//abstract class FiguraGeometrica

// Quadrado - lado - calcularArea/Perimetro
//Retangulo - base, altura - calcularArea/Perimetro
//Circulo - ?


public class Main {
    public static void main(String[] args) {
        Tela tela = new Tela();

        Quadrado q1 = new Quadrado(10);
        Quadrado q2 = new Quadrado(20);

        tela.addQuadrado(q1);
        tela.addQuadrado(q2);

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Tro");
        nomes.add("Daron");
        nomes.remove(1);
        
    }
    
}
