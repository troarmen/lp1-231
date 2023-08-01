package banco;

public class Conta {
    private int numero;
    private int dataAbertura;
    protected double saldo;
    protected double tarifa;
    //private Correntista correntista;

    public Conta(int numero, int dataAbertura, double saldo, double tarifa) {
        this.numero = numero;
        this.dataAbertura = dataAbertura;
        this.saldo = saldo;
        this.tarifa = tarifa;
    }
    
    public void sacar(double valor){
        saldo = saldo - valor;
    }

    public void depositar(double valor){
        saldo = saldo + valor;
    }

    public double calcularTarifa(){
        return tarifa;
    }
    
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getDataAbertura() {
        return dataAbertura;
    }
    public void setDataAbertura(int dataAbertura) {
        this.dataAbertura = dataAbertura;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getTarifa() {
        return tarifa;
    }
    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
}
