package resolucion;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Reto6 extends JFrame{
	
	private JList listacolores, listacolores1;
	private JScrollPane scroll, scroll1;
    private String colores[]={"BLACK", "BLUE", "CYAN", "DARK_GRAY","GRAY","GREEN","LIGHT_GRAY", "MAGENTA","ORANGE","PINK","RED","WHITE", "YELLOW"};
    private Color vcolores[]={Color.BLACK , Color.BLUE, Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.GREEN, Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color.PINK, Color.RED, Color.WHITE, Color.YELLOW};
  	private Container contenedor;
  	
	public Reto6() {
		super("Reto 6");
		contenedor = getContentPane();
		contenedor.setLayout(new FlowLayout());
		ManejadorLista ml = new ManejadorLista();
		listacolores = new JList(colores);
	    listacolores.setVisibleRowCount(5);
	    listacolores.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	    scroll = new JScrollPane(listacolores);
	    
	    listacolores1 = new JList(colores);
        listacolores1.setVisibleRowCount(5);
        listacolores1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        scroll1 = new JScrollPane(listacolores1);
        contenedor.add(scroll1);

        ml = new ManejadorLista();
        listacolores.addListSelectionListener(ml);
	    contenedor.add(scroll);
		setSize(300, 300);
		setVisible(true);
	}
	
	private class ManejadorLista implements ListSelectionListener{

        @Override
        public void valueChanged(ListSelectionEvent evento) {
            int index = listacolores.getSelectedIndex();
            contenedor.setBackground(vcolores[index]);
        }
        
        
        
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reto6 aplicacion = new Reto6();
		aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
