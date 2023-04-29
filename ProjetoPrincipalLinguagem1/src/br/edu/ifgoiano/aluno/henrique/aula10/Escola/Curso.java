package br.edu.ifgoiano.aluno.henrique.aula10.Escola;


public class Curso extends Escola {

	int id;
	int codigo;
	String descricao;
	int dataInicio;
	int dataFim; 
	int idEscola;
	String[] matriculasIds;
	int numeroMatriculas;
	
	public Curso(int id, String nome, String endereco, String[] ids, int numeroMaximoCursos, int codigo,String descricao,
			int dataInicio,int dataFim,int idEscola,String[] matriculasIds, int numeroMatriculas,int numeroMaximoMatriculas) {
		super(id, nome, endereco, ids, numeroMaximoCursos);
		this.codigo = codigo;
		this.descricao = descricao;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.idEscola = idEscola;
		this.matriculasIds = new String[numeroMaximoMatriculas];
		this.numeroMatriculas = 0;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(int dataInicio) {
		this.dataInicio = dataInicio;
	}
	public int getDataFim() {
		return dataFim;
	}
	public void setDataFim(int dataFim) {
		this.dataFim = dataFim;
	}

	public int getIdEscola() {
		return idEscola;
	}
	public void setIdEscola(int idEscola) {
		this.idEscola = idEscola;
	}
	
	public void addMatricula(String id) {
		if(numeroMatriculas < matriculasIds.length) {
			matriculasIds[numeroMatriculas] = id;
			numeroMatriculas++;
		}
	}


}
