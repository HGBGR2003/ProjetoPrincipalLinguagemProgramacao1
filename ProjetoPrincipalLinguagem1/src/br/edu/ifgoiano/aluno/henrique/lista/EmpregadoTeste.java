package br.edu.ifgoiano.aluno.henrique.lista;

import java.text.DecimalFormat;

public class EmpregadoTeste {

	public static void main(String[] args) {
		Empregado ep1 = new Empregado("Mario", "Dinoco", 550);
		Empregado ep2 = new Empregado("Bianca", "Da Silva", 498);
		
		DecimalFormat df = new DecimalFormat("0.##");
		String dx = df.format(ep1.SalarioAumentado());
		String dz = df.format(ep2.SalarioAumentado());
		
		System.out.println("O valor da pessoa 1 anual é: " + dx);
		System.out.println("O valor da pessoa 2 anual é: " + dz);
		

	}

}
