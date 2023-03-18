package br.edu.ifgoiano.aluno.henrique.aula8.Alunos;

public class Pessoa {
	String nome;
	int anoDeNascimento;
	
	public Pessoa(String nomePessoa, int anoDeNascimentoPessoa) {
		this.nome = nomePessoa;
		this.anoDeNascimento = anoDeNascimentoPessoa;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAnoDeNascimento() {
		return anoDeNascimento;
	}
	public void setAnoDeNascimento(int anoDeNascimento) {
		this.anoDeNascimento = anoDeNascimento;
	}
	
	public String mostraDados() {
		return "O nome da Pessoa é " + this.nome + " e seu ano de nascimento é "
				+ this.anoDeNascimento;
	}

}
