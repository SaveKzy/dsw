package br.edu.ifsp;

import java.util.*;

public class Consulta {

	private Integer codigo;
	private String motivo;
	private Double valor;
	private Date data;
	private Medico medico;
	private Paciente paciente;

	public Consulta(Integer codigo, String motivo, Double valor, Date data, Medico medico, Paciente paciente) {
		this.codigo = codigo;
		this.motivo = motivo;
		this.valor = valor;
		this.data = data;
		this.medico = medico;
		this.paciente = paciente;
	}

	public Consulta(Medico medico, Paciente paciente) {
		this.medico = medico;
		this.paciente = paciente;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
}