package br.edu.ifgoiano.aluno.henrique.lista;

public class Empregado extends Pessoa {
	int codigoSetor;
	float salarioBase;
	float imposto;
	
	public Empregado() {
		
	}
	
	public Empregado(String nome, String endereco, String numero,int codigoSetor,float salarioBase,float imposto) {
		super(nome, endereco, numero);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}
	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
	public float getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}
	public float getImposto() {
		return imposto;
	}
	public void setImposto(float imposto) {
		this.imposto = imposto;
	}

	public float calcularSalario() {
		float diferenca;
		diferenca = this.salarioBase - (this.imposto / 100);
		return diferenca;
	}
	
}
