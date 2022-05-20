import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Container;
import java.awt.ComponentOrientation;
import java.awt.Insets;

public class GridBagExample {
    final static boolean shouldFill = true;
    final static boolean shouldWeightX = true;
    final static boolean RIGHT_TO_LEFT = false;

    public static void addToFrame(Container f) {
        if (RIGHT_TO_LEFT) {
            f.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        }

        JButton button;
	f.setLayout(new GridBagLayout());
	GridBagConstraints c = new GridBagConstraints();
	if (shouldFill) {
	c.fill = GridBagConstraints.HORIZONTAL;
	}

	button = new JButton("Button 1");
	if (shouldWeightX) {
	c.weightx = 0.5;
	}
	c.fill = GridBagConstraints.HORIZONTAL;
	c.gridx = 0;
	c.gridy = 0;
	f.add(button, c);

	button = new JButton("Button 2");
	c.fill = GridBagConstraints.HORIZONTAL;
	c.weightx = 0.5;
	c.gridx = 1;
	c.gridy = 0;
	f.add(button, c);

	button = new JButton("Button 3");
	c.fill = GridBagConstraints.HORIZONTAL;
	c.weightx = 0.5;
	c.gridx = 0;
	c.gridy = 1;
	f.add(button, c);

	button = new JButton("Button 4");
	c.fill = GridBagConstraints.HORIZONTAL;
	c.ipady = 20;     
	c.weightx = 0.0;
	c.gridwidth = 3;
	c.gridx = 2;
	c.gridy = 1;
	f.add(button, c);

	button = new JButton("Button 5");
	c.fill = GridBagConstraints.HORIZONTAL;
	c.ipady = 0;    
	c.weighty = 1.0;
	c.weightx = 2.0;
	c.anchor = GridBagConstraints.PAGE_END;
	c.insets = new Insets(10,0,0,0);  
	c.gridx = 1;       
	c.gridwidth = 2;   
	c.gridy = 2;       
	f.add(button, c);
    }

    private static void launchFrame() {
        JFrame frame = new JFrame("GridBag Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addToFrame(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
      GridBagExample grid = new GridBagExample();
      grid.launchFrame();
    }
}