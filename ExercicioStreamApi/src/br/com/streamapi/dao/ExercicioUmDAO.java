package br.com.streamapi.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.streamapi.vo.ExercicioUmVO;

public class ExercicioUmDAO {
	
private static List<ExercicioUmVO> listaExercicio = new ArrayList<ExercicioUmVO>();
	
	
	public static void salvarExercicio(ExercicioUmVO exercicio) {
		listaExercicio.add(exercicio);
	}

	public static List<ExercicioUmVO> buscaTodos () {
		return listaExercicio;
	}

}
