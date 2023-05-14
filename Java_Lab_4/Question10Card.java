import java.awt.*;    
import javax.swing.*;   
import java.awt.event.*;    
  
public class Question10Card extends JFrame implements ActionListener{    
    CardLayout card;   
    // button variables to hold the references of buttons  
    JButton btn1, btn2, btn3;    
    /*JFrames have a content pane, 
    which holds the components. 
    These components are sized and positioned by the layout manager when JFrame's pack() is called.*/
    Container cPane;   
  
    // constructor of the class  
    Question10Card(){      
        cPane = getContentPane();    
        //default constructor used  
        // therefore, components will   
        // cover the whole area  
        card = new CardLayout();    
        
        cPane.setLayout(card);   
        
        // size is 300 * 300          
        this.setSize(300, 300);    
        this.setVisible(true);    
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // creating the buttons  
        btn1 = new JButton("Eat");    
        btn2 = new JButton("Sleep");    
        btn3 = new JButton("Repeate");    
        
        // adding listeners to it  
        btn1.addActionListener(this);    
        btn2.addActionListener(this);    
        btn3.addActionListener(this);    
        
        cPane.add("a", btn1); // first card is the button btn1  
        cPane.add("b", btn2); // 2nd card is the button btn2  
        cPane.add("c", btn3);  // 3rd card is the button btn3          
    } 

    public void actionPerformed(ActionEvent e){    
        // Upon clicking the button, the next card of the container is shown  
        // after the last card, again, the first card of the container is shown upon clicking  
        //i.e. Window remains the same but container i.e. contentPane changes
        card.next(cPane);    
    }    
  
    // main method  
    public static void main(String args[]){     
        // creating an object of the class CardLayoutExample1  
        Question10Card crd = new Question10Card();    
    }    
}