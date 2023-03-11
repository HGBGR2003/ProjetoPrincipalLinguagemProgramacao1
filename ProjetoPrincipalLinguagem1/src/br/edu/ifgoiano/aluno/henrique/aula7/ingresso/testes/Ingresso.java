package br.edu.ifgoiano.aluno.henrique.aula7.ingresso.testes;

public class Ingresso {
	 float valor;

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	 
	public float imprimirValor(float valor1) {
		this.valor = valor1;
		return imprimirValor(valor1);
		
	}

}
