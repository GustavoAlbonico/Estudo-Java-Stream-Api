package br.com.streamapi.service;

import java.util.List;

import br.com.streamapi.bo.CalculaMediaBO;

public class ExercicioUmSERVICE {
	
	public Double calculaMedia (List<Integer> listaNumero) {
		
		CalculaMediaBO calculaMedia = new CalculaMediaBO();
		
		return calculaMedia.calcularMedia(listaNumero);
	}

}
