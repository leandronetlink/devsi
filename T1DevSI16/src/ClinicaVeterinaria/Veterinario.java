package ClinicaVeterinaria;

public class Veterinario {
	private String nomeVeterinario;
	private String enderecoVeterinario;
	private int telefoneVeterinario;
	private Tratamento[] vetorTratamento = new Tratamento[2];

	public String getNomeVeterinario() {
		return nomeVeterinario;
	}

	public void setNomeVeterinario(String nomeVeterinario) {
		this.nomeVeterinario = nomeVeterinario;
	}

	public String getEnderecoVeterinario() {
		return enderecoVeterinario;
	}

	public void setEnderecoVeterinario(String enderecoVeterinario) {
		this.enderecoVeterinario = enderecoVeterinario;
	}

	public int getTelefoneVeterinario() {
		return telefoneVeterinario;
	}

	public void setTelefoneVeterinario(int telefoneVeterinario) {
		this.telefoneVeterinario = telefoneVeterinario;

	}

	public Tratamento[] getVetorTratamento() {
		return vetorTratamento;
	}

	public void setVetorConsulta(Tratamento[] vetorTratamento) {
		this.vetorTratamento = vetorTratamento;
	}

	public Veterinario() {

	}

	public Veterinario(String nomeVeterinario, String enderecoVeterinario, int telefoneVeterinario) {
		super();
		this.nomeVeterinario = nomeVeterinario;
		this.enderecoVeterinario = enderecoVeterinario;
		this.telefoneVeterinario = telefoneVeterinario;
	}

	@Override
	public String toString() {
		return "Veterinario: " + nomeVeterinario + " \nEndereco do Veterinario: " + enderecoVeterinario
				+ "\nTelefone do Veterinario: " + telefoneVeterinario;
	}

	private int i = 0; // Contador

	public void adicionaTratamento(Tratamento vetorTratamento) {
		this.vetorTratamento[i] = vetorTratamento;
		i++;
	}

}
