import java.awt.*;
import java.awt.event.*;

class Keylistener extends Frame implements KeyListener {
    Label l;
    TextArea area;

    Keylistener() {

        l = new Label();
        l.setBounds(20, 50, 100, 20);
        area = new TextArea();
        area.setBounds(20, 80, 360, 300);
        area.addKeyListener(this);
        add(l);
        add(area);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
            public void windowClosed(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void keyPressed(KeyEvent e) {
        this.setBackground(Color.ORANGE);
        l.setText("Key Pressed");
    }

    public void keyReleased(KeyEvent e) {
        this.setBackground(Color.RED);
        l.setText("Key Released");
    }

    // keytyped can distinguish 'A' and 'a' seperately which keypress can't do
    public void keyTyped(KeyEvent e) {
        this.setBackground(Color.GREEN);
        l.setText("Key Typed");
    }
}

public class Question3{
    public static void main(String[] args) {
        new Keylistener();
    }
}