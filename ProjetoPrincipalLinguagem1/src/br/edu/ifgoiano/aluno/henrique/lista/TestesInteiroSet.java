package br.edu.ifgoiano.aluno.henrique.lista;

public class TestesInteiroSet {

	public static void main(String[] args) {
		InteiroSet vetor1 = new InteiroSet();
		InteiroSet vetor2 = new InteiroSet();

		//Vetor 1
		vetor1.InsereElemento(1);
		vetor1.InsereElemento(2);
		vetor1.InsereElemento(3);
		vetor1.InsereElemento(4);
		vetor1.InsereElemento(5);
		
		//Vetor2
		vetor2.InsereElemento(3);
		vetor2.InsereElemento(4);
		vetor2.InsereElemento(5);
		vetor2.InsereElemento(6);
		vetor2.InsereElemento(7);
		
		System.out.println("O conjunto do vetor 1: " + vetor1.converteEmStrings());
		System.out.println("O conjunto do vetor 2: " + vetor2.converteEmStrings());
		
		InteiroSet vetorUniao = vetor1.uniaoDosValores(vetor2);
		System.out.println("O A união entre os dois vetores é : "
				+ vetorUniao.converteEmStrings());
		
		InteiroSet vetorInterseccao = vetor1.IntercecaoDoVetor(vetor2);
		System.out.println("Intersecção do vetor 1 e 2: " + vetorInterseccao.converteEmStrings());
		
		//Testando o removedor de Array
		vetor1.RemoveElemento(1);
		System.out.println("Vetor 1 após remover o elemento 1: " + vetor1.converteEmStrings());
		
		System.out.println("Os dois vetores são iguais? " + vetor1.eIgualA(vetor2));
		
		
	}

}
