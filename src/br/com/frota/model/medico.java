package br.com.frota.model;

public class medico extends GenericModel {
	private String crm, nome;

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public medico(String crm, String nome) {
		this.crm = crm;
		this.nome = nome;
	}

	public medico(Integer id, String crm, String nome) {
		this.crm = crm;
		this.nome = nome;
		super.setId(id);
	}

	@Override
	public String toString() {
		return "medico [id="+getId()+"crm=" + crm + ", nome=" + nome + "]";
	}
	
	
}
