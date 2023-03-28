package semana06;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    public void somaDoisNumerosPositivos(){
        // AAA

        //Arrange
        double numero1 = 10.0;
        double numero2 = 2.0;

        //Act
        double soma = Calculadora.somar(numero1, numero2);

        //Assert
        assertEquals(12.0, soma);
        
    }

    //10.0 + -2.0
    @Test
    public void somaUmNumeroPositivoEUmNegativo(){
        // AAA

        //Arrange
        double numero1 = 10.0;
        double numero2 = -2.0;

        //Act
        double soma = Calculadora.somar(numero1, numero2);

        //Assert
        assertEquals(8.0, soma);
        
    }

    @Test
    public void somaUmNumeroNegativoEUmPositivo(){
        // AAA

        //Arrange
        double numero1 = -10.0;
        double numero2 = 2.0;

        //Act
        double soma = Calculadora.somar(numero1, numero2);

        //Assert
        assertEquals(-8.0, soma);
        
    }

    @Test
    public void somaDoisNumerosNegativos(){
        // AAA

        //Arrange
        double numero1 = -10.0;
        double numero2 = -2.0;

        //Act
        double soma = Calculadora.somar(numero1, numero2);

        //Assert
        assertEquals(-12.0, soma);
        
    }

    @Test
    public void subtraiDoisNumerosPositivos(){
        // AAA
        // Arrange
        double n1 = 10.0;
        double n2 = 2.0;

        // Act
        double subtracao = Calculadora.subtrair(n1, n2);

        //Assert
        assertEquals(8.0 , subtracao);
    }

    @Test
    public void subtraiUmPositivoEUmNegativo(){
        // AAA
        // Arrange
        double n1 = 10.0;
        double n2 = -2.0;

        // Act
        double subtracao = Calculadora.subtrair(n1, n2);

        //Assert
        assertEquals(12.0 , subtracao);
    }

    @Test
    public void subtraiUmNegativoEUmPositivo(){
        // AAA
        // Arrange
        double n1 = -10.0;
        double n2 = 2.0;

        // Act
        double subtracao = Calculadora.subtrair(n1, n2);

        //Assert
        assertEquals(-12.0 , subtracao);
    }

    @Test
    public void subtraiDoisNegativos(){
        // AAA
        // Arrange
        double n1 = -10.0;
        double n2 = -2.0;

        // Act
        double subtracao = Calculadora.subtrair(n1, n2);

        //Assert
        assertEquals(-8.0 , subtracao);
    }

    @Test
    public void multiplicaDoisPositivos(){
        // AAA
        // Arrange
        double n1 = 10.0;
        double n2 = 2.0;

        // Act
        double multiplicacao = Calculadora.multiplicar(n1, n2);

        //Assert
        assertEquals(20.0 , multiplicacao);
    }
    
    @Test
    public void multiplicaUmPositivoEUmNegativo(){
        // AAA
        // Arrange
        double n1 = 10.0;
        double n2 = -2.0;

        // Act
        double multiplicacao = Calculadora.multiplicar(n1, n2);

        //Assert
        assertEquals(-20.0 , multiplicacao);
    }

    @Test
    public void multiplicaDoisNegativos(){
        // AAA
        // Arrange
        double n1 = -10.0;
        double n2 = -2.0;

        // Act
        double multiplicacao = Calculadora.multiplicar(n1, n2);

        //Assert
        assertEquals(20.0 , multiplicacao);
    }

    @Test
    public void divideDoisPositivos(){
        // AAA
        // Arrange
        double n1 = 10.0;
        double n2 = 2.0;

        // Act
        double divisao = Calculadora.dividir(n1, n2);

        //Assert
        assertEquals(5.0 , divisao);
    }

    @Test
    public void divideUmPositivoEUmNegativo(){
        // AAA
        // Arrange
        double n1 = 10.0;
        double n2 = -2.0;

        // Act
        double divisao = Calculadora.dividir(n1, n2);

        //Assert
        assertEquals(-5.0 , divisao);
    }

    @Test
    public void divideUmNumeroPorZero(){
        // AAA
        // Arrange
        double n1 = 10.0;
        double n2 = 0;

        // Act
        double divisao = Calculadora.dividir(n1, n2);

        //Assert
        double inf = Double.POSITIVE_INFINITY;
        assertEquals(inf , divisao);
    }
}