package br.edu.ifgoiano.aluno.henrique.aula8.Alunos;

public class Testes {
	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa("Priscila", 2001);
		String impressora2 = pessoa1.mostraDados();
		System.out.println(impressora2);
		
		System.out.println("----------------------------------------------------"
				+ "---------------------");
		
		Aluno alunoNovo = new Aluno("Pablo", 2005, 7.45);
		String impressora = alunoNovo.imprimirDados();
		System.out.println(impressora);
	}

}
