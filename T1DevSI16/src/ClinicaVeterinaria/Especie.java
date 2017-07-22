package ClinicaVeterinaria;

public class Especie {
	private String nomeEspecie;

	// contrutores
	public Especie() {
	}

	public Especie(String nomeEspecie) {
		super();
		this.nomeEspecie = nomeEspecie;
	}

	// getters e setters
	public String getNomeEspecie() {
		return nomeEspecie;
	}

	public void setNomeEspecie(String nomeEspecie) {
		this.nomeEspecie = nomeEspecie;
	}

}
