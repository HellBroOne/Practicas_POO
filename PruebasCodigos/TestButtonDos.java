import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TestButtonDos {
	private JFrame f;
	private JButton b;

	public TestButtonDos() {
		f = new JFrame("Test");
		b = new JButton("Press Me!");
		b.setActionCommand("ButtonPressed");
	}

	public void launchFrame() {
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e){
				accionBoton(e);
			}
		});
		f.add(b, BorderLayout.CENTER);
        f.pack();
        f.setVisible(true);
	}

	public static void main(String args[]) {
		TestButton guiApp = new TestButton();
		guiApp.launchFrame();
	}

	private void accionBoton (ActionEvent e){
		System.out.println("Accion realizada.");
		System.out.println("El comando del boton es: "+ e.getActionCommand());
	}
}