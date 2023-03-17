package br.edu.ifgoiano.aluno.henrique.aula7.Funcionarios;

public class Gerente extends Funcionario {
	String localDeLotacao;

	public Gerente(String nome, String matricula, double salarioBase, String localDelotacao) {
		super(nome, matricula, salarioBase);
		this.localDeLotacao = localDelotacao;
	}

}
