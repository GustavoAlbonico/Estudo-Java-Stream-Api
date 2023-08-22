package br.com.streamapi.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.streamapi.vo.ExercicioQuatroVO;

public class ExercicioQuatroDAO {
	
	private static List<ExercicioQuatroVO> listaExercicio = new ArrayList<ExercicioQuatroVO>();
	
	
	public static void salvarExercicio(ExercicioQuatroVO exercicio) {
		listaExercicio.add(exercicio);
		
	}
	
	public static List<ExercicioQuatroVO> buscaTodos(){
		return listaExercicio;
	}

}
