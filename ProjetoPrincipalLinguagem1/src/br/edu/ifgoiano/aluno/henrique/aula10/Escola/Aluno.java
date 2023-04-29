package br.edu.ifgoiano.aluno.henrique.aula10.Escola;

public class Aluno extends Curso {
	int id;
	String nome;
	int cpf;
	Matricula [] idsMatricula = new Matricula[0];
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public Matricula[] getIdsMatricula() {
		return idsMatricula;
	}
	public void setIdsMatricula(Matricula[] idsMatricula) {
		this.idsMatricula = idsMatricula;
	}


}
