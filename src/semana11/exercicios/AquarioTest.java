package semana11.exercicios;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AquarioTest {
    
    @Test
    public void calculaVolume(){
        Aquario aquario1 = new Aquario();
        //AAA

        //Arrange
        aquario1.altura = 10;
        aquario1.comprimento = 10;
        aquario1.largura = 10;

        //Act
        double volume = aquario1.calcularVolume();

        //Assert
        assertEquals(1.0, volume, 0.0001);
    }
    @Test
    public void calculaPotenciaDoTermostato(){
        Aquario aquario1 = new Aquario();
        //AAA

        //Arrange
        aquario1.altura = 10;
        aquario1.comprimento = 10;
        aquario1.largura = 10;
        double volume = aquario1.calcularVolume();
        aquario1.temperaturaAmbiente = 30;
        aquario1.temperaturaDesejada = 23;
        

        //Act
        double potencia = aquario1.potenciaTermostato();

        //Assert
        assertEquals(potencia, 0.35000000000000003, 0.0001);
    }
    @Test
    public void calculaFiltragemPorHora(){
        Aquario aquario1 = new Aquario();
        //AAA
        // Arrange
        aquario1.altura = 10;
        aquario1.comprimento = 10;
        aquario1.largura = 10;
        double volume = aquario1.calcularVolume();
        

        //Act
        double filtragem = aquario1.filtragemPorHora();

        //Assert
        assertEquals(filtragem, 3.0, 0.0001);
    }
}
