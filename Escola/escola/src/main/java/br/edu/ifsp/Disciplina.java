package br.edu.ifsp;

public class Disciplina {
    private String codigo;
    private String nome;
    private Integer qntMaxAlunos;

    public Disciplina(String codigo, String nome, Integer qntMaxAlunos) {
        this.codigo = codigo;
        this.nome = nome;
        this.qntMaxAlunos = qntMaxAlunos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQntMaxAlunos() {
        return qntMaxAlunos;
    }

    public void setQntMaxAlunos(Integer qntMaxAlunos) {
        this.qntMaxAlunos = qntMaxAlunos;
    }

}
