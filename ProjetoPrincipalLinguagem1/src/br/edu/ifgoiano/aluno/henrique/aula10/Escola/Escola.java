package br.edu.ifgoiano.aluno.henrique.aula10.Escola;

public class Escola {
	String id;
	String nome;
	String endereco;
	String[] ids;
	int numeroCursos;
	
	public Escola(String id, String nome, String endereco, String [] ids,int numeroMaximoCursos) {
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.ids = new String[numeroMaximoCursos];
		this.numeroCursos = 0;
	}
	
	public int getNumeroCursos() {
		return numeroCursos;
	}

	public void setNumeroCursos(int numeroCursos) {
		this.numeroCursos = numeroCursos;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String[] getIds() {
		return ids;
	}
	public void setIds(String[] ids) {
		this.ids = ids;
	}

	

}
