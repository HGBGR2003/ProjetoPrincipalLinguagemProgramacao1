package br.edu.ifgoiano.aluno.henrique.aula10.Escola;

public class EscolaTestes {
	public static void main(String[] args) {
		// Cria a escola
        Escola escola = new Escola("1", "Escola Teste", "Rua da Escola Teste", new String[3], 3);
        Curso cursoA = new Curso("1", "Curso A", "Sala",new String[5], 5,100,"Curso A de Teste",
        		20220101,20221231,Integer.parseInt(escola.getId()),new String[5], 0, 5);
        Curso cursoB = new Curso("2", "Curso B", "Sala B", new String[5], 5, 200, "Curso B de Teste",
                20220101, 20221231, Integer.parseInt(escola.getId()), new String[5], 0, 5);
        Curso cursoC = new Curso("3", "Curso C", "Sala C", new String[5], 5, 300, "Curso C de Teste",
        		20220101, 20221231,Integer.parseInt(escola.getId()), new String[5], 0, 5);
        
        escola.addCurso(cursoA);
        escola.addCurso(cursoB);
        escola.addCurso(cursoC);
        /*
        for (int i = 1; i <= 5; i++) {
            // Cria o aluno
            Aluno aluno = new Aluno(Integer.toString(i), "Aluno " + i, "Rua do Aluno " + i);

            // Matricula o aluno nos cursos

            Matricula matriculaB = new Matricula(Integer.toString(i), cursoB.getNome(), cursoB.getEndereco(),
                    cursoB.getIds(), cursoB.getNumeroCursos(), cursoB.getCodigo(), cursoB.getDescricao(),
                    cursoB.getDataInicio(), cursoB.getDataFim(), cursoB.getIdEscola(), aluno.getMatriculasIds(),
                   Integer.parseInt(aluno.getNumeroMaximoMatriculas()), aluno.getNumeroMaximoMatriculas(), Integer.parseInt(aluno.getId()),
                    Integer.parseInt(cursoB.getId()), true, new double[4]);
            cursoB.addMatricula(matriculaB);
            aluno.addMatricula(matriculaB);

            Matricula matriculaC = new Matricula(Integer.toString(i), cursoC.getNome(), cursoC.getEndereco(),
                    cursoC.getIds(), cursoC.getNumeroCursos(), cursoC.getCodigo(), cursoC.getDescricao(),
                    cursoC.getDataInicio(), cursoC.getDataFim(), cursoC.getIdEscola(), aluno.getMatriculasIds(),
                    aluno.getNumeroMaximoMatriculas(), aluno.getNumeroMaximoMatriculas(), Integer.parseInt(aluno.getId()),
                    Integer.parseInt(cursoC.getId()), true
                    
          */
        }
	}
}
