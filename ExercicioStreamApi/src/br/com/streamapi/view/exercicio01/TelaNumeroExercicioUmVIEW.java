package br.com.streamapi.view.exercicio01;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.streamapi.dao.ExercicioUmDAO;
import br.com.streamapi.vo.ExercicioUmVO;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaNumeroExercicioUmVIEW extends JFrame {

	private JPanel contentPane;
	private JTextField tfNumero;
	ExercicioUmVO exercicioUmVO =  new ExercicioUmVO();
	ExercicioUmDAO exercicioUmDAO = new ExercicioUmDAO();
	
	
	public TelaNumeroExercicioUmVIEW() {
		setResizable(false);
		setTitle("Exercicio01");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 350, 216, 126);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumero = new JLabel("Numero:");
		lblNumero.setBounds(10, 16, 64, 13);
		contentPane.add(lblNumero);
		
		tfNumero = new JTextField();
		tfNumero.setBounds(69, 13, 96, 19);
		contentPane.add(tfNumero);
		tfNumero.setColumns(10);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				chamaMenuEscolhaSimNao();
			}
		});
		btnOk.setBounds(69, 58, 85, 21);
		contentPane.add(btnOk);
	}
	
	public void chamaMenuEscolhaSimNao() {
		
		if (exercicioUmDAO.buscaTodos().isEmpty()) {
			exercicioUmDAO.salvarExercicio(exercicioUmVO);
		}
		
		String numero = tfNumero.getText();
		
		exercicioUmDAO.buscaTodos().get(0).addNumeroLista(Integer.parseInt(numero));
		
		chamaTelaEscolha();
		
		
	}
	
	public void chamaTelaEscolha() {
		
				try {
					TelaEscolhaExercicioUmVIEW frame = new TelaEscolhaExercicioUmVIEW();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
		
	}
}
