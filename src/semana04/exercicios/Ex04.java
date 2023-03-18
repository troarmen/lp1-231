package semana04.exercicios;
import java.util.Scanner;


public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String codigo;
        char primeira, segunda, quinta, ultima;
        System.out.println("Digite seu código de funcionário: ");
        codigo = sc.nextLine();

        if (codigo.length() > 7 || codigo.length() < 7) {
            System.out.println("Código inválido.");
        } else {
            primeira = codigo.charAt(0);
            segunda = codigo.charAt(1);
            quinta = codigo.charAt(5);
            
            ultima = codigo.charAt(6);
            
            if(primeira != 'B' || segunda !='R' || ultima != 'X'){
                System.out.println("Código inválido.");
            }
            if(primeira == 'B' && segunda == 'R' && ultima == 'X'){
                if(Character.getNumericValue(quinta) < 1){
                    System.out.println("Código inválido");
                }
                else{
                    System.out.println("Código válido");
                }
                
            }
            
        }
    }
}
