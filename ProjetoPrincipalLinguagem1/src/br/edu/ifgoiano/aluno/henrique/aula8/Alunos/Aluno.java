package br.edu.ifgoiano.aluno.henrique.aula8.Alunos;

public class Aluno extends Pessoa {
	double nota;
	
	public Aluno(String nomePessoa, int anoDeNascimentoPessoa,double nota) {
		super(nomePessoa, anoDeNascimentoPessoa);
		this.nota = nota;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	
	public String imprimirDados() {
		return "O nome do(a) Aluno é " + this.nome + " e seu ano de nascimento é "
				+ this.anoDeNascimento + " e sua nota " + this.nota;
	}
			
}