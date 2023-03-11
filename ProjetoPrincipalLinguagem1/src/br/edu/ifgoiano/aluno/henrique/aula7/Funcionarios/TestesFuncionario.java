package br.edu.ifgoiano.aluno.henrique.aula7.Funcionarios;

public class TestesFuncionario {

	public static void main(String[] args) {
		Vendedor vend1 = new Vendedor("Mario", "1453", 3512.67);
		Assistente assis1 = new Assistente("Marcola", "145623021", 1444);
		Gerente gere1 = new Gerente("Murilo", "789213", 7800);
		
		double soma;
		soma = gere1.getSalarioBase() + assis1.getSalarioBase() + vend1.getSalarioBase();
		System.out.println("A soma dos valores é " + soma);
		
	}

}
