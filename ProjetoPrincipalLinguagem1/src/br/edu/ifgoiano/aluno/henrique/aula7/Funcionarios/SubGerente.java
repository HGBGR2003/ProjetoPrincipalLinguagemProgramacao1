package br.edu.ifgoiano.aluno.henrique.aula7.Funcionarios;

public class SubGerente extends Gerente {
	String departamento;

	public SubGerente(String nome, String matricula, double salarioBase, String localDelotacao,String departamento) {
		super(nome, matricula, salarioBase, localDelotacao);
		this.departamento = departamento;
	}
	
	
	
	

}
