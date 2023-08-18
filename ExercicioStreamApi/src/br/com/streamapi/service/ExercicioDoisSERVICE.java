package br.com.streamapi.service;

import java.util.List;

import br.com.streamapi.bo.TransformaListaUperLowerBO;

public class ExercicioDoisSERVICE {
	
public List<String> amigosUperCase(List<String> listaDeAamigos){
		
		TransformaListaUperLowerBO transformaListaUper =  new TransformaListaUperLowerBO();
		
		return transformaListaUper.amigosUperCase(listaDeAamigos);
		
	}
	
	public List<String> amigosLowerCase(List<String> listaDeAamigos){
		
		TransformaListaUperLowerBO transformaListaLower =  new TransformaListaUperLowerBO();
		
		return transformaListaLower.amigosLowerCase(listaDeAamigos);
		
	}

}
