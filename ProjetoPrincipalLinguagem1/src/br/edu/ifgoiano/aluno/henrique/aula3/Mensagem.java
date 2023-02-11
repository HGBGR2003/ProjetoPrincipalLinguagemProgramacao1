package br.edu.ifgoiano.aluno.henrique.aula3;

public class Mensagem {
	String data;
	String autor;
	String texto;
	
	public void configurandoMensagem() {
		System.out.println("Configuração Realizada");
	}
	
	public String copiandoAtributosDaClasse(String data1,String autor1,String texto1) {
		this.data = data1;
		this.autor = autor1;
		this.texto = texto1;
		return data1;
	}
	
	public void mostreMensagemJuntada() {
		String textoDoMetodoCopiandoAtributos = null;
	    textoDoMetodoCopiandoAtributos = copiandoAtributosDaClasse(data, autor, texto);
		 System.out.println("Olá "  + autor + " sua mensagem com o texto é \"" + texto + "\" " +
	                "foi enviada na data: "
	                + data);
	}

}
