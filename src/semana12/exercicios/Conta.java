package semana12.exercicios;

public class Conta {
    public int codigo;
    public double saldo;
    public String correntista;
    public String retorno;

    public Conta(int codigo, double saldo, String correntista){
        this.codigo = codigo;
        this.saldo = saldo;
        this.correntista = correntista;
    }
    //Sacar
    public String sacar(double valor){
        if(this.saldo >= valor){    
            this.saldo = this.saldo - valor;
            retorno = "Saque de " + valor + " reais";
        } else{
            retorno = "Valor indisponível para saque";
        }
        return retorno;
    }
    //Depositar
    public String depositar(double valor){
        this.saldo = this.saldo + valor;
        retorno = "Depósito de "+valor+" reais";
        return retorno;
    }
    //Transferir
    public String transferir(Conta conta, double valor){
        if(this.saldo >= valor){
            this.saldo = this.saldo - valor;
            conta.saldo = conta.saldo + valor;
            retorno = "Transferência de "+valor+" reais";
        } else {
            retorno = "Saldo indisponível para transferência";
        }
        return retorno;

    }
    
}
