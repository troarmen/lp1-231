package semana05.exercicios;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Comprimento aquário:(cm) ");
        double comprimento = sc.nextDouble();
        System.out.println("Altura aquário:(cm) ");
        double altura = sc.nextDouble();
        System.out.println("Largura aquário:(cm) ");
        double largura = sc.nextDouble();
        System.out.println("Temperatura ambiente: (C⁰)");
        double temperaturaAmbiente = sc.nextDouble(); 
        System.out.println("Temperatura desejada:(C⁰) ");
        double temperaturaDesejada = sc.nextDouble();

        double volume = (comprimento * altura * largura) / 1000;
        double potenciaTermostato  = (volume*0.05*(temperaturaAmbiente-temperaturaDesejada));
        double filtragemPorHora = volume * 3;

        System.out.println("\nVolume do aquário:" + volume);
        System.out.println("A potência do termostato é: " + potenciaTermostato);
        System.out.println("A filtragem por hora é: "+ filtragemPorHora);
    }
}

	
