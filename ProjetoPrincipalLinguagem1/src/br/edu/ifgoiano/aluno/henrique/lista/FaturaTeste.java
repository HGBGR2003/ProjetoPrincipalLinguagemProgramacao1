package br.edu.ifgoiano.aluno.henrique.lista;

public class FaturaTeste {

	public static void main(String[] args) {
		Fatura f1 = new Fatura();
		/*f1.setDescricao("Este produto é uma laranja.");
		System.out.println(f1.getDescricao());*/

		//Número
		/*f1.setNumero("24");
		System.out.println(f1.getNumero());*/
		// Quantidade de produtos
		f1.setQuantiCompradaItem(-2);
		//Preco Item
		f1.setPrecoItem(-7);
		System.out.println(f1.getTotalFatura());
	}

}
