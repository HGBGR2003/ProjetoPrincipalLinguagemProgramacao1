package br.edu.ifgoiano.aluno.henrique.lista;

public class TestesInteiroSet {

	public static void main(String[] args) {
		InteiroSet vetor1 = new InteiroSet();
		InteiroSet vetor2 = new InteiroSet();

		vetor1.InsereElemento(5);
		vetor1.InsereElemento(10);
		vetor2.InsereElemento(10);
		vetor2.InsereElemento(15);
		
		InteiroSet vetorUniao = vetor1.IntercecaoDoVetor(vetor2);
		System.out.println("O(s) número(s) que estão contido entre os dois vetores "
				+ vetorUniao.converteEmStrings());
		
	}

}
