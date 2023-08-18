package br.com.streamapi.bo;

import java.util.List;

public class ListaNumerosImparParBO {
	
	/**
	 * pega a lista com os valores e pega apenas os pares ou impares, dependendo do 
	 * metodo selecionado e soma eles e retorna para a variavel.
	 * @param listaInteger
	 * @return
	 */
	
	public Integer geraValorTotalPar(List<Integer> listaInteger){
		
	Integer valorTotalPar = listaInteger.stream().filter(Integer -> Integer.intValue()%2==0).mapToInt(Integer :: intValue).sum();
	
	return valorTotalPar;
	}
	
	public Integer geraValorTotalImpar(List<Integer> listaInteger){
		
		Integer valorTotalImpar = listaInteger.stream().filter(Integer -> Integer.intValue()%2!=0).mapToInt(Integer :: intValue).sum();
		
		return valorTotalImpar;
		}

}
