package ClinicaVeterinaria;

import java.util.Date;

public class Consulta {
	private Date data = new Date();
	private String documentacao;
	private Tratamento tratamento;
	private Exame[] exameSolicitado = new Exame[2];

	public Consulta(String documentacao, Tratamento tratamento) {
		this.documentacao = documentacao;
		this.tratamento = tratamento;

	}

	public Tratamento getTratamento() {
		return tratamento;
	}

	public void setTratamento(Tratamento tratamento) {
		this.tratamento = tratamento;
	}

	public void consultaInfo() {

		System.out.println("Data da Consulta: " + this.data);
		System.out.println("Documentação historica: " + this.documentacao);

		for (Exame exame : exameSolicitado) {
			exame.exameInfo();
		}

	}

	public Exame[] getExameSolicitado() {
		return exameSolicitado;
	}

	public void setExameSolicitado(Exame[] exameSolicitado) {
		this.exameSolicitado = exameSolicitado;
	}

	public Date getData() {
		return data;
	}

	@SuppressWarnings("deprecation")
	public void setData(int dia, int mes, int ano) {
		this.data.setDate(dia);
		this.data.setMonth(mes);
		this.data.setYear(ano);
	}

	public void verificaConsulta() {
		System.out.println("Dia da consulta " + this.data);
		System.out.println(this.documentacao);
		for (Exame exame : exameSolicitado) {
			exame.exameInfo();
		}
	}

	public void adicionaExames(Exame[] exameSolicitado) {
		this.exameSolicitado = exameSolicitado;
	}

}
