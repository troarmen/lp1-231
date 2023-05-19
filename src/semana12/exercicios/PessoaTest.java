package semana12.exercicios;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class PessoaTest {
    @Test
    public void calculaImc(){
        Pessoa pessoa = new Pessoa(1.50, 50);
        double imc = pessoa.calcularImc();
        assertEquals(imc, 22.22222222222222, 0.0001);   
    }
    
    @Test
    public void getFaixa(){
        Pessoa pessoa = new Pessoa(1.72, 50);
        String faixa = pessoa.getFaixa();
        assertEquals("Você está abaixo do peso normal", faixa);

        pessoa = new Pessoa(1.72, 70.3);
        faixa = pessoa.getFaixa();
        assertEquals("Você está com o peso normal", faixa);

        pessoa = new Pessoa(1.72, 80);
        faixa = pessoa.getFaixa();
        assertEquals("Você está acima do peso normal", faixa);

        pessoa = new Pessoa(1.72, 95);
        faixa = pessoa.getFaixa();
        assertEquals("Você pertence ao grupo Obesidade de Classe 1", faixa);     
        
        pessoa = new Pessoa(1.72, 110);
        faixa = pessoa.getFaixa();
        assertEquals("Você pertence ao grupo de Obesidade Classe 2", faixa);

        pessoa = new Pessoa(1.72, 130);
        faixa = pessoa.getFaixa();
        assertEquals("Você pertence ao grupo de Obesidade Classe 3", faixa);
    }

    @Test
    public void getSituacao(){

        Pessoa pessoa = new Pessoa(1.72, 50);
        String faixa = pessoa.getSituacao();
        assertEquals("GANHAR", faixa);

        pessoa = new Pessoa(1.72, 70.3);
        faixa = pessoa.getSituacao();
        assertEquals("NORMAL", faixa);

        pessoa = new Pessoa(1.72, 80);
        faixa = pessoa.getSituacao();
        assertEquals("PERDER", faixa);

        pessoa = new Pessoa(1.72, 95);
        faixa = pessoa.getSituacao();
        assertEquals("PERDER", faixa);     
        
        pessoa = new Pessoa(1.72, 110);
        faixa = pessoa.getSituacao();
        assertEquals("PERDER", faixa);

        pessoa = new Pessoa(1.72, 130);
        faixa = pessoa.getSituacao();
        assertEquals("PERDER", faixa);
    }
    
}
