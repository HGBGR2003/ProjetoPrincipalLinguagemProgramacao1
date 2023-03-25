package br.edu.ifgoiano.aluno.henrique.lista;

public class Operario extends Empregado {
	double valorProducao;
	double comissao;
	
	public Operario() {
		
	}
	
	
	public Operario(String nome, String endereco, String numero, int codigoSetor, float salarioBase, float imposto,
			float valorProducao,float comissao) {
		super(nome, endereco, numero, codigoSetor, salarioBase, imposto);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}



	public double getValorProducao() {
		return valorProducao;
	}
	public void setValorProducao(float valorProducao) {
		this.valorProducao = valorProducao;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(float comissao) {
		this.comissao = comissao;
	}


	@Override
	public double calcularSalario() {
		double salarioComissionado = super.calcularSalario();
		salarioComissionado = salarioComissionado + (this.valorProducao * this.comissao) / 100;
		return salarioComissionado;
	}
}
