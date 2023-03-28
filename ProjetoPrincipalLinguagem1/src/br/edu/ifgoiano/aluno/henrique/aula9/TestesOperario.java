package br.edu.ifgoiano.aluno.henrique.aula9;

public class TestesOperario {
	public static void main(String[] args) {
		Operario op = new Operario("Tobias", "Rua H","4532-12",15,5000,20,100,20);
		System.out.println("Nome: " + op.getNome());
	    System.out.println("Endereço: " + op.getEndereco());
	    System.out.println("Telefone: " + op.getNumero());
	    System.out.println("Código do Setor: " + op.getCodigoSetor());
	    System.out.println("Saldo comissionado: R$ " + op.calcularSalario()); 
	}
}
