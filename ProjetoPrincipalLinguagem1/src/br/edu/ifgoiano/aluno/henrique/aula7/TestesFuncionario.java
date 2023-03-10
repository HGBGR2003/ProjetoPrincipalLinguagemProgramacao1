package br.edu.ifgoiano.aluno.henrique.aula7;

public class TestesFuncionario {

	public static void main(String[] args) {
		Vendedor v1 = new Vendedor("Mario", "1453", 3500);
		Assistente a1 = new Assistente("Marcola", "145623021", 1444);
		Gerente g1 = new Gerente("Murilo", "789213", 7800);
		
		double soma;
		soma = v1.getSalarioBase() + a1.getSalarioBase() + v1.getSalarioBase();
		System.out.println("A soma dos valores é " + soma);
		
	}

}
