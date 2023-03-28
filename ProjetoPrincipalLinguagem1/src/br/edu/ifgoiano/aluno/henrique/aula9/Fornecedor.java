package br.edu.ifgoiano.aluno.henrique.aula9;

public class Fornecedor extends Pessoa {
	double valorCredito;
	double valorDivida;
	
	public Fornecedor() {
		
	}
	
	public Fornecedor(String nome, String endereco, String numero,float valorCredito,float valorDivida) {
		super(nome, endereco, numero);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
	
	public double getValorCredito() {
		return valorCredito;
	}
	public void setValorCredito(float valorCredito) {
		this.valorCredito = valorCredito;
	}
	public double getValorDivida() {
		return valorDivida;
	}
	public void setValorDivida(float valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	public double obterSaldo() {
		double diferencaDeSaldo;
		diferencaDeSaldo = this.valorCredito - this.valorDivida;
		return diferencaDeSaldo;
	}
	
}
