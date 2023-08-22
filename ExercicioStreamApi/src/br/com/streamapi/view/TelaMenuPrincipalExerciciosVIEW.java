package br.com.streamapi.view;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;

import br.com.streamapi.view.exercicio01.TelaMenuExecicioUmVIEW;
import br.com.streamapi.view.exercicio02.TelaMenuExercicioDoisVIEW;
import br.com.streamapi.view.exercicio03.TelaMenuExercicioTresVIEW;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaMenuPrincipalExerciciosVIEW extends JFrame {

	public TelaMenuPrincipalExerciciosVIEW() {
		setTitle("Menu Principal Exercicios");
		setResizable(false);
		setBounds(600, 350, 426, 115);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JButton btnExercicioUm = new JButton("Exercicio01");
		btnExercicioUm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				chamaTelaMenuExercicio01();
			}
		});
		btnExercicioUm.setBounds(10, 33, 122, 21);
		getContentPane().add(btnExercicioUm);
		
		JButton btnExercicioDois = new JButton("Exercicio02");
		btnExercicioDois.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				chamaTelaMenuExercicio02();
			}
		});
		btnExercicioDois.setBounds(142, 33, 122, 21);
		getContentPane().add(btnExercicioDois);
		
		JButton btnExercicioTres = new JButton("Exercicio03");
		btnExercicioTres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				chamaTelaMenuExercicio03();
			}
		});
		btnExercicioTres.setBounds(274, 33, 122, 21);
		getContentPane().add(btnExercicioTres);
		
		JLabel lblEscolha = new JLabel("Escolha uma opção:");
		lblEscolha.setBounds(10, 10, 122, 13);
		getContentPane().add(lblEscolha);

	}
	
	public void chamaTelaMenuExercicio01() {

				try {
					TelaMenuExecicioUmVIEW frame = new TelaMenuExecicioUmVIEW();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
	}
	
	public void chamaTelaMenuExercicio02() {
		
				try {
					TelaMenuExercicioDoisVIEW frame = new TelaMenuExercicioDoisVIEW();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
		
		
	}
	
	public void chamaTelaMenuExercicio03() {
		
				try {
					TelaMenuExercicioTresVIEW frame = new TelaMenuExercicioTresVIEW();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
		
	}

}
