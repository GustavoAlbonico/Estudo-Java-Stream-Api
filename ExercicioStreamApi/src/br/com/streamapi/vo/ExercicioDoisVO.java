package br.com.streamapi.vo;

import java.util.ArrayList;
import java.util.List;

public class ExercicioDoisVO {
	
	private String nome;
	private List<String> listaDeAmigos = new ArrayList<String>();
	
	public ExercicioDoisVO(String nome) {
		super();
		this.nome = nome;
	}
	
	public void adicionarAmigo(String amigo) {
		listaDeAmigos.add(amigo);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public List<String> getListaDeAmigos() {
		return listaDeAmigos;
	}


	public void setListaDeAmigos(List<String> listaDeAmigos) {
		this.listaDeAmigos = listaDeAmigos;
	}


	@Override
	public String toString() {
		return "ExercicioDoisVO [nome=" + nome + "]";
	}
	
	
	
	

}
