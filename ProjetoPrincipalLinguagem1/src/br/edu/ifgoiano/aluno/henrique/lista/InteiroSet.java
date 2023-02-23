package br.edu.ifgoiano.aluno.henrique.lista;

public class InteiroSet {
	
private boolean[] vetorPrincipal;
  
public InteiroSet() {
	 vetorPrincipal = new boolean[100];
	 for(int i = 0; i < vetorPrincipal.length; i++) {
		  vetorPrincipal[i] = false;
	 }
}
  
public boolean[] getVetorPrincipal() {
	return vetorPrincipal;
}

public InteiroSet uniaoDosValores(InteiroSet outroVetor) {
	InteiroSet valorNovo = new InteiroSet();
	
	for(int i = 0; i < 100; i++) {
		valorNovo.getVetorPrincipal()[i] = this.vetorPrincipal[i] || outroVetor.getVetorPrincipal()[i];
	}
	
	return valorNovo;
}

public InteiroSet IntercecaoDoVetor(InteiroSet outroVetor) {
	InteiroSet valorNovo = new InteiroSet();
	for(int i = 0; i < 100; i++) {
		valorNovo.getVetorPrincipal()[i] = this.vetorPrincipal[i] && outroVetor.getVetorPrincipal()[i];
	}
	
	return valorNovo;
}

public void InsereElemento(int k) {
	if (k >=0 && k < 100) {
		vetorPrincipal[k] = true; 
	}
}

public void RemoveElemento(int m) {
	if(m >= 0 && m < 100) {
		vetorPrincipal[m] = false;
	}
}

// Dividindo as Strings
public String converteEmStrings() {
	StringBuilder convertidoAString = new StringBuilder();
	boolean conjuntoSemNada = true;
	
	for(int i = 0; i < 100; i++) {
		if (vetorPrincipal[i]) {
			convertidoAString.append(i).append("");
			conjuntoSemNada = false;
		}
	}
	
	//Separando com espaços
	if (conjuntoSemNada) {
		return "-";
	}else {
		return convertidoAString.toString().trim();
	}		
}

public boolean eIgualA(InteiroSet outroVetor) {
	for(int i = 0; i < 100; i++) {
		if (this.vetorPrincipal[i] != outroVetor.getVetorPrincipal()[i]){
			
		}
	}
	
	return true;
}

}	


