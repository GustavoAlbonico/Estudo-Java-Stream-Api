package br.com.streamapi.service;

import java.util.List;

import br.com.streamapi.bo.ListaNumerosImparParBO;

public class ExercicioTresSERVICE {
	
public Integer gerageraValorTotalImpar (List<Integer> listaDeNumeros) {
		
		ListaNumerosImparParBO listaNumerosImparParBO = new ListaNumerosImparParBO();
		
		return listaNumerosImparParBO.geraValorTotalImpar(listaDeNumeros);
	}
	
	public Integer gerageraValorTotaPar (List<Integer> listaDeNumeros) {
		
		ListaNumerosImparParBO listaNumerosImparParBO = new ListaNumerosImparParBO();
		
		return listaNumerosImparParBO.geraValorTotalPar(listaDeNumeros);
	}

}
