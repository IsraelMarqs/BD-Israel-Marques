package br.com.frota.model;

public class endereco extends GenericModel {
	private String rua, numero, complemento, bairro, CEP, cidade;
	private Integer  laboratorio_id;
	public Integer getLaboratorio_id() {
		return laboratorio_id;
	}

	public void setLaboratorio_id(Integer laboratorio_id) {
		this.laboratorio_id = laboratorio_id;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String CEP) {
		this.CEP = CEP;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public endereco(Integer laboratorio_id,String rua, String numero, String complemento, String bairro, String CEP, String cidade) {
		this.rua = rua;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.CEP = CEP;
		this.cidade = cidade;
		this.laboratorio_id = laboratorio_id;
	}
	
	
	public endereco(Integer laboratorio_id, Integer id,String rua, String numero, String complemento, String bairro, String CEP, String cidade) {
		super.setId(id);
		this.rua = rua;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.CEP = CEP;
		this.cidade = cidade;
		this.laboratorio_id = laboratorio_id;
	}
	
	@Override
	public String toString() {
		return "endereco [id="+getId()+"rua=" + rua + ", numero=" + numero + ", complemento=" + complemento + ", bairro=" + bairro
				+ ", CEP=" + CEP + ", cidade=" + cidade + "]";
	}

}
