package br.edu.ifgoiano.aluno.henrique.aula9;

public class Empregado extends Pessoa {
	int codigoSetor;
	double salarioBase;
	double imposto;
	
	public Empregado() {
		
	}
	
	public Empregado(String nome, String endereco, String numero,int codigoSetor,double salarioBase,double imposto) {
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
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}
	public double getImposto() {
		return imposto;
	}
	public void setImposto(float imposto) {
		this.imposto = imposto;
	}

	public double calcularSalario() {
		double diferenca;
		diferenca = this.salarioBase - (this.imposto * this.salarioBase / 100);
		return diferenca;
	}
	
}
