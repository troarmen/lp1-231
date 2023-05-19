package semana12.exercicios;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AquarioTest {
    
    @Test
    public void calculaVolume(){
        Aquario aquario1 = new Aquario(10, 10, 10);

        double volume = aquario1.calcularVolume();

        assertEquals(1.0, volume, 0.0001);
    }
    @Test
    public void calculaPotenciaDoTermostato(){
        Aquario aquario1 = new Aquario(10, 10, 10);
        
        double volume = aquario1.calcularVolume();
        aquario1.temperaturaAmbiente = 30;
        aquario1.temperaturaDesejada = 23;

        double potencia = aquario1.potenciaTermostato();

        assertEquals(potencia, 0.35000000000000003, 0.0001);
    }
    @Test
    public void calculaFiltragemPorHora(){
        Aquario aquario1 = new Aquario(10, 10, 10);
        
        double volume = aquario1.calcularVolume();
        double filtragem = aquario1.filtragemPorHora();

        assertEquals(filtragem, 3.0, 0.0001);
    }
}
