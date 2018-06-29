package resolucion;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class Reto6 extends JFrame{
	
	private JScrollPane scroll;
    private String colores[]={"BLACK", "BLUE", "CYAN", "DARK_GRAY","GRAY","GREEN","LIGHT_GRAY", "MAGENTA","ORANGE","PINK","RED","WHITE", "YELLOW"};
    
    private Color vcolores[]={Color.BLACK , Color.BLUE, Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.GREEN, Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color.PINK, Color.RED, Color.WHITE, Color.YELLOW};
  	
	public Reto6() {
		super("Reto 6");
		Container contenedor = getContentPane();
		contenedor.setLayout(new FlowLayout());
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reto6 aplicacion = new Reto6();
		aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
