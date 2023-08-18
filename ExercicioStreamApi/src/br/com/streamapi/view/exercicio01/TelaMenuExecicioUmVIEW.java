package br.com.streamapi.view.exercicio01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;

import br.com.streamapi.view.TelaMenuPrincipalExerciciosVIEW;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaMenuExecicioUmVIEW extends JFrame {

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public TelaMenuExecicioUmVIEW() {
		setTitle("Exercicio01");
		setResizable(false);
		setBounds(600, 350, 312, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JButton btnAdicionarNumero = new JButton("Numero");
		btnAdicionarNumero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				chamaExercicioUmm();
			}
		});
		btnAdicionarNumero.setBounds(10, 32, 83, 21);
		getContentPane().add(btnAdicionarNumero);
		
		JButton btnMedia = new JButton("Media");
		btnMedia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chamaCalculoMedia();
			}
		});
		btnMedia.setBounds(103, 32, 83, 21);
		getContentPane().add(btnMedia);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				chamaMenuPrincipal();
			}
		});
		btnVoltar.setBounds(196, 32, 85, 21);
		getContentPane().add(btnVoltar);
		
		JLabel lblEscolha = new JLabel("Escolha uma opção:");
		lblEscolha.setBounds(10, 10, 134, 13);
		getContentPane().add(lblEscolha);

	}
	
	public void chamaMenuPrincipal() {
		
				try {
					TelaMenuPrincipalExerciciosVIEW frame = new TelaMenuPrincipalExerciciosVIEW();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
		
	}
	
	public void chamaExercicioUmm() {
		
				try {
					TelaNumeroExercicioUmVIEW frame = new TelaNumeroExercicioUmVIEW();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
	}
	
	public void chamaCalculoMedia() {
	
				try {
					TelaMediaExercicioUmVIEW frame = new TelaMediaExercicioUmVIEW();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
		
	}

}
