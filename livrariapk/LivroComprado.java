package br.edu.ifsp;

public class LivroComprado {

    // Atributos

    private Livro livro;
    private Integer quantidade;

    // Contrutores

    public LivroComprado(Livro livro, Integer quantidade) {
        this.livro = livro;
        this.quantidade = quantidade;
    }

    // Getters e Setters

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    // Métodos

    public void aumentarQuantidade() {
        this.quantidade++;
    }

    public void aumentarQuantidade(Integer quantidade) {
        this.quantidade += quantidade;
    }

}
