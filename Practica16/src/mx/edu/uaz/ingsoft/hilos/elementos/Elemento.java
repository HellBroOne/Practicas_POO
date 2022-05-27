package mx.edu.uaz.ingsoft.hilos.elementos;
//imports si se rerquieren
import javax.swing.JLabel;

public class Elemento extends Thread{
	private char c;
	private Jlabel etiqueta;

	public Elemento(char c, Jlabel etiqueta){
		this.c = c;
		this.etiqueta = etiqueta;
	}

	public void getEtiqueta(){
		return etiqueta;
	}

	class HelloRunner implements Runnable {
	int i;
	public void run() {
		String out = etiqueta.getText();
		for (int i = 0; i<31; i++) {
			etiqueta = etiqueta+c;
			this.sleep(500);
		}
		out = etiqueta+" Finalizado";
	}
}