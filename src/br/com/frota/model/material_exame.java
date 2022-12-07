package br.com.frota.model;

public class material_exame extends GenericModel {
	private String material, observacao;

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public material_exame(String material, String observacao) {
		super();
		this.material = material;
		this.observacao = observacao;
	}
	public material_exame(Integer id, String material, String observacao) {
		super.setId(id);
		this.material = material;
		this.observacao = observacao;
	}

	@Override
	public String toString() {
		return "material_exame [id="+getId()+"material=" + material + ", observacao=" + observacao + "]";
	}
	
}
