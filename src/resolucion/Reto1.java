package resolucion;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Reto1 extends JFrame {

	private JButton bt1, bt2;
	private Integer i = 1, j = 1;

	public Reto1() {
		super("Reto 1");
		Container contenedor = getContentPane();
		Icon img = new ImageIcon("imagen.gif");
		ManejadorBoton manejador = new ManejadorBoton();
		bt1 = new JButton("Boton simple");
		bt2 = new JButton("Boton elegante", img);
		bt1.addActionListener(manejador);
		bt2.addActionListener(manejador);
		contenedor.setLayout(new FlowLayout());
		contenedor.add(bt1);
		contenedor.add(bt2);
		setSize(300, 300);
		setVisible(true);
	}

	private class ManejadorBoton implements ActionListener {
		public void actionPerformed(ActionEvent evento) {
			if (evento.getSource() == bt1) {
				JOptionPane.showMessageDialog(null, "Usted oprimio el boton simple " + i + " veces");
				i++;

			}

			if (evento.getSource() == bt2) {
				JOptionPane.showMessageDialog(null, "Usted oprimio el boton elegante " + j + " veces");
				j++;

			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reto1 aplicacion = new Reto1();
		aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
