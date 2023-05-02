package semana10;

//Classe - representa um conceito/abstração
    // que deve ser implementado no programa
public class Retangulo {
        //Atributos
        public double base;
        public double altura;
    
        public double calcularArea(){
            return base * altura;
        }
    
        public double calcularPerimetro(){
            return 2 * (base + altura);
        }
    }