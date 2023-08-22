package br.com.streamapi.view.exercicio02;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import javax.swing.JTable;

import br.com.streamapi.dao.ExercicioDoisDAO;
import br.com.streamapi.service.ExercicioDoisSERVICE;

public class TelaLowerExercicioDoisVIEW extends JFrame {


	public TelaLowerExercicioDoisVIEW() {
		setResizable(false);
		
		this.setSize(200,300);
		this.setTitle("Lista de nome Upper");
		this.setLocationRelativeTo(null);
		
		
		String[] colunaNomes = {"Nome"};
		
		Object[][] listaNomes = new Object[chamaListaNomes().size()][1];
		
		for (int x = 0 ; x < chamaListaNomes().size() ; x++) {
			
			listaNomes[x][0] = new String (chamaListaNomes().get(x));
		}
		
		JTable table = new JTable(listaNomes,colunaNomes);
		
		getContentPane().add(table.getTableHeader(),BorderLayout.PAGE_START);
		getContentPane().add(table,BorderLayout.CENTER);
			
		}
		
		public List<String> chamaListaNomes() {
			
			ExercicioDoisSERVICE service = new ExercicioDoisSERVICE();
			ExercicioDoisDAO exercicioDoisDAO = new ExercicioDoisDAO();
			
			
			List<String> listaAmigos = new ArrayList<String>();
			
			
				listaAmigos = service.amigosLowerCase(exercicioDoisDAO.buscaTodos().get(0).getListaDeAmigos());
				
				
			
			return listaAmigos ;
			
		}

}
