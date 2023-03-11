package br.edu.ifgoiano.aluno.henrique.aula7.Ingressos;

public class Ingresso {
	protected double valor;
	
	public Ingresso(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	 
	public void imprimirValor() {
		System.out.println("Valor do Ingresso: R$ %.2f%n" + this.valor);
		
	}

}
