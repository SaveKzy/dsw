package br.edu.ifsp;

import java.time.LocalDate;
import java.time.Period;

public class Cliente {

    // Atributos
    private String cpf;
    private String nome;
    private LocalDate dataNascimento;

    // Contrutores

    public Cliente(String cpf) {
        this.cpf = cpf;
    }

    public Cliente(String cpf, String nome, LocalDate dataNascimento) {
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    // Getters e Setters

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    // Métodos

    public Integer getIdade() {

        if (dataNascimento.equals(null))
            return null;
        else {
            return Period.between(dataNascimento, LocalDate.now()).getYears();
        }
    }

}