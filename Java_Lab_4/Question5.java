import java.awt.*;
import java.awt.event.*;
//import java.awt.event.WindowListener;

public class Question5 {
    public static void main(String[] args) 
    {
        Frame f = new Frame("PUSH Button Example");
        final TextField tf = new TextField();
        Button b = new Button("Button");
        b.setBounds(160, 190, 80, 20);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
            public void windowClosed(WindowEvent e) {
                System.exit(0);
            }
        });
        b.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    tf.setText("Button Pressed.");
                    tf.setBackground(Color.CYAN);
                }
            }
        );
        f.add(b);
        f.add(tf);
        f.setSize(400, 400);
        f.setVisible(true);
    }
}
