import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TestButton2 {
    private JFrame f;
    private JButton b;

    public TestButton2(){
        f= new JFrame("Test");
        b= new JButton("Press Me!");
        b.setActionCommand("ButtonPressed");
    }

    public void launchFrame() {
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e) {
               accionDelBoton(e);
           } 
        });
        f.add(b, BorderLayout.CENTER);
        f.pack();
        f.setVisible(true);
    }

    public static void main(String[] args) {
        TestButton guiApp= new TestButton();
        guiApp.launchFrame();
    }

    private void accionDelBoton(ActionEvent e){
        System.out.println("Accion realizada");
        System.out.println("El contenido del boton es:" + e.getActionCommand());
    }
}