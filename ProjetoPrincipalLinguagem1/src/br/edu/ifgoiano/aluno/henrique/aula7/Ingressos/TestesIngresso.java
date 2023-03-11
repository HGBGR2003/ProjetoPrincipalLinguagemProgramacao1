package br.edu.ifgoiano.aluno.henrique.aula7.Ingressos;

public class TestesIngresso {

	public static void main(String[] args) {
		Ingresso ingresso = new Ingresso(17.75);
		ingresso.imprimirValor();
		System.out.println("--------------------------------");
		
		Vip ingressoEspecial = new Vip(100.0, 20.0);
		System.out.println("Valor do ingresso VIP: R$ " + ingressoEspecial.valorVip());
		System.out.println("--------------------------------");
		
		Normal ingressoNormal = new Normal(30.0);
		ingressoNormal.imprimirNormalIngresso();
		System.out.println("--------------------------");
		
		CamaroteInferior ingressoInferior = new CamaroteInferior(80.0, 15.0, "Setor B - Fila 23");
		ingressoInferior.imprimirValor();
		System.out.println("-------------------------------------------");
		ingressoInferior.ImprimirLocalidade();
		
		System.out.println("-------------------------------------------");
		
		CamaroteSuperior ingressoCamaSupe = new CamaroteSuperior(120.0, 25.0, 30.0);
		System.out.println("Valor do Camorote Superior: R$ " + ingressoCamaSupe.valorDoCamaroteSuperior());
		System.out.println("-------------------------------------------");
	}

}
