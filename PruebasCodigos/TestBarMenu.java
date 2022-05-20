//imports de las Javas y esa cosas
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

public class TestBarMenu {
	private JFrame f;
	private JButton b1, b2, b3, b4, b5;
	private JMenuBar mb;
	private JMenu m1, m2, m3;
	private JCheckBoxMenuItem mi5;
	private JMenuItem mi1, mi2, mi3, mi4;

	public void launchFrame(){
		f = new JFrame("MenuBar");
		mb = new JMenuBar();
		f.setJMenuBar(mb);
		//Close
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Crear la barra del Menú
		mb = new JMenuBar();
		m1 = new JMenu("File");
		m2 = new JMenu("Edit");
		m3 = new JMenu("Help");
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		f.setJMenuBar(mb);

		mi1 = new JMenuItem("New");
		mi2 = new JMenuItem("Save");
		mi3 = new JMenuItem("Load");
		mi4 = new JMenuItem("Quit");
		m1.add(mi1);
		m1.add(mi2);
		m1.add(mi3);
		m1.addSeparator();
		m1.add(mi4);
		mi5 = new JCheckBoxMenuItem("Persistent");
		m1.add(mi5);


		f.pack();
		f.setVisible(true);
	}

	//Primero que nada, hay que hacer el frame 
	

	public static void main(String[] args) {
		TestBarMenu men = new TestBarMenu();
		men.launchFrame();
	}
}