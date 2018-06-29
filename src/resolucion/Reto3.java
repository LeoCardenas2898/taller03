package resolucion;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Reto3 extends JFrame{
	
	private JLabel text1, text2;
	private JTextField username, password;
	private JButton login;
	
	public Reto3() {
		super("Reto3");
		Container contenedor = getContentPane();
		ManejadorBoton manejadorBoton = new ManejadorBoton();
		username = new JTextField(10);
		password = new JPasswordField(10);
		text1 = new JLabel("Username: ");
		text2 = new JLabel("Password: ");
		login = new JButton("Login");
		contenedor.setLayout(new FlowLayout(FlowLayout.CENTER));
		login.addActionListener(manejadorBoton);
		contenedor.add(text1);
		contenedor.add(username);
		contenedor.add(text2);
		contenedor.add(password);
		contenedor.add(login);
		setSize(500, 100);
		setVisible(true);
	}
	
	private class ManejadorBoton implements ActionListener {
		public void actionPerformed(ActionEvent evento) {
			if (evento.getSource() == login) {
				if(username.getText().equals("Leonardo") && password.getText().equals("hola")) {
					JOptionPane.showMessageDialog(null, "Sesion iniciada.");
				}else if(username.getText().equals("Leonardo")|| password.getText().equals("hola")){
					JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta.");
				}
			
			}
		}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reto3 aplication = new Reto3();
		aplication.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
