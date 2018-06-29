package resolucion;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Reto4 extends JFrame {

	private JTextField n1, n2;
	private JButton suma, resta, multiplicacion, division;

	public Reto4() {
		super("Reto 4");
		ManejadorBoton mb = new ManejadorBoton();
		Container contenedor = getContentPane();
		contenedor.setLayout(new FlowLayout());
		n1 = new JTextField(10);
		n2 = new JTextField(10);
		suma = new JButton("+");
		resta = new JButton("-");
		multiplicacion = new JButton("*");
		division = new JButton("/");
		suma.addActionListener(mb);
		resta.addActionListener(mb);
		multiplicacion.addActionListener(mb);
		division.addActionListener(mb);
		contenedor.add(n1);
		contenedor.add(n2);
		contenedor.add(suma);
		contenedor.add(resta);
		contenedor.add(multiplicacion);
		contenedor.add(division);
		setSize(290, 300);
		setVisible(true);
	}

	class ManejadorBoton implements ActionListener {
		public void actionPerformed(ActionEvent evento) {
			String a = n1.getText();
			String b = n2.getText();
			int n = Integer.valueOf(a);
			int m = Integer.valueOf(b);

			if (evento.getSource() == suma) {
				int S = n + m;
				JOptionPane.showMessageDialog(null, "El resultado es: " + S);
			}

			if (evento.getSource() == resta) {
				int R = n - m;
				JOptionPane.showMessageDialog(null, "El resultado es: " + R);
			}

			if (evento.getSource() == multiplicacion) {
				int M = n * m;
				JOptionPane.showMessageDialog(null, "El resultado es: " + M);
			}

			if (evento.getSource() == division) {
				double D = Double.parseDouble(n + "") / Double.parseDouble(m + "");
				JOptionPane.showMessageDialog(null, "El resultado es: " + D);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reto4 aplicacion = new Reto4();
		aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
