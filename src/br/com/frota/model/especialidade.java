package br.com.frota.model;

public class especialidade extends GenericModel {
	private String descricao;
	private String observavacao;
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getObservavacao() {
		return observavacao;
	}
	public void setObservavacao(String observavacao) {
		this.observavacao = observavacao;
	}
	public especialidade(String descricao, String observavacao) {
		this.descricao = descricao;
		this.observavacao = observavacao;
	}
	public especialidade(Integer id, String descricao, String observavacao) {
		this.descricao = descricao;
		this.observavacao = observavacao;
		super.setId(id);
	}
	@Override
	public String toString() {
		return "especialidade [id="+getId()+"descricao=" + descricao + ", observavacao=" + observavacao + "]";
	}
	
	
}
