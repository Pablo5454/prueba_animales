package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaInicial {

	public static void main(String[] args) {
			
		JFrame jf = new JFrame("ANIMALES");

		JPanel jp = new JPanel();
		jp.setLayout(new BorderLayout());

		JPanel imagen = new JPanel();
		JLabel img=new JLabel(new ImageIcon("animal.jpg"))
			img.add();
		
		JLabel titulo = new JLabel("¿Qué animal hay en la imagen?");
		
		JPanel opciones = new JPanel();
		opciones.setLayout(new FlowLayout());
		JButton b1= new JButton("<< Atrás");
		JButton b2= new JButton("Confirmar");
		JButton b3= new JButton("Adelante >>");
		b1.add(opciones);
		b2.add(opciones);
		b3.add(opciones);
		
		JPanel menu = new JPanel();
		menu.setLayout(new GridLayout());
		
		JPanel panelDerecho = new JPanel();
		panelDerecho.setLayout(new BoxLayout(panelDerecho, BoxLayout.Y_AXIS));
		panelDerecho.add(titulo);
		panelDerecho.add(menu);
		panelDerecho.add(opciones);

		jp.add(imagen, BorderLayout.WEST);
		jp.add(panelDerecho, BorderLayout.EAST);
		
		
	}

}
