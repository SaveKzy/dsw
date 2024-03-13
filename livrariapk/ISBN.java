package br.edu.ifsp;

public class ISBN {

    // Atributos

    private Integer isbn10;
    private String isbn13;

    // Contrutores

    public ISBN(Integer isbn10, String isbn13) {
        this.isbn10 = isbn10;
        this.isbn13 = isbn13;
    }

    public ISBN(Integer isbn10) {
        this.isbn10 = isbn10;
    }

    public ISBN(String isbn13) {
        this.isbn13 = isbn13;
    }

    // Getters e Setters

    public Integer getIsbn10() {
        return isbn10;
    }

    public void setIsbn10(Integer isbn10) {
        this.isbn10 = isbn10;
    }

    public String getIsbn13() {
        return isbn13;
    }

    public void setIsbn13(String isbn13) {
        this.isbn13 = isbn13;
    }

    // Métodos

}
