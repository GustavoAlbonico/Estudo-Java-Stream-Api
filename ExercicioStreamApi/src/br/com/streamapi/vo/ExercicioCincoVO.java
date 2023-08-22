package br.com.streamapi.vo;

import java.util.ArrayList;
import java.util.List;

public class ExercicioCincoVO {
	
	private String Turma;
	private List<String> listaAlunos = new ArrayList<String>();
	
	public ExercicioCincoVO() {
		super();
	}

	public ExercicioCincoVO(String turma) {
		super();
		Turma = turma;
	}
	
	public void adicionarAluno(String aluno) {
		listaAlunos.add(aluno);
	}

	public String getTurma() {
		return Turma;
	}

	public void setTurma(String turma) {
		Turma = turma;
	}

	public List<String> getListaAlunos() {
		return listaAlunos;
	}

	public void setListaAlunos(List<String> listaAlunos) {
		this.listaAlunos = listaAlunos;
	}

	@Override
	public String toString() {
		return "ExercicioCincoVO [Turma=" + Turma + ", listaAlunos=" + listaAlunos + "]";
	}
	
	
	

}
