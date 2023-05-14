import javax.swing.*;

//Swing is a GUI widget toolkit for Java.
class newwindow extends JFrame{

    newwindow(String title){

        super();
        // to call super class constructor
        this.setTitle(title);
        //setTitle will give title to the window
        this.setVisible(true);
        //The setVisible(true) method makes the frame appear on the screen.
        // If you forget to do this, the frame object will exist as an object in memory,
        // but no picture will appear on the screen.
        this.setSize(500, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //The default behaviour is to hide the JFrame when the user closes the window.
    }
}
public class Question4{
    public static void main(String args[]){
        newwindow window = new newwindow("New Window");
    }
}