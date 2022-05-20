import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JButton;

public class TestButton {
	private JFrame f;
	private JButton b;

	public TestButton() {
		f = new JFrame("Test");
		b = new JButton("Press Me!");
		b.setActionCommand("ButtonPressed");
	}

	public void launchFrame() {
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b.addActionListener(new ButtonHandler());
		f.add(b,BorderLayout.CENTER);
		f.pack();
		f.setVisible(true);
	}

	public static void main(String args[]) {
		TestButton guiApp = new TestButton();
		guiApp.launchFrame();
	}
}