package semana04.exercicios;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para ver seu sucessor e seu antecessor");
        int num = sc.nextInt();
        int ante_num = num - 1;
        int suce_num = num + 1;
        System.out.printf("Seu antecessor é: %d", ante_num);
        System.out.printf("\nSeu sucessor é: %d", suce_num);

    }
    
}
