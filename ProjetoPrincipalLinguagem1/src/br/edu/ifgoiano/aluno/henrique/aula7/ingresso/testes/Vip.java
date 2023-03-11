package br.edu.ifgoiano.aluno.henrique.aula7.ingresso.testes;

public class Vip extends Ingresso {
	@Override
	public float imprimirValor(float valor1) {
		// TODO Auto-generated method stub
		return super.imprimirValor(valor1);
	}
	
	public float imprimindoAumentado(float vip) {
		float soma;
		soma = this.valor + vip;
		return soma;
		
	}

}
