package vista;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaPreguntas {

	public static void main(String[] args) {
		new VentanaPreguntas();
	}
	public VentanaPreguntas() {
		JFrame jf = new JFrame();
		jf.setSize(600, 400);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//DISPOSE_ON_CLOSE si son varias ventanas
		
		//LAYOUTS QUE ENTRAN: ABSOLUT, GRID, BORDER, FLOW
		
		jf.getContentPane().setLayout(new BorderLayout());		
		
		JLabel imagen = new JLabel(new ImageIcon("img/ardilla.png"));
		jf.getContentPane().add(imagen, BorderLayout.WEST);
		
		
		
		
		jf.setVisible(true);
	}

}
