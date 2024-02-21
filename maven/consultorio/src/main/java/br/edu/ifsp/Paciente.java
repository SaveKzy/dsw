package br.edu.ifsp;

import java.util.*;
/*
public class Paciente {

	private String nome;
	private String cpf;
	private Date dtNascimento;

	public Paciente(String nome, String cpf, Date dtNascimento) {
		this.nome = nome;
		this.cpf = cpf;
		this.dtNascimento = dtNascimento;
	}

	public Paciente() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

}
*/

public class Paciente extends Pessoa {

	private Date dataNascimento;

	public Paciente(String cpf, String nome, Date dataNascimento) {
		super(cpf, nome);
		this.dataNascimento = dataNascimento;
	}

	public Paciente() {
	}

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

}