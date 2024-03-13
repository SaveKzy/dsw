package br.edu.ifsp;

import java.time.LocalDate;

public class Livro {

    // Atributos

    private ISBN isbn;//
    private String titulo;
    private LocalDate dataPublicacao;
    private Double preco;
    private String idioma;//
    private Integer qntPaginas;
    private String capa;//
    private String descricao;
    private String estado;//
    private Editora editora;
    private Double nota;
    private Integer edicao;
    private Integer estoque;
    private String escritor;// c

    // Contrutores

    public Livro() {
    }

    public Livro(ISBN isbn, String titulo, LocalDate dataPublicacao, Double preco, String idioma, Integer qntPaginas,
            String capa, String descricao, String estado, Editora editora, Double nota, Integer edicao,
            Integer estoque, String escritor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.dataPublicacao = dataPublicacao;
        this.preco = preco;
        this.idioma = idioma;
        this.qntPaginas = qntPaginas;
        this.capa = capa;
        this.descricao = descricao;
        this.estado = estado;
        this.editora = editora;
        this.nota = nota;
        this.edicao = edicao;
        this.estoque = estoque;
        this.escritor = escritor;
    }

    // Getters e Setters

    public ISBN getIsbn() {
        return isbn;
    }

    public void setIsbn(ISBN isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(LocalDate dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public Integer getQntPaginas() {
        return qntPaginas;
    }

    public void setQntPaginas(Integer qntPaginas) {
        this.qntPaginas = qntPaginas;
    }

    public String getCapa() {
        return capa;
    }

    public void setCapa(String capa) {
        this.capa = capa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public Integer getEdicao() {
        return edicao;
    }

    public void setEdicao(Integer edicao) {
        this.edicao = edicao;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }

    public String getEscritor() {
        return escritor;
    }

    public void setEscritor(String escritor) {
        this.escritor = escritor;
    }

    // Métodos

    public boolean estoque() {
        return (estoque > 0);
    }

    public boolean estoque(Integer qnt) {
        return (estoque >= qnt);
    }

}
