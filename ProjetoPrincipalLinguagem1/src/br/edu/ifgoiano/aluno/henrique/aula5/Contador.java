package br.edu.ifgoiano.aluno.henrique.aula5;

public class Contador {
	private int contando;

	public int getContando() {
		return contando;
	}

	public void setContando(int contando) {
		this.contando = contando;
	}
	
	public Contador(int contar) {
		this.contando = contar;
	}
	
	public Contador() {
		contando = 0;
	}
	
	public void incrementando() {
		contando++;
	}

}
