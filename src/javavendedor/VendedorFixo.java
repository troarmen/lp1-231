package javavendedor;

public class VendedorFixo extends Vendedor {
    private double salario;

    public VendedorFixo(String nome, double vendas, double comissao, double salario){
        super(nome, vendas, salario);
        this.salario = salario;
    }
    @Override
    public double obterSalario(){
        return (vendas *(comissao/100)) + salario;
    }
}
