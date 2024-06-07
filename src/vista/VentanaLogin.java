package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VentanaLogin {

	public static void main(String[] args) {
		VentanaLogin vl = new VentanaLogin();
	}
	public VentanaLogin() {
		JFrame jf = new JFrame();
		jf.setSize(500, 500);
		jf.setLocationRelativeTo(null);
		
		jf.getContentPane().setLayout(null);
		JLabel lblUsuario = new JLabel("Usuario");
		jf.getContentPane().add(lblUsuario);
		lblUsuario.setBounds(180, 100, 100, 100);
		JLabel lblContrasenya = new JLabel("Contraseña");
		jf.getContentPane().add(lblContrasenya);
		lblContrasenya.setBounds(180, 200, 100, 100);
		JTextField txtUsuario = new JTextField();
		jf.getContentPane().add(txtUsuario);
		txtUsuario.setBounds(260, 135, 80, 30);
		JTextField txtContrasenya = new JTextField();
		jf.getContentPane().add(txtContrasenya);
		txtContrasenya.setBounds(260, 235, 80, 30);
		
		JButton btnLogin = new JButton("Enviar");
		btnLogin.setBounds(200, 400, 100, 50);
		jf.getContentPane().add(btnLogin);
		
		btnLogin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Usuario: " + txtUsuario.getText() +"Contraseña: " + txtContrasenya.getText());				
			}
		});
		
		jf.setVisible(true);
	}

}
