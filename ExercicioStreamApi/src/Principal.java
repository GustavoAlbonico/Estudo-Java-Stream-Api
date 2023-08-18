

import java.awt.EventQueue;

import br.com.streamapi.view.TelaMenuPrincipalExerciciosVIEW;



public class Principal {
	
	public static void main(String[] args) {
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaMenuPrincipalExerciciosVIEW frame = new TelaMenuPrincipalExerciciosVIEW();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

}
