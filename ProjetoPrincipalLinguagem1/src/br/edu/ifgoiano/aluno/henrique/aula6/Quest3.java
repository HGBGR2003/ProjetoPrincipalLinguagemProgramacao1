package br.edu.ifgoiano.aluno.henrique.aula6;

public class Quest3 {

	public static void main(String[] args) {
		int[][] vetor3 = new int [6][6];
		
		for(int l = 0; l < 6;l++) {
			for(int c = 0; c < 6; c++) {
				vetor3[l][c]= l;
				System.out.print(" " + vetor3[l][c]);
			}
			System.out.print("\n");
		}
			
	}
}


