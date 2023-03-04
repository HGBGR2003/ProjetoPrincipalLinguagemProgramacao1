package br.edu.ifgoiano.aluno.henrique.aula6;

public class TestesGerador {

	public static void main(String[] args) {
		GeradorDeArray gerador = new GeradorDeArray(5);
		String palavra = gerador.indeceCorrespondente(2);
		System.out.println(palavra);
		
		palavra = gerador.indeceCorrespondente(1);
		System.out.println(palavra);

	}

}
