package br.edu.ifgoiano.aluno.henrique.aula8.Animais;

public class Peixe extends Animal {

	String caracteristica;
	
	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}

	public Peixe(String nome, float comprimento, int numeroDEPastas, String cor, String ambiente, float velocidade, String caracteristicas) {
		super(nome, comprimento, numeroDEPastas, cor, ambiente, velocidade);
		this.caracteristica = caracteristicas;
	}
	
	public void dadosDOPeixe() {
		System.out.println("O nome do animal é " + this.nome + " ela tem " + this.comprimento + " metros e seu número de (patas) é " + this.numeroDEPastas + ", e sua cor é " + this.cor
				+ "\nlogo o seu ambiente se encontra no " + this.ambiente + " há " + this.velocidade + " Km/h e finalizando esse animal é " + this.caracteristica + ".");
	}

}
