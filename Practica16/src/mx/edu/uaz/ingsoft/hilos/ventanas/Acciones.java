package mx.edu.uaz.ingsoft.hilos.ventanas; 
//import
import mx.edu.uaz.ingsoft.hilos.elementos.Elemento;

public class Acciones{
	private Ventana v;

	public Acciones(Ventana v){
		this.v = v;
	}

	public void iniciar(){
		System.out.println("Hilo iniciado");
		Elemento e1 = new Elemento('G', v.getEtiqueta1());
		Elemento e2 = new Elemento('R', v.getEtiqueta2());
		e1.start();
		e2.start();
	}

}