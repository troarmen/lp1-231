package semana11.exercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class PessoaTest {
    @Test
    public void calculaImc(){
        Pessoa pessoa = new Pessoa();
        pessoa.altura = 1.50;
        pessoa.peso = 50;

        double imc = pessoa.calcularImc();

        assertEquals(imc, 22.22222222222222, 0.0001);   
    }
    
    
}
