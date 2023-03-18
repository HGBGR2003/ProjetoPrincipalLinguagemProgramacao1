package br.edu.ifgoiano.aluno.henrique.aula8.Animais;

public class Peixe extends Animal {

	String caracteristica;
	
	public Peixe(String nome, float comprimento, int numeroDEPastas, String cor, String ambiente, float velocidade, String caracteristicas) {
		super(nome, comprimento, numeroDEPastas, cor, ambiente, velocidade);
		this.caracteristica = caracteristicas;
	}
	
	public void dadosDOPeixe() {
		System.out.println(this.nome + "," + this.comprimento + "," + this.numeroDEPastas + "," + this.cor
				+ "," + this.ambiente + "," + this.velocidade + "," + this.caracteristica);
	}

}
