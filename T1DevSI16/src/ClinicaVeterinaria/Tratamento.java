package ClinicaVeterinaria;

import java.util.Date;

public class Tratamento {
	private Date dataInicio = new Date();
	private Date dataTermino = new Date();
	private Animal animal = new Animal();
	private Consulta[] consultas = new Consulta[2];

	public Tratamento() {

	}

	public Tratamento(Date dataInicio, Date dataTermino) {
		super();
		this.dataInicio = dataInicio;
		this.dataTermino = dataTermino;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setA(Animal animal) {
		this.animal = animal;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(int dia, int mes, int ano) {
		this.dataInicio.setDate(dia);
		this.dataInicio.setMonth(mes);
		this.dataInicio.setYear(ano);
	}

	public Date getDataTermino() {
		return dataTermino;
	}

	public void setDataTermino(int dia, int mes, int ano) {
		this.dataInicio.setDate(dia);
		this.dataInicio.setMonth(mes);
		this.dataInicio.setYear(ano);
	}

	public void adicionaAnimal(Animal animal) {
		this.animal = animal;
	}

	public void consultarTratamento() {
		System.out.println("Data de inicio do Tratamento: " + this.dataInicio);
		System.out.println("Data de termino do Tratamento: " + this.dataTermino);
		System.out.println("---------------------CONSULTAS----------------------------");
		for (Consulta consulta : consultas) {
			consulta.consultaInfo();
		}
	}

	public Consulta[] getConsultas() {
		return this.consultas;
	}

	private int i = 0; // Contador

	public void adicionaConsultas(Consulta consultas) {
		this.consultas[i] = consultas;
		i++;
	}

}
