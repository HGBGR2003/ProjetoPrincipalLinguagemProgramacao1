package br.edu.ifgoiano.aluno.henrique.aula4;

public class TesteLampada {

	public static void main(String[] args) {
		Lampada lampadaNova = new Lampada();
		System.out.println("A lampada está " + (lampadaNova.isEstadoDaLampadaOnouOff() ? "ligada" : "desligada"));
	}

}
