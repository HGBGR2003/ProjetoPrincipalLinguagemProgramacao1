package br.edu.ifgoiano.aluno.henrique.aula6;

public class Quest1 {
	public static void main(String[] args) {
		int[][] vetor1 = new int[3][10];

		for(int x = 0; x < 3; x++) {
			for(int i = 0; i < 10; i++) {
				vetor1[x][i] = i;
				if(vetor1[x][i] == 0) {
					System.out.print("\n");
				}
				System.out.print(" " + vetor1[x][i]);
			}

		}
		
	}
		
	
	
}
