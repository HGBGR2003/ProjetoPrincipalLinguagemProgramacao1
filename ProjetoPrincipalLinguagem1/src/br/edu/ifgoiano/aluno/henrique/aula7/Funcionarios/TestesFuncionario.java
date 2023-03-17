package br.edu.ifgoiano.aluno.henrique.aula7.Funcionarios;

public class TestesFuncionario {

	public static void main(String[] args) {
		Funcionario funcio = new Funcionario("A", "B", 1000);
		Vendedor vend1 = new Vendedor("Mario", "1453", 3512.67);
		Assistente assis1 = new Assistente("Marcola", "145623021", 1444);
		Gerente gere1 = new Gerente("Nome","4545", 1450, "L");
		
		double soma;
		soma = funcio.getSalarioBase() + gere1.getSalarioBase() + assis1.getSalarioBase() + vend1.getSalarioBase();
		System.out.println("A soma dos valores é " + soma);
		
	}

}
