package semana04.exercicios;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double valor, desconto, total;

        System.out.println("Digite o valor da compra: ");
        valor = sc.nextDouble();

        if(valor > 0.1 && valor < 9.99){
            total = valor;
            System.out.println("0% de desconto.");
            System.out.printf("O preço final é: %f", total);

        } else if(valor >= 10 && valor <= 99.99){
            desconto = valor * 5/100;
            total = valor - desconto;
            System.out.println("5% de desconto.");
            System.out.printf("O preço final é: %f", total);

        } else if(valor >= 100 && valor <= 499.99){
            desconto = valor * 10/100;
            total = valor - desconto;
            System.out.println("10% de desconto");
            System.out.printf("O preço final é: %f", total);
            
        } else if(valor >= 500){
            desconto = valor * 15/100;
            total = valor - desconto;
            System.out.println("15% de desconto.");
            System.out.printf("O preço final é: %f", total);
        }
        
    }
    
}
