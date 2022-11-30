package br.com.frota.model;

public class contato extends GenericModel{
	private String telefone;
	
	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	

	public contato(String telefone) {
		this.telefone = telefone;
	}
	public contato(Integer id, String telefone) {
		super.setId(id);
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "contato [id="+getId()+"telefone=" + telefone + "]";
	}
	
}
