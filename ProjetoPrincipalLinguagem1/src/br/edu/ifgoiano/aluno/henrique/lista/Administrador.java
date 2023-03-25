package br.edu.ifgoiano.aluno.henrique.lista;

public class Administrador extends Empregado {
	float ajudaDeCusto;
	
	public Administrador() {
		
	}
	
	public Administrador(String nome, String endereco, String numero, int codigoSetor, float salarioBase,
			float imposto,float ajudaDeCusto) {
		super(nome, endereco, numero, codigoSetor, salarioBase, imposto);
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public float getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(float ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}

	@Override
	public float calcularSalario() {
		return super.calcularSalario() + this.ajudaDeCusto;
	}

	



	
	
}
