import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class ButtonHandler implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.out.println("Accion realizada.");
		System.out.println("El comando del boton es: "+ e.getActionCommand());
	}
}