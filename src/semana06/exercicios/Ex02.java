package semana06.exercicios;
import java.util.Scanner;

public class Ex02 {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);

        System.out.println("Altura:(m) ");
        double altura = scanner.nextDouble();
        
        System.out.println("Peso:(kg) ");
        double peso = scanner.nextDouble();

        double imc = calcularImc(peso, altura);
        System.out.println("Seu IMC é " + imc);

        if(imc < 18.5){
            System.out.println("Você está abaixo do peso normal");
            double pesoIdeal = calcularPesoIdeal(18.5, altura);
            double pesoParaGanhar = pesoIdeal - peso;
            System.out.printf("Para chegar ao peso ideal , você precisa ganhar %.2f kg\n",pesoParaGanhar);

        }else if (imc >= 18.5 && imc <25){
            System.out.println("Você está com o peso normal");

        }else {
            if (imc >= 25 && imc <= 29.9) {
                System.out.println("Você está acima do peso normal");
            }else if(imc >= 30 && imc <= 34.9){
                System.out.println("Você pertence ao grupo Obesidade de Classe 1");
            } else if(imc >= 35 && imc <= 39.9){
                System.out.println("Você pertence ao grupo de Obesidade Classe 2");
            } else if(imc >= 40){
                System.out.println("Você pertence ao grupo de Obesidade Classe 3");
            }

            double pesoIdeal = calcularPesoIdeal(18.5, altura);
            double pesoParaPerder = peso - pesoIdeal;
            System.out.println("Para chegar ao normal, você precisa perder: " + pesoParaPerder);
            scanner.close();
        }
    }
    public static double calcularImc(double peso, double altura){
        return peso / (altura * altura);
    }

    public static double calcularPesoIdeal(double imcIdeal, double altura){
        return imcIdeal * (altura * altura);
    }
    
}
