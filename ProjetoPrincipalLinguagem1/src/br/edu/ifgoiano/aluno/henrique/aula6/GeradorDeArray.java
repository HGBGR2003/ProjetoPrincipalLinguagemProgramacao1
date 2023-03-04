package br.edu.ifgoiano.aluno.henrique.aula6;

public class GeradorDeArray {
	private String[] palavras;
	
	public GeradorDeArray(int num) {
		palavras = new String[num];
		for(int i = 0; i < num; i++) {
			palavras[i] = "item" + i;
		}
	}

	public String[] getPalavras() {
		return palavras;
	}

	public void setPalavras(String[] palavras) {
		this.palavras = palavras;
	}
	
	public String indeceCorrespondente(int indice) {
		if(indice >= 0 && indice < palavras.length) {
			return palavras[indice];
		}else {
			System.out.println("Erro: indice inválido");
			return null;
		}
	}
	
	

}
