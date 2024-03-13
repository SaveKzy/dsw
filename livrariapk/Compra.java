package br.edu.ifsp;

import java.util.ArrayList;

public class Compra {

    // Atributos

    private Integer id;
    private Cliente cliente;
    private ArrayList<LivroComprado> livrosComprados;

    // Contrutores

    public Compra() {
        livrosComprados = new ArrayList<>();
    }

    // Getters e Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<LivroComprado> getLivrosComprados() {
        return livrosComprados;
    }

    public void setLivrosComprados(ArrayList<LivroComprado> livrosComprados) {
        this.livrosComprados = livrosComprados;
    }

    // Métodos

    public void adicionarLivroComprado(LivroComprado livroComprado) {
        this.livrosComprados.add(livroComprado);
    }

    public void removerLivroComprado(LivroComprado livroComprado) {
        this.livrosComprados.remove(livroComprado);
    }

    public Double getValorTotal() {
        Double valorTotal = 0.0;
        for (LivroComprado livroComprado : livrosComprados) {
            valorTotal += livroComprado.getLivro().getPreco() * livroComprado.getQuantidade();
        }
        return valorTotal;
    }

    

}
