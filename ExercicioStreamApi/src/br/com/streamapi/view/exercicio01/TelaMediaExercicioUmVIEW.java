package br.com.streamapi.view.exercicio01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.streamapi.dao.ExercicioUmDAO;
import br.com.streamapi.service.ExercicioUmSERVICE;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaMediaExercicioUmVIEW extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public TelaMediaExercicioUmVIEW() {
		setTitle("Exercicio01");
		setResizable(false);
		setBounds(620, 350, 266, 92);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMensagemMedia = new JLabel("O valor da media é de:" + Math.round(resultadoMedia()) );
		lblMensagemMedia.setBounds(68, 10, 174, 13);
		contentPane.add(lblMensagemMedia);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnOk.setBounds(90, 34, 85, 21);
		contentPane.add(btnOk);
	}
	
	public Double resultadoMedia() {
		
		ExercicioUmDAO exercicioUmDao = new ExercicioUmDAO();
		ExercicioUmSERVICE servico =  new ExercicioUmSERVICE();
 	   
 	   Double resultado = servico.calculaMedia(exercicioUmDao.buscaTodos().get(0).getListaDeNumero());
 	   
 	   return resultado;
	}
}
