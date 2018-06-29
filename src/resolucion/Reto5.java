package resolucion;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Reto5 extends JFrame {

	private JLabel txt1, txt2, txt3, txt4, etiqueta;
	private JTextField numero1, numero2;
	private JComboBox operaciones;
	private String Op[] = { " ", "+", "-", "*", "/" };

	public Reto5() {
		super("Reto 5");
		ManejadorCombo mc = new ManejadorCombo();
		Container contenedor = getContentPane();
		contenedor.setLayout(new FlowLayout(FlowLayout.CENTER));
		operaciones = new JComboBox(Op);
		numero1 = new JTextField(10);
		numero2 = new JTextField(10);
		txt1 = new JLabel("Primer número");
		txt2 = new JLabel("Segundo número");
		txt3 = new JLabel("Operación");
		txt4 = new JLabel("Resultado");
		etiqueta = new JLabel();
		contenedor.add(txt1);
		contenedor.add(numero1);
		contenedor.add(txt2);
		contenedor.add(numero2);
		contenedor.add(txt3);
		contenedor.add(operaciones);
		contenedor.add(txt4);
		contenedor.add(etiqueta);
		operaciones.addItemListener(mc);
		setSize(700, 120);
		setVisible(true);

	}

	private class ManejadorCombo implements ItemListener {
		@Override
		public void itemStateChanged(ItemEvent select) {
			String a = numero1.getText();
			String b = numero2.getText();
			int n = Integer.valueOf(a);
			int m = Integer.valueOf(b);

			if (select.getStateChange() == ItemEvent.SELECTED) {
				int index = operaciones.getSelectedIndex();
				if (index == 0) {
					etiqueta.setText("Seleccione operacion");
				}
				if (index == 1) {
					int S = n + m;
					etiqueta.setText(String.valueOf(S));
				}
				if (index == 2) {
					int R = n - m;
					etiqueta.setText(String.valueOf(R));
				}
				if (index == 3) {
					int M = n * m;
					etiqueta.setText(String.valueOf(M));
				}
				if (index == 4) {
					double D = Double.parseDouble(n + "") / Double.parseDouble(m + "");
					etiqueta.setText(String.valueOf(D));
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reto5 aplicacion = new Reto5();
		aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
