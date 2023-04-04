package semana07;

public class ExerciciosRevisao {
    public static double somar(double a, double b, double c){
        return a + b + c;
    }
    public static double media(double a, double b, double c){
        return (a + b + c) / 3;
    }
    public static int maiorNum(int a, int b, int c){
        int maior = 0;
        if(a >= b && a >= c){
            maior = a;
        } else if(b >= a && b >= c){
            maior = b;
        } else if(c >= a && c >= b){
            maior = c;
        }
        return maior;
    }
    public static int menorNum(int a, int b, int c){
        int menor = 0;
        if(a <= b && a <= c){
            menor = a;
        } else if(b <= a && b <= c){
            menor = b;
        } else if(c <= a && c <= b){
            menor = c;
        }
        return menor;
    }

    public static double[] transformarEmArray(double a, double b, double c){
        double [] numeros = {a, b, c};
        return numeros;
    }

    public static double somaArray(double[] array){
        double resultado = 0;
        for (double num : array) {
            resultado += num;
        }
        return resultado;
    }

    public static double mediaArray(double[] array){
        return somaArray(array)/ array.length;
    }

    public static double maiorArray(double[] array){
        double maior = 0;
        for(double num : array){
            if(num > maior)
                maior = num;
        }
        return maior;
    }

    public static double menorArray(double[] array){
        double menor = 0;
        for(double num : array){
            if(num < menor)
                menor = num;
        }
        return menor;
    }

    public static int[] juntarArrays(int[] array1, int[] array2){
        int[] juncao = new int[array1.length + array2.length];
        int i = 0;

        for(int valor: array1){
            juncao[i] = valor;
            i++;
        }
        for(int valor: array2){
            juncao[i] = valor;
            i++;
        }

        return juncao;

    }
}