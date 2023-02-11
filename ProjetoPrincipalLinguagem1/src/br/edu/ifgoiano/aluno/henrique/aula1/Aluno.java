package br.edu.ifgoiano.aluno.henrique.aula1;

public class Aluno {
	String nome;
	String genero;
	int idade;
	

	public static int GerarIdade(int mini,int max) {
		int idadeAleatoria = (int) (Math.random() * (max - mini)) + mini;
		return idadeAleatoria;
	}
	
	public static String passarNomeParaMaiusculo(String nome) {
		return nome.toUpperCase();
	}
		
}
