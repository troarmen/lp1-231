package banco;

public class ContaSalario extends Conta{
    private Empresa empresa;

    

    public ContaSalario(int numero, int dataAbertura, double saldo, double tarifa, Empresa empresa) {
        super(numero, dataAbertura, saldo, tarifa);
        this.empresa = empresa;
    }

    @Override
    public double calcularTarifa(){
        return tarifa;
    }
    
    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    
}
