package br.com.streamapi.service;

import java.util.List;

import br.com.streamapi.bo.ExTresListaNumerosImparParBO;

public class ExercicioTresSERVICE {
	
public Integer gerageraValorTotalImpar (List<Integer> listaDeNumeros) {
		
		ExTresListaNumerosImparParBO listaNumerosImparParBO = new ExTresListaNumerosImparParBO();
		
		return listaNumerosImparParBO.geraValorTotalImpar(listaDeNumeros);
	}
	
	public Integer gerageraValorTotaPar (List<Integer> listaDeNumeros) {
		
		ExTresListaNumerosImparParBO listaNumerosImparParBO = new ExTresListaNumerosImparParBO();
		
		return listaNumerosImparParBO.geraValorTotalPar(listaDeNumeros);
	}

}
