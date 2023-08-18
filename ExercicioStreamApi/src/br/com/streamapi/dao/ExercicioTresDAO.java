package br.com.streamapi.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.streamapi.vo.ExercicioTresVO;

public class ExercicioTresDAO {
	
	private static List<ExercicioTresVO> listaExercicio = new ArrayList<ExercicioTresVO>();
	
	
	public static void salvarExercicio(ExercicioTresVO exercicio) {
		listaExercicio.add(exercicio);
	}

	public static List<ExercicioTresVO> buscaTodos () {
		return listaExercicio;
	}
	
	

}
