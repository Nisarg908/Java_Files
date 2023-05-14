import java.awt.*;    
import javax.swing.*;    
    
public class Question10Grid{    
    JFrame frame;    
    // constructor  
    Question10Grid(){    
        frame = new JFrame();    
        
        // creating 9 buttons  
        JButton btn1 = new JButton("1");    
        JButton btn2 = new JButton("2");    
        JButton btn3 = new JButton("3");    
        JButton btn4 = new JButton("4");    
        JButton btn5 = new JButton("5");    
        JButton btn6 = new JButton("6");    
        JButton btn7 = new JButton("7");    
        JButton btn8 = new JButton("8");    
        JButton btn9 = new JButton("9");    
    
        // adding buttons to the frame  
        // since, we are using the parameterless constructor, therefore;   
        // the number of columns is equal to the number of buttons we   
        // are adding to the frame. The row count remains one.  
        frame.add(btn1); frame.add(btn2); frame.add(btn3);  
        frame.add(btn4); frame.add(btn5); frame.add(btn6);  
        frame.add(btn7); frame.add(btn8); frame.add(btn9);    
        // setting the grid layout   
        // a 3 * 3 grid is created with the horizontal gap 20   
        // and vertical gap 25  
        frame.setLayout(new GridLayout(3, 3, 20, 25));    
        frame.setSize(300, 300);    
        frame.setVisible(true);    
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }  
    // main method  
    public static void main(String argvs[]){    
        new Question10Grid();    
    }    
}