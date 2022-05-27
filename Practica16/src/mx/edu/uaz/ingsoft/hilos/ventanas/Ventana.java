//package
package mx.edu.uaz.ingsoft.hilos.ventanas; 
//imports
import mx.edu.uaz.ingsoft.hilos.ventanas.Acciones; 
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;

public class Ventana extends JFrame{
	private Acciones acc;
	private Jlabel etq1;
	private Jlabel etq2;
	private JMenuBar mb;
	private JMenu mnuArchivo;
	private JMenuItem miStart;
	private JMenuItem miExit;

	public Ventana(){
		Acciones acc = new Acciones(this);
		Jlabel etq1 = new JLabel("Elemento 1: ");
		JLabel etq2 = new JLabel("Elemento 2: ");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Para el menú (CREAR)
		mb = new JMenuBar();
		mnuArchivo = new JMenu("Archivo");
		miStart = new JMenuItem("Iniciar");
		miExit = new JMenuItem("Salir");
		//agregar a mnuAchivo
		mb.add(mnuArchivo);

		//Se agrega a mnuArchivo los item
		mnuArchivo.add(miStart);
		mnuArchivo.add(miExit);
	}
}