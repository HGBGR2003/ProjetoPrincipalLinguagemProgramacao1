package br.edu.ifgoiano.aluno.henrique.aula9;

public class Administrador extends Empregado {
	double ajudaDeCusto;
	
	public Administrador() {
		
	}
	
	public Administrador(String nome, String endereco, String numero, int codigoSetor, double salarioBase,
			double imposto,double ajudaDeCusto) {
		super(nome, endereco, numero, codigoSetor, salarioBase, imposto);
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(float ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}

	@Override
	public double calcularSalario() {
		return super.calcularSalario() + this.ajudaDeCusto;
	}
}
