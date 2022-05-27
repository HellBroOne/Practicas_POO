package mx.edu.uaz.ingsoft.hilos.elementos;
//imports si se rerquieren
import javax.swing.JLabel;

public class Elemento extends Thread {
	private char c;
	private JLabel etiqueta;

	public Elemento(char c, JLabel etiqueta){
		this.c = c;
		this.etiqueta = etiqueta;
	}

	public void run() {
		System.out.println("Run hecho");
		String out = etiqueta.getText();
		for (int i = 0; i<31; i++) {
			out = out+c;
			etiqueta.setText(out);
			try{
				Thread.sleep(500);
			} catch (InterruptedException e){
				e.printStackTrace();
			}
		}
		out = out+" Finalizado";
		etiqueta.setText(out);
	}
}