import java.awt.*;     
import javax.swing.*; 

public class Question9Border {
    JFrame frame;
    Question9Border(){
        frame = new JFrame();
        JButton b1 = new JButton("NORTH");     
        JButton b2 = new JButton("SOUTH");     
        JButton b3 = new JButton("EAST");     
        JButton b4 = new JButton("WEST");     
        //JButton b5 = new JButton("CENTER");

        frame.setLayout(new BorderLayout());
        frame.add(b1, BorderLayout.NORTH);
        frame.add(b2, BorderLayout.SOUTH);
        frame.add(b3, BorderLayout.EAST);
        frame.add(b4, BorderLayout.WEST);
        frame.add(new JButton("CENTER"), BorderLayout.CENTER);
        frame.setSize(300, 300);     
        frame.setVisible(true);   
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }
    public static void main(String argvs[]) {     
        new Question9Border();     
    }
}
