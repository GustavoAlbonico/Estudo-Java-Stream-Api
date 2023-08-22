package br.com.streamapi.service;

import java.util.List;

import br.com.streamapi.bo.ExUmCalculaMediaBO;

public class ExercicioUmSERVICE {
	
	public Double calculaMedia (List<Integer> listaNumero) {
		
		ExUmCalculaMediaBO calculaMedia = new ExUmCalculaMediaBO();
		
		return calculaMedia.calcularMedia(listaNumero);
	}

}
