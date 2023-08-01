package banco;

public class Correntista extends Conta{
    
    private int codigo;
    private String nome;
    //private List<Conta> contas;
    
    

    public Correntista(int numero, int dataAbertura, double saldo, double tarifa, int codigo, String nome) {
        super(numero, dataAbertura, saldo, tarifa);
        this.codigo = codigo;
        this.nome = nome;
        //this.contas = contas;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
