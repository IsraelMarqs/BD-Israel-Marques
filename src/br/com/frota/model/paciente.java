package br.com.frota.model;

import java.sql.Date;

public class paciente extends GenericModel {
	private String nome;
	private Date dt_nascimento;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDt_nascimento() {
		return dt_nascimento;
	}
	public void setDt_nascimento(Date dt_nascimento) {
		this.dt_nascimento = dt_nascimento;
	}
	public paciente(String nome, Date dt_nascimento) {
		this.nome = nome;
		this.dt_nascimento = dt_nascimento;
	}
	public paciente(Integer id, String nome, Date dt_nascimento) {
		this.nome = nome;
		this.dt_nascimento = dt_nascimento;
		super.setId(id);
	}
	@Override
	public String toString() {
		return "paciente [id="+getId()+"nome=" + nome + ", dt_nascimento=" + dt_nascimento + "]";
	}
	
}
