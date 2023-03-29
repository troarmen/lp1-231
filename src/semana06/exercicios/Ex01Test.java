package semana06.exercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Ex01Test {
    @Test
    public void calculaVolume(){
        //AAA

        //Arrange
        double altura = 10;
        double comprimento = 10;
        double largura = 10;

        //Act
        double volume = Ex01.volume(comprimento, altura, largura);

        //Assert
        assertEquals(1.0, volume);
    }

    @Test
    public void calculaPotenciaTermostato(){
        //AAA
        //Arrange
        double volume = 1;
        double temperaturaAmbiente = 30;
        double temperaturaDesejada = 23;

        //Act
        double potencia = Ex01.potenciaTermostato(volume, temperaturaAmbiente, temperaturaDesejada);

        //Assert
        assertEquals(potencia, 0.35000000000000003);
    }

    @Test
    public void calculaFiltragemPorHora(){
        //AAA
        // Arrange
        double volume = 1;

        //Act
        double filtragem = Ex01.filtragemPorHora(volume);

        //Assert
        assertEquals(filtragem, 3.0);
    }
}
