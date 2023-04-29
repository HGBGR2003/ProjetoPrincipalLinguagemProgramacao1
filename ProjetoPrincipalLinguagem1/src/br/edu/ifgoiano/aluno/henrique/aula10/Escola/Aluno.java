package br.edu.ifgoiano.aluno.henrique.aula10.Escola;

public class Aluno extends Curso {
	String id;
	String nome;
	int cpf;
	String [] idsMatricula;
	
	public Aluno(String id, String nome, String endereco, String[] ids, int numeroMaximoCursos, int codigo,
			String descricao, int dataInicio, int dataFim, int idEscola, String[] matriculasIds, int numeroMatriculas,
			int numeroMaximoMatriculas,String[] idsMatricula, int cpf) {
		super(id, nome, endereco, ids, numeroMaximoCursos, codigo, descricao, dataInicio, dataFim, idEscola, matriculasIds,
				numeroMatriculas, numeroMaximoMatriculas);
	
		this.idsMatricula = new String[10];
		this.cpf = cpf;
		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public String[] getIdsMatricula() {
		return idsMatricula;
	}
	public void setIdsMatricula(String[] idsMatricula) {
		this.idsMatricula = idsMatricula;
	}
	
	 public void addMatricula(Matricula matricula) {
	        for (int i = 0; i < matriculasIds.length; i++) {
	            if (matriculasIds[i] == null) {
	                matriculasIds[i] = matricula.getId();
	                return;
	            }
	        }
	        System.out.println("O aluno já atingiu o limite de matrículas.");
	    }

	public double mediaDasNotas() {
		  double somaNotas = 0;
	      double numNotas = 0;
	      for (String matriculaId : matriculasIds) {
	            if (matriculaId != null) {
	                Matricula matricula = MatriculaDao.getById(matriculaId); 
	                somaNotas += matricula.media();
	                numNotas++;
	            }
	        }
	        if (numNotas == 0) {
	            return 0; 
	        }
	        return (double) somaNotas / numNotas;
	    }

	public Object getMatriculasIds() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getNumeroMaximoMatriculas() {
		// TODO Auto-generated method stub
		return null;
	}
	    
	}


