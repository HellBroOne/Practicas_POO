//import
import javax.swing.JFrame;

public class Acciones{
	private JFrame v;

	public Acciones(JFrame v){
		v.setLayout(new FlowLayout());
		v.setTitle("Practica 16");
		v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void iniciar(){
		Elemento e1 = new Elemento("G", v.getEtiqueta());
		Elemento e2 = new Elemento("R", v.getEtiqueta());
	}
}