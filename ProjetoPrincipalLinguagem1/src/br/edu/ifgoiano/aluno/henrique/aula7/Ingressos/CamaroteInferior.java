package br.edu.ifgoiano.aluno.henrique.aula7.Ingressos;

public class CamaroteInferior extends Vip {
	String localizacaoDoCinema;
	
	public String getLocalizacaoDoCinema() {
		return localizacaoDoCinema;
	}

	public void setLocalizacaoDoCinema(String localizacaoDoCinema) {
		this.localizacaoDoCinema = localizacaoDoCinema;
	}
	
	public void ImprimirLocalidade() {
		System.out.println("Localização do Ingresso: " + this.localizacaoDoCinema);
	}

}
