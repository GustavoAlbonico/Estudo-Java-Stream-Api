package br.com.streamapi.view.exercicio03;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import br.com.streamapi.view.TelaMenuPrincipalExerciciosVIEW;

public class TelaMenuExercicioTresVIEW extends JFrame {

	
	public TelaMenuExercicioTresVIEW() {
		setTitle("Exercicio03");
		setResizable(false);
		setBounds(600, 350, 397, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JButton btnAdicionarNumero = new JButton("Numero");
		btnAdicionarNumero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				chamaTelaInsereNumero();
			}
		});
		btnAdicionarNumero.setBounds(10, 32, 83, 21);
		getContentPane().add(btnAdicionarNumero);
		
		JButton btnImpar = new JButton("Impar");
		btnImpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chamaTelaListaImpar();
			}
		});
		btnImpar.setBounds(103, 32, 83, 21);
		getContentPane().add(btnImpar);
		
		JButton btnPar = new JButton("Par");
		btnPar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chamaTelaListaPar();
			}
		});
		btnPar.setBounds(196, 32, 85, 21);
		getContentPane().add(btnPar);
		
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
	
	public void chamaTelaInsereNumero() {
		
				try {
					TelaInsereNumeroExercicioTresVIEW frame = new TelaInsereNumeroExercicioTresVIEW();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
		
	}
	
	public void chamaTelaListaImpar() {
		
				try {
					TelaImparExercicioTresVIEW frame = new TelaImparExercicioTresVIEW();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
		
	}
	
	public void chamaTelaListaPar() {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaParExercicioTresVIEW frame = new TelaParExercicioTresVIEW();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
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
