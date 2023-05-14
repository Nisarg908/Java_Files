import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int balance = 1000;
        int choice,withdraw,deposit;
        do {
            System.out.println("Your Current Balance: " + balance);
            System.out.println("Press 1 for deposit\nPress 2 for withdraw\nPress 0 for exit");
            choice = sc.nextInt();
            if(choice==1) {
                System.out.println("Enter the amount you want to deposit: ");
                deposit = sc.nextInt();
                balance += deposit;
            }
            else if (choice==2) {
                System.out.println("Enter the amount you want to withdraw: ");
                withdraw = sc.nextInt();
                if (withdraw <= balance) {
                    balance -= withdraw;
                } else {
                    throw new MyCustomException("Insufficient Funds");
                }
            }
            else if(choice==0){
                return;
            }
            else{
                System.out.println("Please enter the correct number!!");
            }
        }
        while(choice!=0);
    }
}
class MyCustomException extends Exception {
    MyCustomException(String exc){
        super(exc);
    }
}