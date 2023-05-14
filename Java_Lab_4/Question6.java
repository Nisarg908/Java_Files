import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

class Menu extends JFrame implements ActionListener
{
    Menu(){
        Frame f = new JFrame("Statistics");
       
        JMenuBar mb = new JMenuBar();
        JMenu fileMenu = new JMenu("Tools");
        JMenu fileMenu2 = new JMenu("Edit");
        JMenu fileMenu3 = new JMenu("Help");
        JMenu submenu= new JMenu("Extra tools"); 
        JMenu submenu2= new JMenu("Debugger"); 
        JMenu submenu3= new JMenu("F1 for Help"); 
        
        JMenuItem i1 = new JMenuItem("R");
        JMenuItem i2 = new JMenuItem("MATLAB");
        JMenuItem i3 = new JMenuItem("JAVA");
        JMenuItem i4 = new JMenuItem("GITHUB");
        JMenuItem i5 = new JMenuItem("GIT");
        JMenuItem i6 = new JMenuItem("STATA");

        mb.add(fileMenu);
        fileMenu.add(i1);
        fileMenu.add(i2);
        fileMenu.add(i3);
        fileMenu.add(submenu); 
        submenu.add(i4);
        submenu.add(i5);
        submenu.add(i6);
        mb.add(fileMenu2);
        fileMenu2.add(submenu2);
        mb.add(fileMenu3);
        fileMenu3.add(submenu3);
        this.setJMenuBar(mb);

        this.setTitle("Statistics");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500,500);    
        this.setLayout(new FlowLayout());
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new Menu();
    }
}
public class Question6 {
    public static void main (String[] args) {
        new Menu();
    }
}