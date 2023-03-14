package semana03;

import java.util.Scanner;

import javax.xml.transform.Source;

public class Introducao {
    public static void main(String[] args){
        // Comentário de uma linha 

        /* 
         * Comentário de múltiplas linhas
         */

        // Tipos primitivos
        // Inteiros
        //byte, short, int, long
        byte n1 = 100; // 1 byte -  -128 a 127
        short n2 = 3000; // 2 bytes -  -32768 a 32767
        int n3 = 321312321; // 4 bytes - 2 bilhoes
        long n4 = 3232323232L; // 8 bytes

        // Ponto flutuante
        float nota1 = 10.4343f; // 4 bytes
        double nota2 = 10.3434; // 8 bytes

        //Char
        char letra = 'A';

        //boolean
        boolean ligado = true;
        boolean teste = false;

        //String 
        String nome = "Trô Armen Kalaydjian";
        System.out.println(nome);
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());

        //Variáveis e constantes
        int idade = 20;
        int idade2;
        idade2 = 30;

        // Java 10 - inferência de tipo com var
        var idade3 = 15;
        var nome2 = "Maria";

        //Constantes - keyword final
        final double TESTE = 20.2;
        final int TESTE2 = 12;

        //Entrada e saída de dados

        //Entrada - Classe chamada Scanner
        //Saída - System.out

        
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com seu nome: ");
        String nomeInformado = sc.nextLine();

        System.out.println("Ente com sua idade: ");
        int idadeInformada = sc.nextInt();
        
        System.out.println(nomeInformado + " " + idadeInformada);
        System.out.printf("%s %d \n", nomeInformado, idadeInformada);

        sc.close();
    }
}
