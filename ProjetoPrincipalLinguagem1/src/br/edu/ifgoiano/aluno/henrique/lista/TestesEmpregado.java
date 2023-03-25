package br.edu.ifgoiano.aluno.henrique.lista;

public class TestesEmpregado {

	public static void main(String[] args) {
		Empregado empregadoAntigo = new Empregado("Fabio", "Rua t", "95213-1",89,5000,20);
		System.out.println("Nome: " + empregadoAntigo.getNome());
	    System.out.println("Endereço: " + empregadoAntigo.getEndereco());
	    System.out.println("Telefone: " + empregadoAntigo.getNumero());
	    System.out.println("Código do Setor: " + empregadoAntigo.getCodigoSetor());
	    System.out.println("Saldo, retirado com o imposto: R$ " + empregadoAntigo.calcularSalario()); 


	}

}
