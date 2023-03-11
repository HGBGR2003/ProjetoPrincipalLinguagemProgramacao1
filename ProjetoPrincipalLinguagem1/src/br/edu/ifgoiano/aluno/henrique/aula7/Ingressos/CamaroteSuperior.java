package br.edu.ifgoiano.aluno.henrique.aula7.Ingressos;

public class CamaroteSuperior extends Vip {	
	double valorAdicional;

	public CamaroteSuperior(double valor, double adicional, double valorAdicional) {
		super(valor, adicional);
		this.valorAdicional = valorAdicional;
	}

	public double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}
	
	public double valorDoCamaroteSuperior() {
		return this.valor + this.adicional + this.valorAdicional;
	}
	
}
