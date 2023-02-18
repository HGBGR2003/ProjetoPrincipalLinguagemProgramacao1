package br.edu.ifgoiano.aluno.henrique.lista;

public class Empregado {
	private String nome;
	private String sobrenome;
	private double salamensal;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public double getSalamensal() {
		return salamensal;
	}
	public void setSalamensal(double salamensal) {
		this.salamensal = salamensal;
	}
	
	public Empregado(String nome1, String sobrenome1,double salarioMensal) {
		this.nome = nome1;
		this.sobrenome = sobrenome1;
		this.salamensal = salarioMensal;
	}
	
	public double SalarioAumentado() {
		double salarioMais10;
		salarioMais10 = this.salamensal * 1.10;
		return salarioMais10;
	}

}
