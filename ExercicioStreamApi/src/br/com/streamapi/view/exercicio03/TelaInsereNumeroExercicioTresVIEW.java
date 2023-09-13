package br.com.streamapi.view.exercicio03;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import br.com.streamapi.dao.ExercicioTresDAO;
import br.com.streamapi.vo.ExercicioTresVO;
import javax.swing.SwingConstants;


public class TelaInsereNumeroExercicioTresVIEW extends JFrame {
	
	private JPanel contentPane;
	private JTextField tfNumero;

	public TelaInsereNumeroExercicioTresVIEW() {
		setResizable(false);
		setTitle("Exercicio03");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 350, 318, 126);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumero = new JLabel("Informe quantos numeros tem a lista:");
		lblNumero.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumero.setBounds(10, 10, 284, 13);
		contentPane.add(lblNumero);
		
		tfNumero = new JTextField();
		tfNumero.setBounds(100, 29, 106, 19);
		contentPane.add(tfNumero);
		tfNumero.setColumns(10);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				chamaAdicionarNumero();
			}
		});
		btnOk.setBounds(110, 58, 85, 21);
		contentPane.add(btnOk);
	}
	
	public void chamaAdicionarNumero(){
		
		
		
		String numero = tfNumero.getText();
		
		ExercicioTresVO exercicioTresVO = new ExercicioTresVO(1);
		
		exercicioTresVO.adicionarNumero(Integer.parseInt(numero));
		
		ExercicioTresDAO exercicioTresDAO = new ExercicioTresDAO();
		
		exercicioTresDAO.salvarExercicio(exercicioTresVO);

		chamaMenuExercicio03();
	}
	
	public void chamaMenuExercicio03() {
		
				try {
					TelaMenuExercicioTresVIEW frame = new TelaMenuExercicioTresVIEW();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
	}
		
	
}
