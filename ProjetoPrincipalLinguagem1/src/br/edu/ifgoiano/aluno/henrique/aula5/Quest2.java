package br.edu.ifgoiano.aluno.henrique.aula5;

public class Quest2 {

	public static void main(String[] args) {
		int[][] vetor2 = new int[5][10];
		
		for(int j = 0; j < 5; j++) {
			for(int x = 0; x < 10; x++) {
				vetor2[j][x] = x * x;
				if(vetor2[j][x] == 0) {
					System.out.print("\n");
				}
				System.out.print(" " + vetor2[j][x]);
			}
		}

	}

}
