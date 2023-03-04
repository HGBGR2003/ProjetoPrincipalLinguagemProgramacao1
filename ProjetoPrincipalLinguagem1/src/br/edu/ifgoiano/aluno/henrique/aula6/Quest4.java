package br.edu.ifgoiano.aluno.henrique.aula6;

import java.util.Arrays;

public class Quest4 {
	public static void main(String[] args) {
		double[][] vetor4 = new double[6][6];
		
		for(int l = 0; l < vetor4.length; l++) {
			for(int c = 0; c < vetor4[l].length; c++) {
				vetor4[l][c] = -1 * ((l + 1) % 2);
			}
		}
		
		for(int i = 0; i < vetor4.length; i++) {
			System.out.println(Arrays.toString(vetor4[i]));
		}

	}

}
