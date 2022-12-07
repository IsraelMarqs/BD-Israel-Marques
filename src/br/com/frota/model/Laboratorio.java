package br.com.frota.model;

public class Laboratorio extends GenericModel {
    private String descricao;
    private String CNES;
    private String CRBM;
    private String CNPJ;
    private String nome_fantasia;
  
   
	public Laboratorio(Integer id, String descricao, String CNES, String CRBM, String CNPJ, String nome_fantasia) {
        super.setId(id);
		this.descricao = descricao;
		this.CNES = CNES;
		this.CRBM = CRBM;
		this.CNPJ = CNPJ;
		this.nome_fantasia = nome_fantasia;
	}

	
   
    public String getDescricao() {
		return descricao;
	}



	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



	public String getCNES() {
		return CNES;
	}



	public void setCNES(String CNES) {
		this.CNES = CNES;
	}



	public String getCRBM() {
		return CRBM;
	}



	public void setCRBM(String CRBM) {
		this.CRBM = CRBM;
	}



	public String getCNPJ() {
		return CNPJ;
	}



	public void setCNPJ(String CNPJ) {
		this.CNPJ = CNPJ;
	}



	public String getNome_fantasia() {
		return nome_fantasia;
	}



	public void setNome_fantasia(String nome_fantasia) {
		this.nome_fantasia = nome_fantasia;
	}



	@Override
	public String toString() {
		return "Laboratorio [id="+getId()+"descricao=" + descricao + ", CNES=" + CNES + ", CRBM=" + CRBM + ", CNPJ=" + CNPJ
				+ ", nome_fantasia=" + nome_fantasia + "]";
	}

}
