package br.com.streamapi.view.exercicio01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.streamapi.dao.ExercicioUmDAO;
import br.com.streamapi.vo.ExercicioUmVO;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaEscolhaExercicioUmVIEW extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public TelaEscolhaExercicioUmVIEW() {
		setTitle("Exercicio01");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 350, 266, 115);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFrase = new JLabel("Voçê deseja adicionar outro número ?");
		lblFrase.setHorizontalAlignment(SwingConstants.CENTER);
		lblFrase.setBounds(10, 18, 230, 13);
		contentPane.add(lblFrase);
		
		JButton btnSim = new JButton("SIM");
		btnSim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				chamaExercicioUmmView();
			}
		});
		btnSim.setBounds(51, 41, 59, 21);
		contentPane.add(btnSim);
		
		JButton btnNao = new JButton("NÃO");
		btnNao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				chamaMenuExercicio01();
			}
		});
		btnNao.setBounds(137, 41, 64, 21);
		contentPane.add(btnNao);
	}
	
	public void chamaExercicioUmmView(){
	
				try {
					TelaNumeroExercicioUmVIEW frame = new TelaNumeroExercicioUmVIEW();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
	}
	
	public void chamaMenuExercicio01() {
		
				try {
					TelaMenuExecicioUmVIEW frame = new TelaMenuExecicioUmVIEW();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
	}
}
