package semana04.exercicios;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, soma= 0;
        int i = 0;
        for(i = 0; i < 3; i++){
            System.out.println("Digite um número: ");
            num = sc.nextInt();
            soma = soma + num;
        }
        int media = soma / 3;
        System.out.printf("A média dos números digitados é: %d", media);
    }
    
}
