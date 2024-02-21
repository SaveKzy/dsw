package br.edu.ifsp;

public abstract class Pessoa {

    /*
    protected String cpf;
    protected String nome;
    
    abstract public void setCpf(String cpf);
    abstract public String getCpf();
    
    abstract public void setNome(String nome);
    abstract public String getNome();
    */

    private String cpf;
    private String nome;

    public Pessoa() {
    }

    public Pessoa(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

}
