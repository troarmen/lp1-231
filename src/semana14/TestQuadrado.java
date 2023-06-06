package semana14;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class TestQuadrado {
    @Test
    public void retornaLadoPositivo(){
        Quadrado quadrado = new Quadrado(5);

        quadrado.setLado(20);

        assertEquals(quadrado.getLado(), 20);
    }

    @Test
    public void retornaLadoZero(){
        Quadrado quadrado = new Quadrado(5);

        quadrado.setLado(0);

        
    }
}
