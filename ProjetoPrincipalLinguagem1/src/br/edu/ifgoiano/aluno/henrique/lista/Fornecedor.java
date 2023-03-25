package br.edu.ifgoiano.aluno.henrique.lista;

public class Fornecedor extends Pessoa {
	float valorCredito;
	float valorDivida;
	
	public Fornecedor() {
		
	}
	
	public Fornecedor(String nome, String endereco, String numero,float valorCredito,float valorDivida) {
		super(nome, endereco, numero);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
	
	public float getValorCredito() {
		return valorCredito;
	}
	public void setValorCredito(float valorCredito) {
		this.valorCredito = valorCredito;
	}
	public float getValorDivida() {
		return valorDivida;
	}
	public void setValorDivida(float valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	public float obterSaldo() {
		float diferenca;
		diferenca = this.valorCredito - this.valorDivida;
		return diferenca;
	}
	
}
