package semana21a;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Tela tela = new Tela();

        Quadrado q1 = new Quadrado(10.0);
        Quadrado q2 = new Quadrado(20.0);

        Retangulo r1 = new Retangulo(10.0, 5.0);

        Circulo c1 = new Circulo(2.0);

        tela.addFigura(q1);
        tela.addFigura(q2);
        tela.addFigura(r1);
        

        System.out.println(tela.areaTotal());
        System.out.println(tela.perimetroTotal());

        // List
        // Set    
        // Map

        ArrayList<String> nomes = new ArrayList<String>();

    
        nomes.add("Maria");
        nomes.add("João");
        nomes.add("Pedro");

        
        System.out.println(nomes.size());

        // Remover
        // nomes.remove(1);
        nomes.remove("João");

        //   0      1     2

        // Maria, João, Pedro

        // Maria, Pedro

        // Remover todos os elementos
        nomes.clear();

        // Pegar elemento
        System.out.println(nomes.get(0));
    }
    
}
