package br.com.frota.model;

public class sigla_formacao extends GenericModel {
	private String sigla;

	public sigla_formacao(String sigla) {
		this.sigla = sigla;
	}
	public sigla_formacao(Integer id, String sigla) {
		this.sigla = sigla;
		super.setId(id);
	}

	
	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	@Override
	public String toString() {
		return "sigla_formacao [id="+getId()+"sigla=" + sigla + "]";
	}
}
