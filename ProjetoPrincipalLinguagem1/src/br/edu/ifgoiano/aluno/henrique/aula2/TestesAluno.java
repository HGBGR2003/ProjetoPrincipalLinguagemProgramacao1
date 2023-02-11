package br.edu.ifgoiano.aluno.henrique.aula2;

public class TestesAluno {

	public static void main(String[] args) {
		/*Aluno alu1 = new Aluno();
		Aluno alu2 = new Aluno();
		alu1.nome = "Henrique";		
		alu1.idade = 14;
		alu1.genero = "M";
		
		alu2.nome = "Tobias";
		alu2.idade = 42;
		alu2.genero = "M";
		
		System.out.println(alu1.nome);
		System.out.println(alu2.nome);*/
		
		System.out.println("---------------------");		
	    int idadeGerada = Aluno.gerarIdade(20, 60);
	  
	    System.out.println("A idade do aluno é " + idadeGerada);
	    
	    System.out.println("----------------------");
	    
	    String nomePessoa = Aluno.passarNomeParaMaiusculo("Paulo");
	    System.out.println(nomePessoa);
		
	}

}
