package br.edu.ifgoiano.aluno.henrique.aula8.Animais;

public class Animal {
	String nome;
	float comprimento;
	int numeroDEPastas;
	String cor;
	String ambiente;
	float velocidade;
	
	public Animal(String nome, float comprimento, int numeroDEPastas, String cor, String ambiente, float velocidade) {
		this.nome = nome;
		this.comprimento = comprimento;
		this.numeroDEPastas = numeroDEPastas;
		this.cor = cor;
		this.ambiente = ambiente;
		this.velocidade = velocidade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getComprimento() {
		return comprimento;
	}
	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}
	public int getNumeroDEPastas() {
		return numeroDEPastas;
	}
	public void setNumeroDEPastas(int numeroDEPastas) {
		this.numeroDEPastas = numeroDEPastas;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	public float getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}
	
	


}
