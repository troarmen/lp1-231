package semana12.exercicios;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ContaTest {
    @Test
    public void saca(){
        Conta conta = new Conta(1, 0.0, "Tro Armen");
        conta.depositar(50);
        String saque = conta.sacar(25);

        assertEquals(saque, "Saque de 25.0 reais");
    }

    @Test
    public void sacaIndisponivel(){
        Conta conta = new Conta(1, 0.0, "Tro Armen");
        conta.depositar(50);
        String saque = conta.sacar(70);

        assertEquals(saque, "Valor indisponível para saque");
    }

    @Test
    public void deposita(){
        Conta conta = new Conta(1, 0.0, "Domingos Latorre");
        String deposito = conta.depositar(37);

        assertEquals(deposito, "Depósito de 37.0 reais");
    }

    @Test 
    public void transfere(){
        Conta conta1 = new Conta(1, 0.0, "Ryan");
        Conta conta2 = new Conta(2, 0.0, "João");

        conta1.depositar(30);
        conta2.depositar(20);

        String transferencia = conta1.transferir(conta2, 30);

        assertEquals(transferencia, "Transferência de 30.0 reais");
    }

    @Test
    public void transfereIndisponivel(){
        Conta conta1 = new Conta(1, 0.0, "Ryan");
        Conta conta2 = new Conta(2, 0.0, "João");

        conta1.depositar(30);
        conta2.depositar(20);

        String transferencia = conta1.transferir(conta2, 80);

        assertEquals(transferencia, "Saldo indisponível para transferência");
    }
}
