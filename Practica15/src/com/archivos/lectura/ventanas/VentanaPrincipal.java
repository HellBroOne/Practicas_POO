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
import javax.swing.JOptionPane;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Properties;
import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

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
		txtContenido = new JTextArea(20, 40);
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
		String ruta = System.getProperty("user.home") + "\\";
		String archivo = ruta + txtFile.getText();
		File f = new File(archivo);
		//System.out.println(archivo); no hace falta ya el print, quedó bien
	
		if (!( f.exists() ) ){
			JOptionPane.showMessageDialog(this, ("OMG!\nEl archivo no existe papus."));
			limpiarTextos(true);
			return;
		}
		limpiarTextos(false);
		if (f.isFile()) {
			//si es archivo...
			openFile(f);
		}
		if (f.isDirectory()){
			openDir(f);
		}
		

	}

	//Abrir y leer openfile
	public void openFile(File f){
		try {
			BufferedReader in = new BufferedReader(new FileReader(f));
			String s;
			s = in.readLine();
			while ( s != null ) {
				txtContenido.setText(s);
				s = in.readLine();
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void openDir(File f){
		//txtContenido.setText(aqui va la variable que se deba abrir )
		String [] dir = f.list();
		Arrays.sort(dir);
		int i;
		String dir_res = "";
		for (i = 0; i < dir.length ; i++) {
			dir_res = dir_res + dir[i] + "\n";
		}
		System.out.println(dir_res);
		txtContenido.setText(dir_res);
	}


	public void limpiarTextos(boolean txtF){
		if (txtF == true){
			txtFile.setText("");
			txtContenido.setText("");
			lblN.setText("0");
		} 
	}
}