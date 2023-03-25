package br.edu.ifgoiano.aluno.henrique.lista;

public class TestesFornecedor {

	public static void main(String[] args) {
		Fornecedor forn1 = new Fornecedor("Abelio", "Rua Augustos", "789953212",8000,7500);
		System.out.println("Nome: " + forn1.getNome());
	    System.out.println("Endereço: " + forn1.getEndereco());
	    System.out.println("Telefone: " + forn1.getNumero());
	    System.out.println("Saldo: R$ " + forn1.obterSaldo()); 

		System.out.println("-----------------------------");
		
		Fornecedor forn2 = new Fornecedor("Maria", "Rua B, 456", "14265226-2252",10000, 1000);
		System.out.println("Nome: " + forn2.getNome());
	    System.out.println("Endereço: " + forn2.getEndereco());
	    System.out.println("Telefone: " + forn2.getNumero());
	    System.out.println("Saldo: R$ " + forn2.obterSaldo()); 
		
	}

}
