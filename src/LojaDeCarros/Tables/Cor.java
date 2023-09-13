package LojaDeCarros.Tables;

public class Cor {
    private int id;
    private String nome;
    private CategoriaCor categoriaCor;

    public Cor(int id, String nome, CategoriaCor categoriaCor) {
        this.id = id;
        this.nome = nome;
        this.categoriaCor = categoriaCor;
        categoriaCor.addCor(this);
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
