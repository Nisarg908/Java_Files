import javax.swing.JFrame; 
import java.awt.event.WindowEvent; 
import java.awt.event.WindowListener; 

class WindowHandeling extends JFrame implements WindowListener{ 
    //constructor
    public WindowHandeling(){ 
        this.setTitle("Question1");
        this.setSize(500, 500); 
        this.setVisible(true); 
        this.addWindowListener(this); 
    }
    // overriding windowOpened() method of WindowListener interface which prints the given string when window is first opened
    public void windowOpened(WindowEvent e) { 
        System.out.println("Frame Opened");
    }
    // overriding windowActivated() method of WindowListener interface which prints the given string when window is set to be active 
    @Override
    public void windowActivated(WindowEvent e) { 
        System.out.println("Frame Activated");   
    } 
    // overriding windowIconified() method of WindowListener interface which prints the given string when window is modified from normal to minimized state
    public void windowIconified(WindowEvent e) {  
        System.out.println("Frame minimized");
    }
    // overriding windowDeiconified() method of WindowListener interface which prints the given string when window is modified from minimized to normal state
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Frame Normalized");
    }
    // overriding windowDeactivated() method of WindowListener interface which prints the given string when window is not active
    public void windowDeactivated(WindowEvent e) { 
        System.out.println("Frame Deactivated");
    } 
    // overriding windowClosing() method of WindowListener interface which prints the given string when we attempt to close window from system menu
    public void windowClosing(WindowEvent e) {  
        //Closing Window or Frame
        System.out.println("Closing frame"); 
        dispose();                              // closes the AWT Window or Frame //Object cleanup
    }
    // overriding windowClosed() method of WindowListener interface which prints the given string when window is closed
    public void windowClosed(WindowEvent e) {  
        //Called when window is closed
        System.out.println("Closed frame"); 
        System.exit(0);                  //Exit program Window is closed
    }
} 

public class Question1{ 
    public static void main(String[] args) { 
        WindowHandeling jfd = new WindowHandeling(); 
    } 
}