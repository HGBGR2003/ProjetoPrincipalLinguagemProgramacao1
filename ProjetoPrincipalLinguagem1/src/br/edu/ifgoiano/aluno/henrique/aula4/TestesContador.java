package br.edu.ifgoiano.aluno.henrique.aula4;

public class TestesContador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Contador c1 = new Contador();
	     System.out.println("Valor inicial do contador 1: " + c1.getContando());
	     c1.incrementando();
	     System.out.println("Valor atualizado do contador 1: " + c1.getContando());
	     System.out.println("---------------------------------");
	     Contador c2 = new Contador(5);
	     System.out.println("Valor inicial do contador 2: " + c2.getContando());
	     c2.incrementando();
	     System.out.println("Valor atualizado do contador 2: " + c2.getContando());

	}

}
