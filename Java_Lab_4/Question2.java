import java.awt.*;  
import java.awt.event.*;  

/*In the Java programming language,
the adapter class in Java is the default implementation of listener interfaces 
in Java provided via adapter classes.
If you inherit the adapter class, 
you will not be required to implement all of the listener interface functions. 
As a result, it saves code. */
class MouseListenerExample extends Frame implements MouseListener{  
    Label l; 
    MouseListenerExample(){  
        super("Question2");
        
        l=new Label("Move your Mouse winthin the window.");
        l.setBounds(50,240,400,20);
        this.add(l);
        
        setSize(500,500);  
        setLayout(null);  
        setVisible(true);  
        addMouseListener(this); 
        // adding WindowListener to the Frame  
        // and using the windowClosing() method of WindowAdapter class  
        //annonymous inner class Here WindowAdapter
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
            public void windowClosed(WindowEvent e) {
                System.exit(0);
            }
        });
        // WindowAdapter wa = new WindowAdapter() {    
        //     public void windowClosing (WindowEvent e) {    
        //         dispose();    
        //     }   
        // };
        // addWindowListener(wa);  
    }  
    public void mouseClicked(MouseEvent e) {  
        //l.setText("Mouse CLICKED at point:"+ MouseInfo.getPointerInfo ().getLocation () + "mouse clicked :" + e.getClickCount());  
        this.setBackground(Color.GREEN);
    }  
    public void mouseEntered(MouseEvent e) { 
        this.setBackground(Color.BLUE); 
        //l.setText("Mouse ENTERED at point:"+ MouseInfo.getPointerInfo ().getLocation ());  
    }  
    public void mouseExited(MouseEvent e) {
        this.setBackground(Color.RED);  
        //l.setText("Mouse EXITED through point:"+ MouseInfo.getPointerInfo ().getLocation ());  
    }  
    public void mousePressed(MouseEvent e) {  
        this.setBackground(Color.YELLOW);
        //l.setText("Mouse PRESSED at point:"+ MouseInfo.getPointerInfo ().getLocation ()); 
    }  
    public void mouseReleased(MouseEvent e) {  
        this.setBackground(Color.BLACK);
        //l.setText("Mouse RELEASED at point:"+ MouseInfo.getPointerInfo ().getLocation ());  
    }  
} 

public class Question2{
    public static void main(String[] args) {  
        new MouseListenerExample();  
    }  
}