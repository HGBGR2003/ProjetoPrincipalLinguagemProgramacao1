package br.edu.ifgoiano.aluno.henrique.aula10.Escola;


public class Matricula extends Curso {
	int id;
	int idAluno;
	int idCurso;
	boolean status;
	double [] notas;
	
	public Matricula(int id, String nome, String endereco, String[] ids, int numeroMaximoCursos, int codigo,
			String descricao, int dataInicio, int dataFim, int idEscola, String[] matriculasIds, int numeroMatriculas,
			int numeroMaximoMatriculas, int idAluno, int idCurso, boolean status, double[]notas) {
		super(id, nome, endereco, ids, numeroMaximoCursos, codigo, descricao, dataInicio, dataFim, idEscola, matriculasIds,
				numeroMatriculas, numeroMaximoMatriculas);
		this.idAluno = idAluno;
		this.idCurso = idCurso;
		this.status = true;
		this.notas = new double[4];
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdAluno() {
		return idAluno;
	}
	public void setIdAluno(int idAluno) {
		this.idAluno = idAluno;
	}
	public int getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public double media() {
		double soma = 0;
		double numeroNotas = 0;
		for(double nota:notas) {
			if(nota > 0) {
				soma += nota;
				numeroNotas++;
			}
		}
		
		if(numeroNotas == 0) {
			return 0;
		}
		return soma/numeroNotas;
	}


}
