//paquete
package com.archivos.lectura.ventanas;
//imports
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends JFrame{
	private JLabel lblFile;
	private JTextField txtFile;
	private JButton btnOpen;
	private JTextArea txtContenido;
	private JLabel lblN;
	private JLabel lblLeidos;
	private JMenuBar mb;
	private JMenu mnuArchivo;
	private JMenuItem mnuProcess;
	private JMenuItem mnuExit;

	//Se aniade el constructor
	public VentanaPrincipal(){
		this.setLayout(new FlowLayout());
		this.setTitle("Practica 15");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.initComponents();
	}
	//Metodo que inicia los componentes

	public void initComponents(){
		mb = new JMenuBar();
		mnuArchivo = new JMenu("Archivo");
		mnuProcess = new JMenuItem("Procesar");
		mb.add(mnuArchivo);

		//escuchador
		mnuProcess.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				procesar();
			}

		});

		//agregarlos a los menus
		mnuArchivo.add(mnuProcess);
		mnuArchivo.addSeparator();

		//crear el exit
		mnuExit = new JMenuItem("Salir");
		//otrolistener
		mnuExit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				dispose();
			}
		});
		mnuArchivo.add(mnuExit);
		this.setJMenuBar(mb);

		//crear y agregar las etiquetas
		lblFile = new JLabel("Nombre del Archivo: ");
		this.add(lblFile);

		//Cuadro de texto
		txtFile = new JTextField(30);
		this.add(txtFile);
		//NOTA DEBEN DE IR AGREGADOS
		txtContenido = new JTextArea();
		txtContenido.setSize(20,40);
		this.add(txtContenido);
		//Lectura de caracteres 
		lblLeidos = new JLabel("Caracteres leidos: ");
		this.add(lblLeidos);
		lblN = new JLabel("0");
		this.add(lblN);
		//tamaño de ventana
		this.setSize(550, 450);
	}

	//Procesar (aún sin crear)
	public void procesar(){

	}
}