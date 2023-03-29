package semana06.exercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Ex02Test {
    @Test
    public void calculaImc(){
        //AAA
        //Arrange
        double altura = 1.50;
        double peso = 50;

        //Act
        double imc = Ex02.calcularImc(peso, altura);

        //Assert
        assertEquals(imc, 22.22222222222222);
    }
    
    @Test
    public void calculaPesoIdeal(){
        //AAA
        //Arrange
        double altura = 1.75;
        double imcIdeal = 24.9;

        //Act
        double pesoIdeal = Ex02.calcularPesoIdeal(imcIdeal, altura);

        //Assert
        assertEquals(pesoIdeal, 76.25625);
    }
}
