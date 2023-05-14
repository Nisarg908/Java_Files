import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Scanner;
public class ppt2Ques1 {
 
    static boolean areBracketsBalanced(String brack)
    {
        Deque<Character> stack
            = new ArrayDeque<Character>();
 
        for (int i = 0; i < brack.length(); i++) {
            char x = brack.charAt(i);
 
            if (x == '(' || x == '[' || x == '{') {
                stack.push(x);
                continue;
            }
 
            if (stack.isEmpty())
                return false;
            char check;
            switch (x) {
            case ')':
                check = stack.pop();
                if (check == '{' || check == '[')
                    return false;
                break;
 
            case '}':
                check = stack.pop();
                if (check == '(' || check == '[')
                    return false;
                break;
 
            case ']':
                check = stack.pop();
                if (check == '(' || check == '{')
                    return false;
                break;
            }
        }
 
        return (stack.isEmpty());
    }
 
    
    public static void main(String[] args)
    {
        System.out.println("Enter brackets: ");
        Scanner sc = new Scanner(System.in);   
        String brack = sc.nextLine(); 
 
        if (areBracketsBalanced(brack)){
            System.out.println("Balanced ");
        }
        else{
            System.out.println("Not Balanced ");
        }
    }
}