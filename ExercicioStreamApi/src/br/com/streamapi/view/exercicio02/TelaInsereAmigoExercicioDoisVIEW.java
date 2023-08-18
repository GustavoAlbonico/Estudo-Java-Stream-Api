package br.com.streamapi.view.exercicio02;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Closeable;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;

import br.com.streamapi.dao.ExercicioDoisDAO;
import br.com.streamapi.vo.ExercicioDoisVO;

import javax.swing.SwingConstants;

public class TelaInsereAmigoExercicioDoisVIEW extends JFrame {

	private JPanel contentPane;
	private JTextField tfAmigo;
	
	public TelaInsereAmigoExercicioDoisVIEW() {
		setResizable(false);
		setTitle("Exercicio02");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 350, 216, 126);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAmigo = new JLabel("Informe o nome do amigo:");
		lblAmigo.setHorizontalAlignment(SwingConstants.CENTER);
		lblAmigo.setBounds(10, 10, 182, 13);
		contentPane.add(lblAmigo);
		
		tfAmigo = new JTextField();
		tfAmigo.setBounds(36, 29, 129, 19);
		contentPane.add(tfAmigo);
		tfAmigo.setColumns(10);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				chamaAdicionarNumero();
			}
		});
		btnOk.setBounds(60, 58, 85, 21);
		contentPane.add(btnOk);
	}
	
public void chamaAdicionarNumero() {
	
	String nomeAmigo = tfAmigo.getText();
	
	ExercicioDoisVO exercicioDoisVO = new ExercicioDoisVO("Jose");
	exercicioDoisVO.adicionarAmigo(nomeAmigo);
	
	ExercicioDoisDAO exercicioDoisDAO = new ExercicioDoisDAO();
	
	exercicioDoisDAO.salvarExercicio(exercicioDoisVO);
	
	chamaTelaEscolha();
}

public void chamaTelaEscolha() {
	
			try {
				TelaEscolhaExercicioDoisVIEW frame = new TelaEscolhaExercicioDoisVIEW();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
	
}

}
