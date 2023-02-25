package br.edu.ifgoiano.aluno.henrique.aula4;

//Uma classe totalmente diferente da lista.
public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	public Data(int dia, int mes, int ano) throws Exception {		
		//Verificar Já de cara se a data é true;
		if (!verificarDataValida(dia, mes, ano)) {
			throw new Exception("Data inválida");
		}	

		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	
	public boolean verificarDataValida(int dia, int mes, int ano) {
		if(ano <= 0) {
			return false;
		}
		
		if(mes < 1 || mes > 12) {
			return false;
		}
		
		if(dia < 1 || dia > diasNoMeses(mes, ano)) {
			return false;
		}
		
		return true;
		
	}
	
	
	public int diasNoMeses(int mes, int ano) {
		if(mes == 0) {
			if (ano % 4 == 0 && ((ano & 100) != 0) || ano % 400 == 0) {
				return 29;
			}else {
				return 28;
			}
			
		}else if(mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			return 30;
		}else {
			return 31;
		}
		
	}
	
	
	public int getDia() {
		return dia;
	}
	
	//Método Implementado
	public void setDia(int dia) throws Exception {
		if(verificarDataValida(dia, dia, dia)) {
			this.dia = dia;
		}else {
			throw new Exception("Dia inválido!");
		}
		
	}
	
	public int getMes() {
		return mes;
	}
	
	public void setMes(int mes) throws Exception {
		if(verificarDataValida(mes, mes, mes)) {
			this.mes = mes;			
		}else {
			throw new Exception("Mês Inválido");
		}
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) throws Exception {
		if(verificarDataValida(ano, ano, ano)) {
			this.ano = ano;
		}else {
			throw new Exception("Ano Inválido");
		}

	}
	
}
