package br.com.streamapi.vo;

import java.util.ArrayList;
import java.util.List;

public class ExercicioTresVO {
	
	private Integer tamanhoLista;
	private List<Integer> listaNumeros = new ArrayList<Integer>();

	
	
	
	
	public ExercicioTresVO() {
		super();
	}

	public ExercicioTresVO(Integer tamanhoLista) {
		super();
		this.tamanhoLista = tamanhoLista;
	}
	
	public void adicionarNumero(Integer tamanhoLista) {
		for (int x = 0 ; x <=tamanhoLista;x++) {
			listaNumeros.add(x);
		}
	}

	public Integer getTamanhoLista() {
		return tamanhoLista;
	}


	public void setTamanhoLista(Integer tamanhoLista) {
		this.tamanhoLista = tamanhoLista;
	}

	public List<Integer> getListaNumeros() {
		return listaNumeros;
	}

	public void setListaNumeros(List<Integer> listaNumeros) {
		this.listaNumeros = listaNumeros;
	}


	
	
		
	}
	


