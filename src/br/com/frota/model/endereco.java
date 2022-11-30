package br.com.frota.model;

public class endereco extends GenericModel {
	private String rua, numero, complemento, bairro, CEP, cidade;

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
	public endereco(String rua, String numero, String complemento, String bairro, String CEP, String cidade) {
		this.rua = rua;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.CEP = CEP;
		this.cidade = cidade;
	}
	
	
	public endereco(Integer id,String rua, String numero, String complemento, String bairro, String CEP, String cidade) {
		super.setId(id);
		this.rua = rua;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.CEP = CEP;
		this.cidade = cidade;
	}
	@Override
	public String toString() {
		return "endereco [id="+getId()+"rua=" + rua + ", numero=" + numero + ", complemento=" + complemento + ", bairro=" + bairro
				+ ", CEP=" + CEP + ", cidade=" + cidade + "]";
	}

}
