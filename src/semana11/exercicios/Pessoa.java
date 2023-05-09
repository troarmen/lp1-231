package semana11.exercicios;

public class Pessoa {
    public double altura;
    public double peso;

    public double calcularImc(){
        return peso / (altura * altura);
    }

    public String getFaixa(){
        double imc = calcularImc();
        if(imc < 18.5){
            return "Você está abaixo do peso normal";

        }else if (imc >= 18.5 && imc <25){
            return "Você está com o peso normal";

        }else {
            if (imc >= 25 && imc <= 29.9) {
                return "Você está acima do peso normal";
            }else if(imc >= 30 && imc <= 34.9){
                return "Você pertence ao grupo Obesidade de Classe 1";
            } else if(imc >= 35 && imc <= 39.9){
                return "Você pertence ao grupo de Obesidade Classe 2";
            } else {
                return "Você pertence ao grupo de Obesidade Classe 3";
            }
        }
    }

    public String getSituacao(){
        double imc = calcularImc();
        if(imc < 18.5){
            return "GANHAR";

        }else if (imc >= 18.5 && imc <25){
            return "NORMAL";

        }else {
            if (imc >= 25 && imc <= 29.9) {
                return "PERDER";
            }else if(imc >= 30 && imc <= 34.9){
                return "PERDER";
            } else if(imc >= 35 && imc <= 39.9){
                return "PERDER";
            } else {
                return "PERDER";
            }
        }
    }

}
