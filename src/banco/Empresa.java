package banco;

public class Empresa extends Conta {
    private String cnpj;
    private String nome;
    
    
    public Empresa(int numero, int dataAbertura, double saldo, double tarifa, String cnpj, String nome) {
        super(numero, dataAbertura, saldo, tarifa);
        this.cnpj = cnpj;
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
