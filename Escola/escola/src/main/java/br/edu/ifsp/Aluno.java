package br.edu.ifsp;

import java.util.Date;

public class Aluno extends Pessoa {

    private Double valorBolsa;

    public Aluno(String prontuario, String nome, Date dataNascimento, Double valorBolsa) {
        super(prontuario, nome, dataNascimento);
        this.valorBolsa = valorBolsa;
    }

    public Double getValorBolsa() {
        return valorBolsa;
    }

    public void setValorBolsa(Double valorBolsa) {
        this.valorBolsa = valorBolsa;
    }

}
