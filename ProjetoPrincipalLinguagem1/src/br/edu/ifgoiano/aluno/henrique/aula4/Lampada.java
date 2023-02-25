package br.edu.ifgoiano.aluno.henrique.aula4;

import java.util.Random;

public class Lampada {

	private boolean estadoDaLampadaOnouOff;
	
	
	public Lampada(boolean estadoInicial) {
		if (estadoInicial == true) {
			estadoDaLampadaOnouOff = true;
		}else {
			estadoDaLampadaOnouOff = false;
		}
	}
	
	public Lampada() {
		Random aleatorio = new Random();
		estadoDaLampadaOnouOff = aleatorio.nextBoolean();
	}

	public boolean isEstadoDaLampadaOnouOff() {
		return estadoDaLampadaOnouOff;
	}

	public void setEstadoDaLampadaOnouOff(boolean estadoDaLampadaOnouOff) {
		this.estadoDaLampadaOnouOff = estadoDaLampadaOnouOff;
	}
	
	
}
