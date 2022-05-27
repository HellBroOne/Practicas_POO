package mx.edu.uaz.ingsoft.hilos.elementos;
//imports si se rerquieren
import javax.swing.JLabel;

public class Elemento extends Thread{
	private char c;
	private JLabel etiqueta;

	public Elemento(char c, JLabel etiqueta){
		this.c = c;
		this.etiqueta = etiqueta;
	}

	class HelloRunner implements Runnable {
	public void run() {
		String out = etiqueta.getText();
		for (int i = 0; i<31; i++) {
			out = out+c;
			this.sleep(500);
		}
		etiqueta = out+" Finalizado";
	}
}