package br.edu.ifgoiano.aluno.henrique.aula5;

public class TesteLampada {

	public static void main(String[] args) {
		/*Lampada lampadaNova = new Lampada();
		System.out.println("A lampada está " + (lampadaNova.isEstadoDaLampadaOnouOff() ? "ligada" : "desligada"));*/
		Lampada lp = new Lampada();
		System.out.println("O número de watts da lampada é " + lp.getNumeroDeWatts());
	}

}
