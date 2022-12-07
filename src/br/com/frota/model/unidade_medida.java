package br.com.frota.model;

public class unidade_medida extends GenericModel {
	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public unidade_medida(String descricao) {
		super();
		this.descricao = descricao;
	}
	public unidade_medida(Integer id, String descricao) {
		super.setId(id);
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "unidade_medida [id="+getId()+"descricao=" + descricao + "]";
	}
	
	
}
