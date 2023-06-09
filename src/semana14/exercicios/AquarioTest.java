package semana14.exercicios;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

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

    @Test 
    public void retornaAltura(){
        Aquario aquario = new Aquario(10, 10, 10);

        assertEquals(aquario.getAltura(), 10);
    }
    
    @Test 
    public void modificaAlturaPositiva(){
        Aquario aquario = new Aquario(10, 10, 10);
        
        aquario.setAltura(20);
        
        assertEquals(aquario.getAltura(), 20);
    }

    @Test
    public void modificaAlturaZero(){
        Aquario aquario = new Aquario(10, 10, 10);

        try {
            aquario.setAltura(0);
        } catch (RuntimeException e) {
            assertEquals(e.getMessage(), "Valor inválido. Somente positivos são aceitos");
        }
    }

    @Test
    public void modificaAlturaNegativa(){
        Aquario aquario = new Aquario(10, 10, 10);

        try {
            aquario.setAltura(-5);
        } catch (RuntimeException e) {
            assertEquals(e.getMessage(), "Valor inválido. Somente positivos são aceitos");
        }
    }

    @Test
    public void retornaComprimento(){
        Aquario aquario = new Aquario(10, 10, 10);

        assertEquals(aquario.getComprimento(), 10);
    }

    @Test
    public void modificaComprimentoPositivo(){
        Aquario aquario = new Aquario(10, 10, 10);

        aquario.setComprimento(20);
        assertEquals(aquario.getComprimento(), 20);
    }

    @Test
    public void modificaComprimentoZero(){
        Aquario aquario = new Aquario(10, 10, 10);

        try {
            aquario.setComprimento(0);
        } catch (RuntimeException e) {
            assertEquals(e.getMessage(), "Valor inválido. Somente positivos são aceitos");
        }
    }

    @Test
    public void modificaComprimentoNegativo(){
        Aquario aquario = new Aquario(10, 10, 10);

        try {
            aquario.setComprimento(-5);
        } catch (RuntimeException e) {
            assertEquals(e.getMessage(), "Valor inválido. Somente positivos são aceitos");
        }
    }

    @Test
    public void retornaLargura(){
        Aquario aquario = new Aquario(10, 10, 10);

        assertEquals(aquario.getLargura(), 10);
    }

    @Test
    public void modificaLarguraPositiva(){
        Aquario aquario = new Aquario(10, 10, 10);

        aquario.setLargura(20);

        assertEquals(aquario.getLargura(), 20);
    }

    @Test
    public void modificaLarguraZero(){
        Aquario aquario = new Aquario(10, 10, 10);

        try {
            aquario.setLargura(0);
        } catch(RuntimeException e){
            assertEquals(e.getMessage(), "Valor inválido. Somente positivos são aceitos");
        }
    }

    @Test
    public void modificaLarguraNegativa(){
        Aquario aquario = new Aquario(10, 10, 10);

        try {
            aquario.setLargura(-5);
        } catch(RuntimeException e){
            assertEquals(e.getMessage(), "Valor inválido. Somente positivos são aceitos");
        }
    }

    @Test
    public void retornaTemperaturaAmbiente(){
        Aquario aquario = new Aquario(10, 10, 10);
        
        aquario.temperaturaAmbiente = 30;

        assertEquals(aquario.getTemperaturaAmbiente(), 30);
    }

    @Test 
    public void modificaTemperaturaAmbientePositiva(){
        Aquario aquario = new Aquario(10, 10, 10);

        aquario.temperaturaAmbiente = 30;
        aquario.setTemperaturaAmbiente(40);

        assertEquals(aquario.getTemperaturaAmbiente(), 40);
    }

    @Test
    public void modificaTemperaturaAmbienteZero(){
        Aquario aquario = new Aquario(10, 10, 10);
        aquario.temperaturaAmbiente = 30;

        try {
            aquario.setTemperaturaAmbiente(0);
        } catch (RuntimeException e) {
            assertEquals(e.getMessage(), "Valor inválido. Somente positivos são aceitos");
        }
    }

    @Test
    public void modificaTemperaturaAmbienteNegativa(){
        Aquario aquario = new Aquario(10, 10, 10);
        aquario.temperaturaAmbiente = 30;

        try {
            aquario.setTemperaturaAmbiente(-9);
        } catch (RuntimeException e) {
            assertEquals(e.getMessage(), "Valor inválido. Somente positivos são aceitos");
        }
    }
    
    @Test
    public void retornaTemperaturaDesejada(){
        Aquario aquario = new Aquario(10, 10, 10);
        
        aquario.temperaturaDesejada = 30;

        assertEquals(aquario.getTemperaturaDesejada(), 30);
    }


    @Test
    public void modificaTemperaturaDesejadaPositiva(){
        Aquario aquario = new Aquario(10, 10, 10);
        aquario.temperaturaDesejada = 20;

        aquario.setTemperaturaDesejada(55);

        assertEquals(aquario.getTemperaturaDesejada(), 55);
    }

    @Test
    public void modificaTemperaturaDesejadaZero(){
        Aquario aquario = new Aquario(10, 10, 10);
        aquario.temperaturaDesejada = 20;
        try {
            aquario.setTemperaturaDesejada(0);
        } catch (RuntimeException e) {
            assertEquals("Valor inválido. Somente positivos são aceitos", e.getMessage());
        }
    }

    @Test
    public void modificaTemperaturaDesejadaNegativa(){
        Aquario aquario = new Aquario(10, 10, 10);
        aquario.temperaturaDesejada = 20;
        try {
            aquario.setTemperaturaDesejada(-8);
        } catch (RuntimeException e) {
            assertEquals("Valor inválido. Somente positivos são aceitos", e.getMessage());
        }
    }
}