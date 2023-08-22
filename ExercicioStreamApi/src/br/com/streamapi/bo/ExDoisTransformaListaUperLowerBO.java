package br.com.streamapi.bo;

import java.util.List;
import java.util.stream.Collectors;

public class ExDoisTransformaListaUperLowerBO {
	
	/** pega a lista de amigos com os nome e transma eles em Uper ou Lower case dependendo do metodo pedido
	 * e transforma de volta em lista para retornar para variavel
	 * 
	 * @param listaDeAmigos
	 * @return
	 */
	
	public List<String> amigosUperCase (List<String> listaDeAmigos) {
		
		List<String> listaAmigosUperCase = listaDeAmigos.stream().map(String :: toUpperCase).collect(Collectors.toList());
		
		return listaAmigosUperCase;
		
	}
	
	
	public List<String> amigosLowerCase (List<String> listaDeAmigos) {

			List<String> listaAmigosLowerCase = listaDeAmigos.stream().map(String :: toLowerCase).collect(Collectors.toList());
			
			return listaAmigosLowerCase;
			
		
	}

}
