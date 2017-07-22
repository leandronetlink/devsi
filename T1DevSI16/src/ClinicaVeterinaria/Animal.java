package ClinicaVeterinaria;

public class Animal{
		private String nome;
		private int idade;
		private String sexo;
		private Especie espPet;
		private Tratamento[] tratamentos = new Tratamento[1];
		
		//construtores
		public Animal(){
				}
		public Animal(String nome, int idade, String sexo, Especie espPet) {
					this.nome = nome;
					this.idade = idade;
					this.sexo = sexo;
					this.espPet = espPet;
		}
		
		public Especie getEspPet() {
			return espPet;
		}
		public void setEspPet(Especie espPet) {
			this.espPet = espPet;
		}
		

		public Tratamento[] getTratamentos() {
			return tratamentos;
		}
		int contador;//Contador do vetor
		
		public void adicionarTratamentosAnimal(Tratamento tratamentos) {
			this.tratamentos[contador] = tratamentos;
			contador++;
		}
		
		
		//metodo de informacoes do animal 
		public void animalInfo(){
			System.out.println("NOME DO ANIMAL: "+this.nome);
			System.out.println("IDADE: "+this.idade+" ano(s)");
			System.out.println("SEXO: "+this.sexo);
			System.out.println("ESPECIE: "+espPet.getNomeEspecie());
			System.out.println("---------------------TRATAMENTOS---------------------------");
			for (Tratamento tratamento : tratamentos) {
				tratamento.consultarTratamento();
			}
			System.out.println();
		}
		
		//geters e setters
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
		public String getSexo() {
			return sexo;
		}
		public void setSexo(String sexo) {
			this.sexo = sexo;
		}
		
		

}
