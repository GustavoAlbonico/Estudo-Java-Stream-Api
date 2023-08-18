package br.com.streamapi.view;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class teste extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					teste frame = new teste();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public teste() {
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Object[] listaNomes = lista();
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(listaNomes));
		comboBox.setBounds(99, 55, 76, 21);
		contentPane.add(comboBox);
	}
	
	public Object[] lista(){
		
		List<String> lista = new ArrayList<String>();
		lista.add("Jose");
		lista.add("Carlos");
		lista.add("Anotonio");
		
	return lista.toArray();
		
	}
}
