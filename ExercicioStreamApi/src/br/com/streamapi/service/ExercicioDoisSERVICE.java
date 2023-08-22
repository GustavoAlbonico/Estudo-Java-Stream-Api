package br.com.streamapi.service;

import java.util.List;
import br.com.streamapi.bo.ExDoisTransformaListaUperLowerBO;

public class ExercicioDoisSERVICE {
	
public List<String> amigosUperCase(List<String> listaDeAamigos) {
		
		ExDoisTransformaListaUperLowerBO transformaListaUper =  new ExDoisTransformaListaUperLowerBO();
		
		return transformaListaUper.amigosUperCase(listaDeAamigos);
		
	}
	
	public List<String> amigosLowerCase(List<String> listaDeAamigos){
		
		ExDoisTransformaListaUperLowerBO transformaListaLower =  new ExDoisTransformaListaUperLowerBO();
		
		return transformaListaLower.amigosLowerCase(listaDeAamigos);
		
	}

}
