package br.edu.ifgoiano.aluno.henrique.aula10.Escola;

import java.util.HashMap;

public class MatriculaDao {
	static HashMap<String, Matricula> matriculas = new HashMap<String, Matricula>();

	public static HashMap<String, Matricula> getMatriculas() {
		return matriculas;
	}

	public static void setMatriculas(HashMap<String, Matricula> matriculas) {
		MatriculaDao.matriculas = matriculas;
	}
	
	public static void add(Matricula matricula) {
	      matriculas.put(matricula.getId(), matricula);
	}
	
	public static Matricula getById(String id) {
        return matriculas.get(id);
    }

    public static void update(Matricula matricula) {
        matriculas.replace(matricula.getId(), matricula);
    }

    public static void delete(Matricula matricula) {
        matriculas.remove(matricula.getId());
    }
}
