package br.edu.ifgoiano.aluno.henrique.aula3;

public class TestesMensagem {

	public static void main(String[] args) {
		Mensagem m1 = new Mensagem();
		m1.configurandoMensagem();
		m1.copiandoAtributosDaClasse("11/02/2022","Mario","Toda mais vida");
		System.out.println("-------------------------------------------------------------------------------------");
		m1.mostreMensagemJuntada();   

	}

}
