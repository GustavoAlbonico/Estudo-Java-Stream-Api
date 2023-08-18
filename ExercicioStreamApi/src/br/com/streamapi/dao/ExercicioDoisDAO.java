package br.com.streamapi.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.streamapi.vo.ExercicioDoisVO;



public class ExercicioDoisDAO {
	
private static List<ExercicioDoisVO> listaExercicio = new ArrayList<ExercicioDoisVO>();
	
	
	public static void salvarExercicio(ExercicioDoisVO exercicio) {
		listaExercicio.add(exercicio);
	}

	public static List<ExercicioDoisVO> buscaTodos () {
		return listaExercicio;
	}

}
