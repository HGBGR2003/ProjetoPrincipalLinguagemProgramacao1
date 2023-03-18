 package br.edu.ifgoiano.aluno.henrique.aula7.Ingressos;

public class Vip extends Ingresso {
	double adicional;
	
	public Vip(double valor,double adicional) {
		super(valor);
		this.adicional = adicional;
	}
	
	public double valorVip() {
		return this.valor + this.adicional;
	}
	
	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}

}
