package vista;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaPrincipal {

	public VentanaPrincipal() {
		JFrame jf = new JFrame("ANIMALES");

		JPanel jp = new JPanel();
		jp.setLayout(new BorderLayout());

		JPanel imagen = new JPanel();

		JLabel titulo = new JLabel();
		
		JPanel menu = new JPanel();
		menu.setLayout(new GridLayout());
		
		JPanel opciones = new JPanel();
		opciones.setLayout(new BoxLayout(opciones, BoxLayout.Y_AXIS));
		opciones.add(titulo);
		opciones.add(menu);

	
	}



}
