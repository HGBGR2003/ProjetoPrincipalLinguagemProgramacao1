package br.edu.ifgoiano.aluno.henrique.aula7.Funcionarios;

public class Funcionario {
	 String nome;
	 String matricula;
	 double salarioBase;
	
	public Funcionario(String nome, String matricula, double salarioBase) {
		this.nome = nome;
		this.matricula = matricula;
		this.salarioBase = salarioBase;
	}

	public double getSalarioBase() {
		return salarioBase;
	}
	
	
}
