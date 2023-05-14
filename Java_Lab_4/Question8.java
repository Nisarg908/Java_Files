import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class dialoguebox extends WindowAdapter implements ActionListener {

    Frame frame;
    Label label1;
    TextField field1;
    Button button1;
    Dialog d1;

    dialoguebox() {

        frame = new Frame(" Dialog Box Example ");
        button1 = new Button(" Open Dialog Box ");
        label1 = new Label(" Click on the button to open the Dialogue Box ");

        frame.add(label1);
        frame.add(button1);
        button1.addActionListener(this);
        frame.pack();

        frame.setLayout(new FlowLayout());
        frame.setSize(330, 250);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
            public void windowClosed(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        d1 = new Dialog(frame, " Model_Dialogue ", false);
        Label label = new Label(" This is the Dialogue Box. ", Label.CENTER);
        d1.add(label);
        
        d1.pack();
        d1.setLocationRelativeTo(frame);
        d1.setLocation(new Point(100, 100));
        d1.setSize(400, 200);
        d1.setVisible(true); 
    }
}

public class Question8{
    public static void main(String[] args) {
        new dialoguebox();
    }
} 