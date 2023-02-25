package br.edu.ifgoiano.aluno.henrique.aula4;

//Uma classe totalmente diferente da lista.
public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public Data(int dia1, int mes1, int ano1) {
		this.dia = dia1;
		this.mes = mes1;
		this.ano = ano1;
	}
	
	public String verificarDia() {
		if(this.dia > 1 && this.dia < 31) {
			System.out.println("Dia correto");
		}else {
			System.out.println("Data Incerta");
		}
		
		return verificarDia();
	}
	
	public String verificarMeses() {
		if(this.mes > 0 && this.mes < 12) {
			System.out.println("Mês contido");
		}else {
			System.out.println("Mês fora");
		}
		return verificarMeses();
	}
	
}
