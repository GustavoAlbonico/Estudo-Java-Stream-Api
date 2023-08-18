package br.com.streamapi.bo;

import java.util.List;
import java.util.stream.Collectors;

public class RetornaListaDistinctBO {
	
	public List<String> gerarListaDistinct (List<String> listaSorteio){
		
		List<String> listaDistinct = listaSorteio.stream().distinct().collect(Collectors.toList());
		
		return listaDistinct;
	}

}
