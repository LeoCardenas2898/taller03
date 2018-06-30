package resolucion;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;


public class Reto6 extends JFrame{

    private Container contenedor;
    private JList list1, list2;
    private JButton move, remove;
    private JScrollPane mov, mov1;
    String lp[]={"Python", "Java", "C", "C#", "Pascal", "Fortran", "Kotlin"};
  	
	public Reto6() {
		super("Reto 6");
	    contenedor = this.getContentPane();
	    contenedor.setLayout(new FlowLayout(FlowLayout.CENTER));
	    list1 = new JList(lp);
	    list1.setVisibleRowCount(7);
	    list1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
	    list2 = new JList();
	    list2.setVisibleRowCount(7);
	    list2.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
	    mov = new JScrollPane(list1);
	    mov1 = new JScrollPane(list2);
	    move = new JButton("Move >>");
	    remove = new JButton("<< Remove");
	    move.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
	            list2.setListData(list1.getSelectedValues());
	            
			}
		});
	    
	    remove.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub			
				list1.setListData(list2.getSelectedValues());
			}
		});
	    
	    contenedor.add(mov);
	    contenedor.add(move);
	    contenedor.add(remove);
	    contenedor.add(mov1);
	    this.setSize(600,300);
	    this.setVisible(true);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reto6 aplicacion = new Reto6();
		aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
