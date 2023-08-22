package br.com.streamapi.bo;

import java.util.List;

/**
 * aqui calcula ele soma todos os valores e calcula a media e arredonda para 1 casa depois da virgula.
 */



public class ExUmCalculaMediaBO {
	
	public Double calcularMedia (List<Integer> listaNumeros) {
		
		Double media = listaNumeros.stream().mapToInt(Integer :: intValue).average().orElse(0.0);
		
		return media;
	}

}
