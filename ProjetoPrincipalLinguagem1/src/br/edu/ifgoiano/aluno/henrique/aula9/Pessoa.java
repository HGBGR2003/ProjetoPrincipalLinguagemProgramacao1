package br.edu.ifgoiano.aluno.henrique.aula9;

public class Pessoa {
	String nome;
	String endereco;
	String numero;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, String endereco,String numero) {
		this.nome = nome;
		this.endereco = endereco;
		this.numero = numero;
	}
	
	 public Pessoa(String nome, String endereco) {
	        this(nome, endereco, null);
	 }
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}


}
