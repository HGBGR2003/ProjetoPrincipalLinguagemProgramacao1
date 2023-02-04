package br.edu.ifgoiano.aluno.henrique.aula1;

public class TestesAluno {

	public static void main(String[] args) {
		Aluno alu1 = new Aluno();
		Aluno alu2 = new Aluno();
		alu1.nome = "Henrique";
		alu2.nome = "Tobias";
		
		alu1.idade = 14;
		alu1.genero = "M";
		
		alu2.idade = 42;
		alu2.genero = "M";
		
		System.out.println(alu1.nome);
		System.out.println(alu2.nome);
		
	}

}
