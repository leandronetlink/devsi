package ClinicaVeterinaria;

public class Cliente {
	private String nomeCliente;
	private String endereco;
	private int telefone;
	private int cep;
	private String email;
	private Animal[] pets = new Animal[2];
	private static int identificador = 0;

	// contrutores
	public Cliente() {
	}

	public Cliente(String nomeCliente, String endereco, int telefone, int cep, String email) {
		super();
		this.nomeCliente = nomeCliente;
		this.endereco = endereco;
		this.telefone = telefone;
		this.cep = cep;
		this.email = email;
		identificador++;
	}
	// getters e setters

	public String getNomeCliente() {
		return nomeCliente;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static int getIdentificador() {
		return identificador;
	}

	public static void setIdentificador(int identificador) {
		Cliente.identificador = identificador;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public void setPets(Animal[] pets) {
		this.pets = pets;
	}

	public Animal getPets(Animal[] pets, int posicao) {
		return this.pets[posicao];

	}

	// metodo de dados do cliente
	public void clienteInfo() {
		System.out.print("NOME: " + this.nomeCliente);
		System.out.print("\t|ENDERECO: " + this.endereco);
		System.out.print("\t|TELEFONE: " + this.telefone);
		System.out.print("\t|CEP: " + this.cep);
		System.out.println("\t|E-MAIL: " + this.email);
		System.out.println("----------------------------ANIMAIS-----------------------------------");
		// aqui esta instanciado o metodo que imprime dados dos animais de um cliente
		for (Animal animal : pets) {
			System.out.println("---------------------------------------------------------------");
			animal.animalInfo();
		}
		
	}

}
