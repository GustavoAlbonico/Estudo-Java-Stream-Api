package br.com.streamapi.bo;

import java.util.List;
import java.util.stream.Collectors;

public class ExQuaRetornaListaDistinctBO {
	
	/**
	 * gera uma lista sem "objetos" repetidos.
	 * @param listaSorteio
	 * @return
	 */
	
	public List<String> gerarListaDistinct (List<String> listaSorteio){
		
		List<String> listaDistinct = listaSorteio.stream().distinct().collect(Collectors.toList());
		
		return listaDistinct;
	}

}
