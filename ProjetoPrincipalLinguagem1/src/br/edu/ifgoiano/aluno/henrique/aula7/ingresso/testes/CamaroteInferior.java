package br.edu.ifgoiano.aluno.henrique.aula7.ingresso.testes;

public class CamaroteInferior extends Vip {
	String localizacaoDoCinema;

	public String getLocalizacaoDoCinema() {
		return localizacaoDoCinema;
	}

	public void setLocalizacaoDoCinema(String localizacaoDoCinema) {
		this.localizacaoDoCinema = localizacaoDoCinema;
	}
	
	public void ImprimirLocalidade(String localidade) {
		this.localizacaoDoCinema = localidade;
	}

}
