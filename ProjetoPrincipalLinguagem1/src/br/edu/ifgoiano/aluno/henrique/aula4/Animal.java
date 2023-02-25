package br.edu.ifgoiano.aluno.henrique.aula4;

public class Animal {
	private String nome;
	private float comprimento;
	private int numeroPatas;
	private String cor;
	private String ambiente;
	private float velociMedia;
	
	public Animal(String nome, float comprimento, int numeroPatas, String cor, String ambiente, float velociMedia) {
		this.nome = nome;
		this.comprimento = comprimento;
		this.numeroPatas = numeroPatas;
		this.cor = cor;
		this.ambiente = ambiente;
		this.velociMedia = velociMedia;
	}
	
	//Métodos get e setter.
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
	public int getNumeroPatas() {
		return numeroPatas;
	}
	public void setNumeroPatas(int numeroPatas) {
		this.numeroPatas = numeroPatas;
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
	public float getVelociMedia() {
		return velociMedia;
	}
	public void setVelociMedia(float velociMedia) {
		this.velociMedia = velociMedia;
	}

	@Override
	public String toString() {
		return "Animal [nome=" + nome + ", comprimento=" + comprimento + ", numeroPatas=" + numeroPatas + ", cor=" + cor
				+ ", ambiente=" + ambiente + ", velociMedia=" + velociMedia + "]";
	}
	
}
