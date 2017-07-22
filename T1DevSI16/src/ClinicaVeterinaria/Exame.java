package ClinicaVeterinaria;

public class Exame {
	private String descricao;

	public Exame(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void exameInfo() {
		
		System.out.println("Descricao dos exames solicitados: " + this.descricao);
	}

}
