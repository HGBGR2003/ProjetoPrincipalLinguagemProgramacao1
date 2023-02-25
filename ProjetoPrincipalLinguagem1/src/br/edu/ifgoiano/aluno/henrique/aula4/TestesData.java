package br.edu.ifgoiano.aluno.henrique.aula4;

public class TestesData {

	public static void main(String[] args) throws Exception{
		Data dataNova1 = new Data(25, 02, 2023);
		System.out.println("Data1: " + dataNova1.getDia() + "/" + dataNova1.getMes() + "/" + dataNova1.getAno());
		
		//Data Invalida, no dia.
		Data data2 = new Data(10, 4, 2022);
	    System.out.println("Data2: " + data2.getDia() + "/" + data2.getMes() + "/" + data2.getAno());

	    System.out.println("-------------");
	     
	  // Teste com mês inválido
	    Data data3 = new Data(15, 1, 2021);
	    System.out.println("Data3: " + data3.getDia() + "/" + data3.getMes() + "/" + data3.getAno());

	  // Teste com ano inválido
	    Data data4 = new Data(10, 8, 2020);
	    System.out.println("Data4: " + data4.getDia() + "/" + data4.getMes() + "/" + data4.getAno());
	     
	     
		
	}

}
