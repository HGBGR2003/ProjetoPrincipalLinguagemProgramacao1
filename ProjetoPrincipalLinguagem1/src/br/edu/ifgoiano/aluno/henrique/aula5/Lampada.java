package br.edu.ifgoiano.aluno.henrique.aula5;

import java.util.Random;

public class Lampada {

	private boolean estadoDaLampadaOnouOff;
	private int numeroDeWatts;
	
	public Lampada(boolean estadoInicial) {
		if (estadoInicial == true) {
			estadoDaLampadaOnouOff = true;
		}else {
			estadoDaLampadaOnouOff = false;
		}
	}
	
	public Lampada(int numeroWatts) {
		this.numeroDeWatts = numeroWatts;
	}
	
	public Lampada() {
		Random aleatorio = new Random();
		estadoDaLampadaOnouOff = aleatorio.nextBoolean();
		this.numeroDeWatts = aleatorio.nextInt(141) + 60;
	}
	
	public int getNumeroDeWatts() {
		return numeroDeWatts;
	}
	
	public void setNumeroDeWatts(int numeroDeWatts) {
		this.numeroDeWatts = numeroDeWatts;
	}


	public boolean isEstadoDaLampadaOnouOff() {
		return estadoDaLampadaOnouOff;
	}

	public void setEstadoDaLampadaOnouOff(boolean estadoDaLampadaOnouOff) {
		this.estadoDaLampadaOnouOff = estadoDaLampadaOnouOff;
	}
	
	
}
