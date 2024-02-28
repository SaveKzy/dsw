package br.edu.ifsp;

import java.util.ArrayList;
import java.util.Date;

public class Turma {

    private String codigo;
    private Date dataInicio;
    private Date dataTermino;

    private Disciplina disciplina;
    private Professor professor;

    private ArrayList<Aluno> alunos = new ArrayList<>();

    public Turma(String codigo, Date dataInicio, Date dataTermino, Disciplina disciplina, Professor professor) {
        this.codigo = codigo;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.disciplina = disciplina;
        this.professor = professor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(Date dataTermino) {
        this.dataTermino = dataTermino;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

}
