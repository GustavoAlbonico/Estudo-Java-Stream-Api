package br.com.streamapi.view.exercicio03;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.streamapi.dao.ExercicioTresDAO;
import br.com.streamapi.service.ExercicioTresSERVICE;
import javax.swing.SwingConstants;

public class TelaImparExercicioTresVIEW extends JFrame {
	 
	private JPanel contentPane;

	public TelaImparExercicioTresVIEW() {
		
		setTitle("Exercicio03");
		setResizable(false);
		setBounds(620, 350, 336, 92);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMensagemImpar = new JLabel("O valor total da soma dos numeros impares é:" + resultadoImpar());
		lblMensagemImpar.setHorizontalAlignment(SwingConstants.CENTER);
		lblMensagemImpar.setBounds(10, 10, 302, 13);
		contentPane.add(lblMensagemImpar);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnOk.setBounds(121, 34, 85, 21);
		contentPane.add(btnOk);
	
	}
	
	public Integer resultadoImpar() {
		
		ExercicioTresDAO exercicioTresDAO = new ExercicioTresDAO();
		ExercicioTresSERVICE servico =  new ExercicioTresSERVICE();
		
		Integer resultado = servico.gerageraValorTotalImpar
				(exercicioTresDAO.buscaTodos().get(0).getListaNumeros());	
		
		return resultado;
		
	}

	

}
