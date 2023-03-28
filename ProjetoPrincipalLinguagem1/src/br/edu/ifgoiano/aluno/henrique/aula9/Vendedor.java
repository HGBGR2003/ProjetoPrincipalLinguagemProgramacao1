package br.edu.ifgoiano.aluno.henrique.aula9;

public class Vendedor extends Empregado {
	double valorDeVendas;
	double comissao;
	
	public Vendedor() {
	}
	
	
	public Vendedor(String nome, String endereco, String numero, int codigoSetor, double salarioBase, double imposto, double valorDeVendas,double comissao) {
		super(nome, endereco, numero, codigoSetor, salarioBase, imposto);
		this.valorDeVendas = valorDeVendas;
		this.comissao = comissao;
	}

	public double getValorDeVendas() {
		return valorDeVendas;
	}
	public void setValorDeVendas(double valorDeVendas) {
		this.valorDeVendas = valorDeVendas;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	@Override
	public double calcularSalario() {
		// TODO Auto-generated method stub
		return super.calcularSalario() + (this.valorDeVendas * this.comissao /100);
	}
	
}
