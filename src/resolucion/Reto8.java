package resolucion;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Reto8 extends JFrame {
	
	private JButton bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt10, bt11, bt12, bt13, bt14, bt15, bt16, bt17;
	private JTextField txt1;
	private double n1=0, n2=0;
	private String operacion ="";
	boolean nueva=true;
	
	public Reto8() {
		super("Reto 8");
		ManejadorBoton  boton = new ManejadorBoton();
		Container n = new JPanel();
		n.setLayout(new GridLayout(4, 4));
		n.add(bt1 = new JButton("7"));
		n.add(bt2 =new JButton("8"));
		n.add(bt3 = new JButton("9"));
		n.add(bt4 = new JButton("/"));
		n.add(bt5 = new JButton("4"));
		n.add(bt6 = new JButton("5"));
		n.add(bt7 = new JButton("6"));
		n.add(bt8 = new JButton("*"));
		n.add(bt9 = new JButton("1"));
		n.add(bt10 = new JButton("2"));
		n.add(bt11 = new JButton("3"));
		n.add(bt12 = new JButton("-"));
		n.add(bt13 = new JButton("0"));
		n.add(bt14 = new JButton("."));
		n.add(bt15 = new JButton("C"));
		n.add(bt16 = new JButton("+"));
		Container r = new JPanel();
		r.setLayout(new GridLayout(1, 5));
		r.add(bt17 = new JButton("="));
		bt1.addActionListener(boton);
		bt2.addActionListener(boton);
		bt3.addActionListener(boton);
		bt4.addActionListener(boton);
		bt5.addActionListener(boton);
		bt6.addActionListener(boton);
		bt7.addActionListener(boton);
		bt8.addActionListener(boton);
		bt9.addActionListener(boton);
		bt10.addActionListener(boton);
		bt11.addActionListener(boton);
		bt12.addActionListener(boton);
		bt13.addActionListener(boton);
		bt14.addActionListener(boton);
		bt15.addActionListener(boton);
		bt16.addActionListener(boton);
		bt17.addActionListener(boton);
		Container a = getContentPane();
		a.add(BorderLayout.NORTH, txt1 =  new JTextField());
		txt1.setEnabled(false);
		txt1.setFont(new Font("Arial", Font.BOLD, 25));
		a.add(BorderLayout.CENTER, n);
		a.add(BorderLayout.EAST, r);
		setSize(400, 300);
		setVisible(true);
	}
	
	private class ManejadorBoton implements ActionListener {
		public void actionPerformed(ActionEvent evento) {
			String cadena = txt1.getText();
			if (evento.getSource() == bt1) {
				txt1.setText(cadena+"7");
			}else if(evento.getSource() == bt2) {
				txt1.setText(cadena+"8");
			}else if(evento.getSource() == bt3) {
				txt1.setText(cadena+"9");
			}else if(evento.getSource() == bt4) {
				//Division
				n1=Double.parseDouble(txt1.getText());
				txt1.setText("");
				operacion = "/";
			}else if(evento.getSource() == bt5) {
				txt1.setText(cadena+"4");
			}else if(evento.getSource() == bt6) {
				txt1.setText(cadena+"5");
			}else if(evento.getSource() == bt7) {
				txt1.setText(cadena+"6");
			}else if(evento.getSource() == bt8) {
				//Multiplicacion
				n1=Double.parseDouble(txt1.getText());
				txt1.setText("");
				operacion = "*";
			}else if(evento.getSource() == bt9) {
				txt1.setText(cadena+"1");
			}else if(evento.getSource() == bt10) {
				txt1.setText(cadena+"2");
			}else if(evento.getSource() == bt11) {
				txt1.setText(cadena+"3");
			}else if(evento.getSource() == bt12) {
				//Resta
				n1=Double.parseDouble(txt1.getText());
				txt1.setText("");
				operacion = "-";
			}else if(evento.getSource() == bt13) {
				txt1.setText(cadena+"0");
			}else if(evento.getSource() == bt14) {
				txt1.setText(cadena+".");
			}else if(evento.getSource() == bt15) {
				txt1.setText("");
                n1=n2=0;
                operacion="";
			}else if(evento.getSource() == bt16) {
				//Suma:
				n1=Double.parseDouble(txt1.getText());
				txt1.setText("");
				operacion = "+";
			}if(evento.getSource() == bt17) {
				n2=Double.parseDouble(txt1.getText());
				if(operacion.equals("+")) {
					double res=n1+n2;
                    txt1.setText(String.valueOf(res));
                    n1=n2=0;
                    operacion="";
				}else if(operacion.equals("-")) {
					double res=n1-n2;
                    txt1.setText(String.valueOf(res));
                    n1=n2=0;
                    operacion="";
				}else if(operacion.equals("*")) {
					double res=n1*n2;
                    txt1.setText(String.valueOf(res));
                    n1=n2=0;
                    operacion="";
				}else if(operacion.equals("/")) {
					double res=n1/n2;
                    txt1.setText(String.valueOf(res));
                    n1=n2=0;
                    operacion="";
				}
			}
		}
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reto8 aplicacion = new Reto8();
		aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
