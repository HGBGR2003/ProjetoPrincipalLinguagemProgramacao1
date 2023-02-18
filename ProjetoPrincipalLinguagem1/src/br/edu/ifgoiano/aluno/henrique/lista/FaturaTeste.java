package br.edu.ifgoiano.aluno.henrique.lista;

public class FaturaTeste {

	public static void main(String[] args) {
		Fatura f1 = new Fatura("15", "Produto grande", 24, 3);
		System.out.println(f1.getNumero() + " A descrisão é: " + f1.getDescricao() + "," + " O valor da fatura "
				+ "é " + f1.getTotalFatura());
		
		System.out.println("----------------------------------------------------------");
		
		Fatura f2 = new Fatura("22", "Produto Pequeno", 78, 10);
		System.out.println(f2.getNumero() + " A descrisão é: " + f2.getDescricao() + "," + " O valor da fatura "
				+ "é " + f2.getTotalFatura());
		
	}

}
