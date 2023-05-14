import java.util.Scanner;

class Stack{
    int top = -1;
    char arr[];
    Stack(int r){
        arr = new char[r];
    }
    public void push(char c){
        arr[++top] = c;
    }
    public char pop(){
        return arr[top--];
    }
}

public class ppt2Ques1Class {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        while(true){
            System.out.print("Enter the String: ");
            String str = sc.nextLine();
            if(str.length()<1 || str.length()>10000){
                System.out.println("Enter the String whose length is in range(1 to 10000)");
                continue;
            }
            int counter=0;
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)=='(' || str.charAt(i)==')' || str.charAt(i)=='{' || str.charAt(i)=='}' || str.charAt(i)=='[' || str.charAt(i)==']'){
                    counter++;
                }
                else{
                    System.out.println("\nInvalid string character input. Only parentheses allowed-(){}[] \n");
                    break;
                }
            }
            if(counter!=str.length()){
                
                continue;
            }


            Stack s = new Stack(str.length());
            counter = 0;
            for(int i = 0; i<str.length(); i++){
                char c = str.charAt(i);
                if (c == '(' || c == '[' || c == '{') {
                    s.push(c);
                    continue;
                }
                if(i==0){
                    break;
                }
                char openbrac = s.pop();
                switch (c) {
                    case ')':
                        if (openbrac == '(')
                            counter++;
                        else{
                            System.out.println("Invalid String.");
                            return;
                        }
                        break;
        
                    case '}':
                        if (openbrac == '{')
                            counter++;
                        else{
                            System.out.println("Invalid String.");
                            return;
                        }
                        break;
        
                    case ']':
                        if (openbrac == '[')
                            counter++;
                        else{
                            System.out.println("Invalid String.");
                            return;
                        }
                        break;
                }
            }
            if(str.length()/2f == counter){
                System.out.println("Valid String.");
            }
            else{
                System.out.println("Invalid String.");
            }
            break;
        }
    }
}