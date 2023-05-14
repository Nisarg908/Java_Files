//WAP to implement the BoxLayout. 
//The Java BoxLayout class is used to arrange the components either vertically or horizontally.
import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;

public class Question11Box{
    public static void main(String[] args) {
        // Creating Object of "JFrame" class
        JFrame frame = new JFrame("BoxLayout Example Y_AXIS");
        frame.setSize(500, 500);
		
        // Set the panel to add buttons
        JPanel panel = new JPanel();
        
        // Creating Object of "boxlayout" in Y_Axis from top to down
        // to set the box layout
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        //To set The new location of panel at the top-left corner is specified by x and y
        panel.setBorder(new EmptyBorder(100, 150, 100, 150));

        // Declaration of objects of JButton class.
        JButton jbtn1, jbtn2, jbtn3, jbtn4, jbtn5;

        // Initialization of object "jb1" of JButton class.
        jbtn1 = new JButton("Button 1");
        // Initialization of object "jb2" of JButton class.
        jbtn2 = new JButton("Button 2");
        // Initialization of object "jb3" of JButton class.
        jbtn3 = new JButton("Button 3");
        // Initialization of object "jb4" of JButton class.
        jbtn4 = new JButton("Button 4");
        // Initialization of object "jb5" of JButton class.
        jbtn5 = new JButton("Button 5");

        // Adding JButton "jb1" on JFrame
        panel.add(jbtn1);
        // Adding JButton "jb2" on JFrame
        panel.add(jbtn2);
        // Adding JButton "jb3" on JFrame
        panel.add(jbtn3);
        // Adding JButton "jb4" on JFrame
        panel.add(jbtn4);
        // Adding JButton "jb5" on JFrame
        panel.add(jbtn5);
        
        // Function to set the panel  of JFrame.
        frame.add(panel);

        // Function to set visible status of JFrame.
        frame.setVisible(true);

        // Function to use the  pack of JFrame.
        frame.pack();

        // Function to set the default close operation of JFrame the.
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }
}