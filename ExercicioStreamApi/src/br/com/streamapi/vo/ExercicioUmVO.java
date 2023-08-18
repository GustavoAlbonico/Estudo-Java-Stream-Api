package br.com.streamapi.vo;

import java.util.ArrayList;
import java.util.List;

public class ExercicioUmVO {
	
	private List<Integer> listaDeNumero = new ArrayList<Integer>();
	private Double numero;
	
	
	
	
	public ExercicioUmVO() {
		super();
	}

	public ExercicioUmVO(Double numero) {
		super();
		this.numero = numero;
	}
	
	public void addNumeroLista (Integer numero) {
		listaDeNumero.add(numero);
	}


	public List<Integer> getListaDeNumero() {
		return listaDeNumero;
	}

	public void setListaDeNumero(List<Integer> listaDeNumero) {
		this.listaDeNumero = listaDeNumero;
	}

	public Double getNumero() {
		return numero;
	}


	public void setNumero(Double numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "ExercicioUmVO [numero=" + numero + "]";
	}


	
	

}
