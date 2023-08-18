package br.com.streamapi.vo;

import java.util.ArrayList;
import java.util.List;

public class ExercicioQuatroVO {
	
	 private String nomeSorteio;
	 List<String> listaNomes = new ArrayList<String>();
	 
	 
	public ExercicioQuatroVO(String nomeSorteio) {
		super();
		this.nomeSorteio = nomeSorteio;
	}
	
	public void adicionarNome(String nome) {
		listaNomes.add(nome);
	}


	public String getNomeSorteio() {
		return nomeSorteio;
	}


	public void setNomeSorteio(String nomeSorteio) {
		this.nomeSorteio = nomeSorteio;
	}


	public List<String> getListaNomes() {
		return listaNomes;
	}


	public void setListaNomes(List<String> listaNomes) {
		this.listaNomes = listaNomes;
	}


	@Override
	public String toString() {
		return "ExercicioQuatroVO [nomeSorteio=" + nomeSorteio + ", listaNomes=" + listaNomes + "]";
	}
	 
	 
	 
	 

}
