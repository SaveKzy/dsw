package br.edu.ifsp;

import java.util.Date;

public class Professor extends Pessoa {

    private Date dataAdmissao;
    private String formacao;

    public Professor(String prontuario, String nome, Date dataNascimento, Date dataAdmissao, String formacao) {
        super(prontuario, nome, dataNascimento);
        this.dataAdmissao = dataAdmissao;
        this.formacao = formacao;
    }
    
    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

}
