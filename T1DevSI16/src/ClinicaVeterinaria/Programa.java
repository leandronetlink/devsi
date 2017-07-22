/*
 * TRABALHO1 DE PROGRAMAÇÃO 2
 * INTEGRANTES:
 * Luan Oliveira da Silva
   Leandro dos Santos Araújo 
   Gustavo Soares Ribeiro
 * 
 * */

package ClinicaVeterinaria;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// instancia objetos para novas especies
		Especie gatos = new Especie("Felis Catus");
		Especie cachorros = new Especie("Canis Lupus");

		Cliente[] clientes = { new Cliente("Fulano", "Rua x", 92568547, 670011, "cliente@mail.com"),
				new Cliente("Ciclano", "Rua y", 92568647, 670001, "cliente@mail.com"),
				new Cliente("Beltrano", "Rua z", 92568747, 670021, "cliente@mail.com"),
				new Cliente("Beltrano", "Rua z", 92568747, 670021, "cliente@mail.com"),
				new Cliente("Beltrano", "Rua z", 92568747, 670021, "cliente@mail.com") };
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.US);

		System.out.println("Digite as informações de 5 Clientes");
		for (Cliente cliente : clientes) {
			System.out.print("Nome:");
			cliente.setNomeCliente(scanner.next());
			System.out.print("CEP:");
			cliente.setCep(scanner.nextInt());
			System.out.print("Email:");
			cliente.setEmail(scanner.next());
			System.out.print("Telefone:");
			cliente.setTelefone(scanner.nextInt());
			System.out.print("Endereco:");
			cliente.setEndereco(scanner.next());
			System.out.println("===============================================");

		}

		Veterinario[] veterinarios = { new Veterinario("Luan", "FL12", 991198811),
				new Veterinario("Silva ", "FL31 Quadra 21 Lote 13", 991196769),
				new Veterinario("Silva ", "FL31 Quadra 21 Lote 13", 991196769),
				new Veterinario("Silva ", "FL31 Quadra 21 Lote 13", 991196769),
				new Veterinario("Silva ", "FL31 Quadra 21 Lote 13", 991196769) };
		  
		
		
		Scanner s = new Scanner(System.in);
		  s.useLocale(Locale.US);
		  System.out.println("Digite as informações de 5 Veterinarios"); for
		  (Veterinario veterinario : veterinarios) {
		  System.out.print("Nome do Veterinario: ");
		  veterinario.setNomeVeterinario(s.next());
		  
		  System.out.print("Telefone:");
		 
		 	veterinario.setTelefoneVeterinario(s.nextInt());
		  
		  System.out.print("Endereco: "); veterinario.setEnderecoVeterinario(s.next());
		  System.out.println("===============================================");
		  } 
		  
		  scanner.close();
		  s.close();
		 
		// CLIENTE 1

		Animal[] pets = { new Animal("Gatuno", 1, "macho", gatos), new Animal("Catiorro", 2, "macho", cachorros) };
		clientes[0].setPets(pets);

		// Tratamentos dos dois animais do C1
		Tratamento novoTratamento = new Tratamento();
		novoTratamento.setDataInicio(1, 9, 2017);
		novoTratamento.setDataTermino(1, 12, 2017);
		novoTratamento.adicionaAnimal(pets[0]);
		Tratamento novoTratamento2 = new Tratamento();
		novoTratamento2.setDataInicio(10, 12, 2015);
		novoTratamento2.setDataTermino(1, 9, 2017);
		novoTratamento2.adicionaAnimal(pets[1]);

		// Consultas dos dois animais do C1
		Consulta[] consultas = { new Consulta("O animal esta bem", novoTratamento),
				new Consulta("O animal não esta bem", novoTratamento) };
		consultas[0].setData(1, 9, 2018);
		consultas[1].setData(12, 12, 2017);
		novoTratamento.adicionaConsultas(consultas[0]);
		novoTratamento.adicionaConsultas(consultas[1]);

		Consulta[] consultas2 = { new Consulta("O animal esta donte", novoTratamento2),
				new Consulta("O animal não esta bem", novoTratamento2) };
		consultas2[0].setData(1, 9, 2017);
		consultas2[1].setData(01, 01, 2016);
		novoTratamento2.adicionaConsultas(consultas2[0]);
		novoTratamento2.adicionaConsultas(consultas2[1]);

		// Exames dos dois animais do C1
		Exame[] exames = { new Exame("Exame de Sangue"), new Exame("Exame de fezes") };
		Exame[] exames2 = { new Exame("Exame oftamologico"), new Exame("Exame de fezes") };
		novoTratamento.getConsultas()[0].adicionaExames(exames);
		novoTratamento.getConsultas()[1].adicionaExames(exames2);

		

		novoTratamento2.getConsultas()[0].adicionaExames(exames2);
		novoTratamento2.getConsultas()[1].adicionaExames(exames);

		veterinarios[0].adicionaTratamento(novoTratamento);
		veterinarios[0].adicionaTratamento(novoTratamento2);

		clientes[0].getPets(pets, 0).adicionarTratamentosAnimal(novoTratamento);
		clientes[0].getPets(pets, 1).adicionarTratamentosAnimal(novoTratamento2);

		// IMPRIMINDO CLIENTE 1
		System.out.println(
				"======================================================================================================================");
		System.out.println("Cliente 1");
		clientes[0].clienteInfo();
		System.out.println("INFORMAÇÕES DO VETERINARIO\n" + veterinarios[0].toString());
		System.out.println();
		System.out.println(
				"======================================================================================================================");
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		// CLIENTE 2
		Animal[] pets2 = { new Animal("Thor", 1, "macho", gatos), new Animal("Loki", 2, "macho", cachorros) };
		clientes[1].setPets(pets2);

		// Tratamentos dos dois animais do C2
		Tratamento novoTratamento3 = new Tratamento();
		novoTratamento3.setDataInicio(11, 6, 2015);
		novoTratamento3.setDataTermino(1, 1, 2016);
		novoTratamento3.adicionaAnimal(pets2[0]);
		Tratamento novoTratamento4 = new Tratamento();
		novoTratamento4.setDataInicio(14, 6, 2015);
		novoTratamento4.setDataTermino(11, 8, 2017);
		novoTratamento4.adicionaAnimal(pets2[1]);

		// Consultas dos dois animais do C2
		Consulta[] consultas3 = { new Consulta("O animal esta bem", novoTratamento3),
				new Consulta("O animal precisa de exames urgentemente", novoTratamento3) };
		consultas3[0].setData(12, 5, 2014);
		consultas3[1].setData(11, 4, 2017);
		novoTratamento3.adicionaConsultas(consultas3[0]);
		novoTratamento3.adicionaConsultas(consultas3[1]);

		Consulta[] consultas4 = { new Consulta("O animal esta doente", novoTratamento4),
				new Consulta("O animal precisa de descanso", novoTratamento4) };
		consultas4[0].setData(11, 2, 2015);
		consultas4[1].setData(17, 4, 2016);
		novoTratamento4.adicionaConsultas(consultas4[0]);
		novoTratamento4.adicionaConsultas(consultas4[1]);

		// Exames dos dois animais do C2
		Exame[] exames3 = { new Exame("Exame de raio X "), new Exame("Hemograma ") };
		Exame[] exames4 = { new Exame("Exame oftamologico"), new Exame("Exame de fezes") };
		novoTratamento3.getConsultas()[0].adicionaExames(exames3);
		novoTratamento3.getConsultas()[1].adicionaExames(exames4);

		

		novoTratamento4.getConsultas()[0].adicionaExames(exames4);
		novoTratamento4.getConsultas()[1].adicionaExames(exames3);

		veterinarios[1].adicionaTratamento(novoTratamento3);
		veterinarios[1].adicionaTratamento(novoTratamento4);

		clientes[1].getPets(pets2, 0).adicionarTratamentosAnimal(novoTratamento3);
		clientes[1].getPets(pets2, 1).adicionarTratamentosAnimal(novoTratamento4);

		// IMPRIMINDO CLIENTE 2
		System.out.println("Cliente 2");
		clientes[1].clienteInfo();
		System.out.println("INFORMAÇÕES DO VETERINARIO\n" + veterinarios[1].toString());
		System.out.println();
		System.out.println(
				"======================================================================================================================");
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		// CLIENTE 3
		Animal[] pets3 = { new Animal("Xana", 1, "femea", gatos), new Animal("Dog", 2, "macho", cachorros) };
		clientes[2].setPets(pets3);

		// Tratamentos dos dois animais do C3
		Tratamento novoTratamento5 = new Tratamento();
		novoTratamento5.setDataInicio(18, 4, 2017);
		novoTratamento5.setDataTermino(1, 1, 2014);
		novoTratamento5.adicionaAnimal(pets3[0]);
		Tratamento novoTratamento6 = new Tratamento();
		novoTratamento6.setDataInicio(10, 12, 2014);
		novoTratamento6.setDataTermino(1, 9, 2015);
		novoTratamento6.adicionaAnimal(pets3[1]);

		// Consultas dos dois animais do C3
		Consulta[] consultas5 = { new Consulta("O animal necessita de cuidados especiais", novoTratamento5),
				new Consulta("O animal não esta bem", novoTratamento5) };
		consultas5[0].setData(10, 5, 2015);
		consultas5[1].setData(12, 4, 2017);
		novoTratamento5.adicionaConsultas(consultas5[0]);
		novoTratamento5.adicionaConsultas(consultas5[1]);

		Consulta[] consultas6 = { new Consulta("O animal esta bem", novoTratamento6),
				new Consulta("O animal precisa tomar remedio para a barriga", novoTratamento6) };
		consultas6[0].setData(2, 2, 2015);
		consultas6[1].setData(1, 4, 2016);
		novoTratamento6.adicionaConsultas(consultas6[0]);
		novoTratamento6.adicionaConsultas(consultas6[1]);

		// Exames dos dois animais do C3
		Exame[] exames5 = { new Exame("Urinálise"), new Exame("Gasometria") };
		Exame[] exames6 = { new Exame("Citologia de Ouvido"), new Exame("Citologia de Pele") };
		novoTratamento5.getConsultas()[0].adicionaExames(exames5);
		novoTratamento5.getConsultas()[1].adicionaExames(exames6);

		

		novoTratamento6.getConsultas()[0].adicionaExames(exames6);
		novoTratamento6.getConsultas()[1].adicionaExames(exames5);

		veterinarios[2].adicionaTratamento(novoTratamento5);
		veterinarios[2].adicionaTratamento(novoTratamento6);

		clientes[2].getPets(pets3, 0).adicionarTratamentosAnimal(novoTratamento5);
		clientes[2].getPets(pets3, 1).adicionarTratamentosAnimal(novoTratamento6);

		// IMPRIMINDO CLIENTE 3
		System.out.println("Cliente 3");
		clientes[2].clienteInfo();
		System.out.println("INFORMAÇÕES DO VETERINARIO\n" + veterinarios[2].toString());
		System.out.println();
		System.out.println(
				"======================================================================================================================");
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		// CLIENTE 4
		Animal[] pets4 = { new Animal("Gatuno", 1, "macho", gatos), new Animal("Cris", 2, "Femea", cachorros) };
		clientes[3].setPets(pets4);

		// Tratamentos dos dois animais do C4
		Tratamento novoTratamento7 = new Tratamento();
		novoTratamento7.setDataInicio(10, 6, 2016);
		novoTratamento7.setDataTermino(1, 12, 2017);
		novoTratamento7.adicionaAnimal(pets4[0]);
		Tratamento novoTratamento8 = new Tratamento();
		novoTratamento8.setDataInicio(11, 12, 2015);
		novoTratamento8.setDataTermino(12, 9, 2017);
		novoTratamento8.adicionaAnimal(pets4[1]);

		// Consultas dos dois animais do C4
		Consulta[] consultas7 = { new Consulta("O animal precisa de cirurgia", novoTratamento7),
				new Consulta("O animal esta bem", novoTratamento7) };
		consultas7[0].setData(10, 2, 2014);
		consultas7[1].setData(12, 3, 2017);
		novoTratamento7.adicionaConsultas(consultas7[0]);
		novoTratamento7.adicionaConsultas(consultas7[1]);

		Consulta[] consultas8 = { new Consulta("O animal esta necessitando de exames urgentes", novoTratamento8),
				new Consulta("O animal não esta bem", novoTratamento8) };
		consultas8[0].setData(11, 2, 2015);
		consultas8[1].setData(12, 4, 2017);
		novoTratamento8.adicionaConsultas(consultas8[0]);
		novoTratamento8.adicionaConsultas(consultas8[1]);

		// Exames dos dois animais do C4
		Exame[] exames7 = { new Exame("Hematócrito"), new Exame("Fibrinogênio") };
		Exame[] exames8 = { new Exame("Necrópsia"), new Exame("Toxicológico") };
		novoTratamento7.getConsultas()[0].adicionaExames(exames7);
		novoTratamento7.getConsultas()[1].adicionaExames(exames8);

		

		novoTratamento8.getConsultas()[0].adicionaExames(exames8);
		novoTratamento8.getConsultas()[1].adicionaExames(exames7);

		veterinarios[3].adicionaTratamento(novoTratamento7);
		veterinarios[3].adicionaTratamento(novoTratamento8);

		clientes[3].getPets(pets4, 0).adicionarTratamentosAnimal(novoTratamento7);
		clientes[3].getPets(pets4, 1).adicionarTratamentosAnimal(novoTratamento8);

		// IMPRIMINDO CLIENTE 4
		System.out.println("Cliente 4");
		clientes[3].clienteInfo();
		System.out.println("INFORMAÇÕES DO VETERINARIO\n" + veterinarios[3].toString());
		System.out.println();
		System.out.println(
				"======================================================================================================================");
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		// CLIENTE 5
		Animal[] pets5 = { new Animal("Catinho", 1, "macho", gatos), new Animal("Doguinho", 2, "macho", cachorros) };
		clientes[4].setPets(pets5);

		// Tratamentos dos dois animais do C5
		Tratamento novoTratamento9 = new Tratamento();
		novoTratamento9.setDataInicio(16, 6, 2014);
		novoTratamento9.setDataTermino(5, 1, 2015);
		novoTratamento9.adicionaAnimal(pets5[0]);
		Tratamento novoTratamento10 = new Tratamento();
		novoTratamento10.setDataInicio(10, 1, 2015);
		novoTratamento10.setDataTermino(1, 3, 2017);
		novoTratamento10.adicionaAnimal(pets5[1]);

		// Consultas dos dois animais do C5
		Consulta[] consultas9 = { new Consulta("O animal não esta bem", novoTratamento9),
				new Consulta("O animal está melhor", novoTratamento9) };
		consultas9[0].setData(1, 5, 2014);
		consultas9[1].setData(2, 5, 2017);
		novoTratamento9.adicionaConsultas(consultas9[0]);
		novoTratamento9.adicionaConsultas(consultas9[1]);

		Consulta[] consultas10 = { new Consulta("O animal esta doente e precisa de cuidados", novoTratamento8),
				new Consulta("O animal esta bem", novoTratamento8) };
		consultas10[0].setData(21, 2, 2015);
		consultas10[1].setData(23, 9, 2016);
		novoTratamento10.adicionaConsultas(consultas10[0]);
		novoTratamento10.adicionaConsultas(consultas10[1]);

		// Exames dos dois animais do C5
		Exame[] exames9 = { new Exame("Antibiograma"), new Exame("Coprológico Funcional") };
		Exame[] exames10 = { new Exame("Dosagem de Proteína e Creatinina Urinária"), new Exame("Hematócrito") };
		novoTratamento9.getConsultas()[0].adicionaExames(exames9);
		novoTratamento9.getConsultas()[1].adicionaExames(exames10);

		

		novoTratamento10.getConsultas()[0].adicionaExames(exames10);
		novoTratamento10.getConsultas()[1].adicionaExames(exames9);

		veterinarios[4].adicionaTratamento(novoTratamento9);
		veterinarios[4].adicionaTratamento(novoTratamento10);

		clientes[4].getPets(pets4, 0).adicionarTratamentosAnimal(novoTratamento9);
		clientes[4].getPets(pets4, 1).adicionarTratamentosAnimal(novoTratamento10);

		// IMPRIMINDO CLIENTE 5
		System.out.println("Cliente 5");
		clientes[4].clienteInfo();
		System.out.println("INFORMAÇÕES DO VETERINARIO\n" + veterinarios[4].toString());
		System.out.println();
		System.out.println(
				"======================================================================================================================");
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	}

}
