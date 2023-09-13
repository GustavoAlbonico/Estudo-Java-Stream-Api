package br.com.streamapi.view.exercicio02;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class TelaEscolhaExercicioDoisVIEW extends JFrame {

	private JPanel contentPane;
	
	public TelaEscolhaExercicioDoisVIEW() {
		setTitle("Exercicio02");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 350, 266, 115);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFrase = new JLabel("Voçê deseja adicionar outro amigo ?");
		lblFrase.setHorizontalAlignment(SwingConstants.CENTER);
		lblFrase.setBounds(10, 18, 230, 13);
		contentPane.add(lblFrase);
		
		JButton btnSim = new JButton("SIM");
		btnSim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				chamaTelaInsereAmigo();
			}
		});
		btnSim.setBounds(51, 41, 59, 21);
		contentPane.add(btnSim);
		
		JButton btnNao = new JButton("NÃO");
		btnNao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				chamaTelaMenuExercicioDois();
			}
		});
		btnNao.setBounds(137, 41, 64, 21);
		contentPane.add(btnNao);

	}
	
	public void chamaTelaMenuExercicioDois() {
		
				try {
					TelaMenuExercicioDoisVIEW frame = new TelaMenuExercicioDoisVIEW();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
		
	}
	
	public void chamaTelaInsereAmigo() {
		
				try {
					TelaInsereAmigoExercicioDoisVIEW frame = new TelaInsereAmigoExercicioDoisVIEW();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
		
	}

}
