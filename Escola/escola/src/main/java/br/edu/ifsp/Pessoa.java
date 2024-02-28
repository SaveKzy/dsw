package br.edu.ifsp;

import java.time.*;
import java.util.Date;

public abstract class Pessoa {

    private String prontuario;
    private String nome;
    private Date dataNascimento;

    public Pessoa(String prontuario, String nome, Date dataNascimento) {
        this.prontuario = prontuario;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String getProntuario() {
        return prontuario;
    }

    public void setProntuario(String prontuario) {
        this.prontuario = prontuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Integer getIdade() {
        /*
         * LocalDate dNasc =
         * dataNascimento.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
         * LocalDate now = LocalDate.now();
         * return Period.between(dNasc, now).getYears();
         */
        return Period.between(dataNascimento.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), LocalDate.now())
                .getYears();
    }

}
