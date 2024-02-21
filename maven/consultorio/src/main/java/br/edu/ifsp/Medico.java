package br.edu.ifsp;

import java.util.*;

/*
public class Medico {

	private String nome;
	private String cpf;
	private String crm;
	private ArrayList<String> especialidades;

	public Medico(String nome, String cpf, String crm, ArrayList<String> especialidades) {
		this.nome = nome;
		this.cpf = cpf;
		this.crm = crm;
		this.especialidades = especialidades;
	}

	public Medico() {
		this.especialidades = new ArrayList<>();
	}

	public void adicionarEspecialidades(String especialidade) {
		this.especialidades.add(especialidade);
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

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public ArrayList<String> getEspecialidades() {
		return especialidades;
	}

	public void setEspecialidades(ArrayList<String> especialidades) {
		this.especialidades = especialidades;
	}

}
*/

public class Medico extends Pessoa {

	private String crm;
	private ArrayList<String> especialidades;

	public Medico(String nome, String cpf, String crm, ArrayList<String> especialidades) {
		super(cpf, nome);
		this.crm = crm;
		this.especialidades = especialidades;
	}

	public Medico() {
	}

	public void adicionarEspecialidades(String especialidade) {
		this.especialidades.add(especialidade);
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public ArrayList<String> getEspecialidades() {
		return especialidades;
	}

	public void setEspecialidades(ArrayList<String> especialidades) {
		this.especialidades = especialidades;
	}

}