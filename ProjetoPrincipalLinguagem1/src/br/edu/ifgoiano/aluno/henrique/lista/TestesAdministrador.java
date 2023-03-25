package br.edu.ifgoiano.aluno.henrique.lista;

public class TestesAdministrador {

	public static void main(String[] args) {
		Administrador admi = new Administrador("Flavio", "rua w", "789999", 42, 7800, 20, 20);
		System.out.println("Nome: " + admi.getNome());
	    System.out.println("Endereço: " + admi.getEndereco());
	    System.out.println("Telefone: " + admi.getNumero());
	    System.out.println("Código do Setor: " + admi.getCodigoSetor());
	    System.out.println("Saldo, retirado com o imposto , mais o acrescimo fica R$ " + admi.calcularSalario());

	}

}
