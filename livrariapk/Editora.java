package br.edu.ifsp;

public class Editora {
    
    // Atributos

    private String nome;
    private String cnpj;
    
    // Contrutores
    
    public Editora() {
    }
    
    public Editora(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    // Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    // Métodos

}
