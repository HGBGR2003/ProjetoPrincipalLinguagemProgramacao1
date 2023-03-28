package br.edu.ifgoiano.aluno.henrique.aula9;

public class TestesVendedor {

	public static void main(String[] args) {
		Vendedor vendedor = new Vendedor("João", "Rua A, 123", "123456789", 1, 2000.0, 0.2, 5000.0, 0.1);
	    System.out.println("Nome: " + vendedor.getNome());
	    System.out.println("Endereço: " + vendedor.getEndereco());
	    System.out.println("Telefone: " + vendedor.getNumero());
	    System.out.println("Código do setor: " + vendedor.getCodigoSetor());
	    System.out.println("Salário base: " + vendedor.getSalarioBase());
	    System.out.println("Imposto: " + vendedor.getImposto());
	    System.out.println("Valor das vendas: " + vendedor.getValorDeVendas());
	    System.out.println("Comissão: " + vendedor.getComissao());
	    System.out.println("Salário: " + vendedor.calcularSalario());
	}

}
