import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.Component;

public class BoxExample {
	private JFrame f;
	private JButton b1;
	private JButton b2;
	private JButton b3;
	private JButton b4;
	private JButton b5;

    public BoxExample() {
    	f = new JFrame("Box Layout Example");
    	b1 = new JButton("Button 1");
    	b2 = new JButton("Button 2");
    	b3 = new JButton("Button 3");
    	b4 = new JButton("Button 4");
    	b5 = new JButton("Button 5");
    	b1.setAlignmentX(f.CENTER_ALIGNMENT);
    	b2.setAlignmentX(f.CENTER_ALIGNMENT);
    	b3.setAlignmentX(f.CENTER_ALIGNMENT);
    	b4.setAlignmentX(f.CENTER_ALIGNMENT);
    	b5.setAlignmentX(f.CENTER_ALIGNMENT);
    }

    public void launchFrame() {
    	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	f.setLayout(new BoxLayout(f.getContentPane(), BoxLayout.Y_AXIS));
    	f.add(b1);
    	f.add(b2);
    	f.add(b3);
    	f.add(b4);
    	f.add(b5);
    	
    	f.pack();
    	f.setVisible(true);
    }

    public static void main(String args[]) {
    	BoxExample guiWindow = new BoxExample();
    	guiWindow.launchFrame();

    }
} // fin de la clase BoxExample