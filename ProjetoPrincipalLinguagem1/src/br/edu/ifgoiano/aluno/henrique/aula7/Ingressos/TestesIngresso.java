package br.edu.ifgoiano.aluno.henrique.aula7.Ingressos;

public class TestesIngresso {
	
	public static void main(String[] args) {
		Ingresso i1 = new Ingresso();
		Vip vi1 = new Vip();
		Normal normal = new Normal();
		CamaroteInferior ci = new CamaroteInferior();
		CamaroteSuperior cs = new CamaroteSuperior();
		
		vi1.imprimirValor();
		normal.imprimirNormalIngresso();
	}

}


