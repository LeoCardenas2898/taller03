package resolucion;

import javax.swing.JFrame;
import resolucion.PanelDibujo;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static resolucion.PanelDibujo.n;

public class Reto7 extends JFrame {
	
	static JButton aumentar, disminuir;
	
	static class ManejadorBoton implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent evento) {
			if (evento.getSource() == aumentar) {
				int g = n + 10;
				JOptionPane.showMessageDialog(null, "Se ha aumentado el tamaño en 10");
				n = g;
			}

			if (evento.getSource() == disminuir) {
				if (n > 10) {
					int d = n - 10;
					JOptionPane.showMessageDialog(null, "Se ha disminuido tamaño en 10");
					n = d;
				} else
					JOptionPane.showMessageDialog(null, "Valor muy pequeño");

			}
		}

	}

	public static void main(String[] args) {
		ManejadorBoton mb = new ManejadorBoton();
		JFrame aplicacion = new JFrame("Reto 7");
		PanelDibujo panelDibujo = new PanelDibujo();
		aumentar = new JButton("Aumentar");
		disminuir = new JButton("Disminuir");
		aumentar.setSize(100, 20);
		disminuir.setSize(100, 20);
		disminuir.setLocation(100, 0);
		disminuir.addActionListener(mb);
		aumentar.addActionListener(mb);
		aumentar.setVisible(true);
		disminuir.setVisible(true);
		aplicacion.add(aumentar);
		aplicacion.add(disminuir);
		aplicacion.add(panelDibujo, BorderLayout.CENTER);

		aplicacion.add(new JLabel("Arrastre el raton para dibujar"), BorderLayout.SOUTH);
		aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aplicacion.setSize(500, 300);
		aplicacion.setVisible(true);

	}

}
