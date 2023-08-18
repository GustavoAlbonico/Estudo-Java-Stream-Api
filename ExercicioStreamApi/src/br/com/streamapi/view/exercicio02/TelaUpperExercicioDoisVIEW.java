package br.com.streamapi.view.exercicio02;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.streamapi.dao.ExercicioDoisDAO;
import br.com.streamapi.service.ExercicioDoisSERVICE;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JTable;
import javax.swing.event.AncestorListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.event.AncestorEvent;

public class TelaUpperExercicioDoisVIEW extends JFrame {

	
	public TelaUpperExercicioDoisVIEW() {
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
		
		
		List<String> listaAmisgos = service.amigosUperCase(exercicioDoisDAO.buscaTodos().get(0).getListaDeAmigos());
		
		
		return listaAmisgos  ;
		
	}
}
