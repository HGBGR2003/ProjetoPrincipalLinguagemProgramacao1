package br.edu.ifgoiano.aluno.henrique.aula2;

import javax.swing.JOptionPane;

public class Soma {

	public static void main(String[] args) {
		int b,a;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Informe um número?"));
	    b = Integer.parseInt(JOptionPane.showInputDialog(null, "Infomre outro número?"));
	    
	    int soma = a + b;
	    
	    System.out.println("A soma é " + soma);

	}

}
