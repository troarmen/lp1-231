package banco;

public class ContaCorrente extends Conta {
    private double limite;
    
    public ContaCorrente(int numero, int dataAbertura, double saldo, double tarifa, double limite) {
        super(numero, dataAbertura, saldo, tarifa);
    }
    public double getLimite() {
        return limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public double calcularTarifa(){
        return tarifa;
    }

    @Override
    public void sacar(double valor){
        saldo = saldo - valor;
    }
}
