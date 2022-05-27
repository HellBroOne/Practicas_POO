//package
package mx.edu.uaz.ingsoft.hilos.ventanas; 
//imports
import mx.edu.uaz.ingsoft.hilos.ventanas.Acciones; 
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ventana extends JFrame{
	private Acciones acc;
	private Jlabel etq1;
	private Jlabel etq2;
	private JMenuBar mb;
	private JMenuItem start;
	private JMenuItem exit;

	public Ventana(){
		Acciones acc = new Acciones(this);
		Jlabel etq1 = new JLabel("Elemento 1: ");
		JLabel etq2 = new JLabel("Elemento 2: ");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}