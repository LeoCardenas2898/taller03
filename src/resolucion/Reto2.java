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

public class Reto2 extends JFrame{

	private JButton bt1, bt2;
	private Integer i = 1, j = 1;
	
	public Reto2() {
		super("Botones");
		Container contenedor = getContentPane();
		Icon img = new ImageIcon("imagen.gif");
		ManejadorBoton manejador = new ManejadorBoton();
		bt1 = new JButton("Primer botón");
		bt2 = new JButton("Segundo botón");
		bt1.addActionListener(manejador);
		bt2.addActionListener(manejador);
		bt1.setEnabled(false);
		contenedor.setLayout(new FlowLayout());
		contenedor.add(bt1);
		contenedor.add(bt2);
		setSize(300, 150);
		setVisible(true);
	}

	private class ManejadorBoton implements ActionListener {
		public void actionPerformed(ActionEvent evento) {
			if (evento.getSource() == bt1) {
				JOptionPane.showMessageDialog(null, "Usted oprimio el primer bóton " + i + " veces");
				i++;
				bt2.setEnabled(true);
				bt1.setEnabled(false);
			}

			if (evento.getSource() == bt2) {
				JOptionPane.showMessageDialog(null, "Usted oprimio el segundo botón " + j + " veces");
				j++;
				bt1.setEnabled(true);
				bt2.setEnabled(false);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reto2 aplicacion = new Reto2();
		aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
