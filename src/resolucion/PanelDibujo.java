package resolucion;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PanelDibujo extends JPanel {
	private Point puntos[] = new Point[10000];
	private int cuentaP = 0;
	static int n = 4;

	public PanelDibujo() {

		this.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent evento) {
				if (cuentaP < puntos.length) {
					puntos[cuentaP] = evento.getPoint();
					cuentaP++;
					repaint();
				}
			}
		});
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (int i = 0; i < cuentaP; i++)
			g.fillOval(puntos[i].x, puntos[i].y, n, n);
	}
}
