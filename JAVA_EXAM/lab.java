/*Write a program to create a GUI for accepting the data of a student like RollNo, Name and 
Branch like CSE, ICT, ECE. Perform write operation of the entered data in to different files
(CSE.txt, ICT.txt, ECE.txt) as per the branch entered by the user. Ex- if Branch entered is CSE 
then data will be written in to “CSE.txt”. (Odd Roll No). After each successful write 
operation display “Record saved Sucessfully” using dialog box.*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class lab implements ActionListener {

    JButton enter;
    JTextField text1,text2,text3;
    JFrame f;

    public void initGUI(){
        f = new JFrame();
        Container c = f.getContentPane();
        f.setLayout(new FlowLayout());
        JLabel l1 = new JLabel("Roll No");
        JLabel l2 = new JLabel("Name");
        JLabel l3 = new JLabel("Branch");
        text1 = new JTextField(10);        
        text2 = new JTextField(10);        
        text3 = new JTextField(10);  
        enter = new JButton("Enter"); 
        
        c.add(l1);
        c.add(text1);
        c.add(l2);
        c.add(text2);
        c.add(l3);
        c.add(text3);
        c.add(enter);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(190,200);
        f.setVisible(true);

        enter.addActionListener(this);
    }

    public lab(){
        initGUI();
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == enter){
            try {
                
                    JOptionPane.showMessageDialog(f, "Record saved successfully!");
                    PrintWriter outputStream = new PrintWriter(new FileOutputStream(text3.getText(), true));
                    outputStream.println("Name:" + text2.getText() +","+"RollNo:"+text1.getText()+","+"Branch:"+text3.getText());
                    outputStream.close();
                    text1.setText("");
                    text2.setText("");
                    text3.setText("");
                
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String args[]){
        new lab();
    }

}
