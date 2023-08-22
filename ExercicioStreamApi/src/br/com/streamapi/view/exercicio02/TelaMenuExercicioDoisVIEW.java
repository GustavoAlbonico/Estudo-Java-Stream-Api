package br.com.streamapi.view.exercicio02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import br.com.streamapi.view.TelaMenuPrincipalExerciciosVIEW;

public class TelaMenuExercicioDoisVIEW extends JFrame {

	
	public TelaMenuExercicioDoisVIEW() {
		setTitle("Exercicio02");
		setResizable(false);
		setBounds(600, 350, 397, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JButton btnAdicionarAmigo = new JButton("Amigo");
		btnAdicionarAmigo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				chamaTelaInsereAmigo();
			}
		});
		btnAdicionarAmigo.setBounds(10, 32, 83, 21);
		getContentPane().add(btnAdicionarAmigo);
		
		JButton btnUpper = new JButton("Upper");
		btnUpper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chamaTelaListaUperCase();
			}
		});
		btnUpper.setBounds(103, 32, 83, 21);
		getContentPane().add(btnUpper);
		
		JButton btnLower = new JButton("Lower");
		btnLower.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chamaTelaListaLowerCase();
			}
		});
		btnLower.setBounds(196, 32, 85, 21);
		getContentPane().add(btnLower);
		
		JLabel lblEscolha = new JLabel("Escolha uma opção:");
		lblEscolha.setBounds(10, 10, 134, 13);
		getContentPane().add(lblEscolha);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				chamaMenuPrincipal();
			}
		});
		btnVoltar.setBounds(291, 32, 85, 21);
		getContentPane().add(btnVoltar);

	}
	
	public void chamaTelaInsereAmigo() {
		
				try {
					TelaInsereAmigoExercicioDoisVIEW frame = new TelaInsereAmigoExercicioDoisVIEW();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
		
	}
	
	public void chamaTelaListaUperCase() {
		
				try {
					TelaUpperExercicioDoisVIEW frame = new TelaUpperExercicioDoisVIEW();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
	}
	
	public void chamaTelaListaLowerCase() {
		
				try {
					TelaLowerExercicioDoisVIEW frame = new TelaLowerExercicioDoisVIEW();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
		
	}
	
	public void chamaMenuPrincipal() {
		
				try {
					TelaMenuPrincipalExerciciosVIEW frame = new TelaMenuPrincipalExerciciosVIEW();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
		
	}
}
