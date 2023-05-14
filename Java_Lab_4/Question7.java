import java.awt.*;
import java.awt.event.*;

class Student extends Frame 
{
    Label l1;
    Label l2;
    Label l3;
    Label l4;
    Label l5;
    Label l6;

    Student() {
        super(" Student Details");

        l1 = new Label("Name: Nisarg Patel");
        l2 = new Label("Roll No: 21BCP191");
        l3 = new Label(" Division 3 , Group 6");
        l4 = new Label("Marks in DMS: 99");
        l5 = new Label("Marks in DSA: 98");
        l6 = new Label("Marks in JAVA: 85");

        l1.setBounds(25, 50, 300, 70);
        l2.setBounds(25, 100, 300, 70);
        l3.setBounds(25, 150, 300, 70);
        l4.setBounds(25, 200, 300, 70);
        l5.setBounds(25, 250, 300, 70);
        l6.setBounds(25, 300, 300, 70);

        this.add(l1);
        this.add(l2);
        this.add(l3);
        this.add(l4);
        this.add(l5);
        this.add(l6);

        this.setBackground(Color.CYAN);
        this.setSize(500, 500);
        this.setLayout(null);
        this.setVisible(true);

        this.addWindowListener(new WindowAdapter() 
        {
            public void windowClosing(WindowEvent e) 
            {
                dispose();
            }
        });
    }
}

public class Question7 {
    public static void main(String[] args) {
        new Student();
    }
}
