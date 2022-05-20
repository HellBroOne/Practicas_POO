//paquete
package com.archivos.lectura.ventanas;
//imports
import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame{
	JLabel lblFile;
	JTextField txtFile;
	JButton btnOpen;
	JTextArea txtContenido;
	JLabel lblN;
	JLabel lblLeidos;
	JMenuBar mb;
	JMenu mnuArchivo;
	JMenuItem mnuProcess;
	JMenuItem mnuExit;

	//Se aniade el constructor
	public VentanaPrincipal{
		this.setLayout(new FlowLayout());
		this.setTitle("Practica 15");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.initComponents(){};
	}
	//Metodo que inicia los componentes

	public void initComponents(){
		mb = new JMenuBar();
		mnuArchivo = new JMenu();
	}
}