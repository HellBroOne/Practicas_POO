//package
package mx.edu.uaz.ingsoft.hilos.ventanas; 
//imports
import mx.edu.uaz.ingsoft.hilos.ventanas.Acciones; 
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;

public class Ventana extends JFrame{
	private Acciones acc;
	private JLabel etq1;
	private JLabel etq2;
	private JMenuBar mb;
	private JMenu mnuArchivo;
	private JMenuItem miStart;
	private JMenuItem miExit;

	public Ventana(){
		acc = new Acciones(this);
		etq1 = new JLabel("Elemento 1: ");
		etq2 = new JLabel("Elemento 2: ");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Para el menú (CREAR)
		mb = new JMenuBar();
		this.setJMenuBar(mb);
		mnuArchivo = new JMenu("Archivo");
		miStart = new JMenuItem("Iniciar");
		//agregar a mnuAchivo
		mb.add(mnuArchivo);

		//Se hacen los listeners anonimos
		miStart.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				acc.iniciar();
			}
		});

		miExit = new JMenuItem("Salir");
		miExit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				dispose();
			}
		});

		//Se agrega a mnuArchivo los item
		mnuArchivo.add(miStart);
		mnuArchivo.add(miExit);
	}

	public JLabel getEtiqueta1(){
		return etq1;
	}

	public JLabel getEtiqueta2(){
		return etq2;
	}

	public void mostrarVentana(){
		this.add(etq1, BorderLayout.NORTH);
		this.add(etq2, BorderLayout.SOUTH);
		this.setSize(800, 200);
		this.setVisible(true);
	}

}