package br.edu.ifsp;

import java.time.LocalDate;
import java.util.ArrayList;

public class Livro {

    // Atributos
    private String isbn10;
    private String isbn13;
    private String titulo;
    private LocalDate dataPublicacao;
    private Double preco;
    private idioma idioma;
    private Integer qntPaginas;
    private formato formato;
    private String descricao;
    private condicao condicao;
    private String editora;
    private Double nota;
    private Integer edicao;
    private Integer estoque;
    private ArrayList<String> escritores;

    // Contrutores

    public Livro(String isbn10, String isbn13, String titulo, LocalDate dataPublicacao, Double preco,
            br.edu.ifsp.idioma idioma, Integer qntPaginas, br.edu.ifsp.formato formato, String descricao,
            br.edu.ifsp.condicao condicao, String editora, Double nota, Integer edicao, Integer estoque,
            ArrayList<String> escritores) {
        this.isbn10 = isbn10;
        this.isbn13 = isbn13;
        this.titulo = titulo;
        this.dataPublicacao = dataPublicacao;
        this.preco = preco;
        this.idioma = idioma;
        this.qntPaginas = qntPaginas;
        this.formato = formato;
        this.descricao = descricao;
        this.condicao = condicao;
        this.editora = editora;
        this.nota = nota;
        this.edicao = edicao;
        this.estoque = estoque;
        this.escritores = escritores;
    }

    // Getters e Setters

    public String getIsbn10() {
        return isbn10;
    }

    public void setIsbn10(String isbn10) {
        this.isbn10 = isbn10;
    }

    public String getIsbn13() {
        return isbn13;
    }

    public void setIsbn13(String isbn13) {
        this.isbn13 = isbn13;
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

    public idioma getIdioma() {
        return idioma;
    }

    public void setIdioma(idioma idioma) {
        this.idioma = idioma;
    }

    public Integer getQntPaginas() {
        return qntPaginas;
    }

    public void setQntPaginas(Integer qntPaginas) {
        this.qntPaginas = qntPaginas;
    }

    public formato getFormato() {
        return formato;
    }

    public void setFormato(formato formato) {
        this.formato = formato;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public condicao getCondicao() {
        return condicao;
    }

    public void setCondicao(condicao condicao) {
        this.condicao = condicao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
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

    public ArrayList<String> getEscritores() {
        return escritores;
    }

    public void setEscritores(ArrayList<String> escritores) {
        this.escritores = escritores;
    }

    // Métodos

}