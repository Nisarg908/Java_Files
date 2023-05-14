import java.util.Scanner;
//Palindrome Number
public class ppt1Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            long r,q,num,rev_num =0 ;
            System.out.print("Enter a number: ");
            num = sc.nextLong();
            if(num<Math.pow(-2,31) || num>(Math.pow(2,32)-1)){
                System.out.println("Enter the value of number in between range -2^31 to 2^31-1\n");
                continue;
            }
            for(q=num; q>0; q/=10){
                r=q%10;
                rev_num = 10*rev_num + r;
            }
            if(rev_num == num){
                System.out.print("\nThe number is a Palindrome.");
            }
            else{
                System.out.print("\nThe number is not a Palindrome.");
            }
            break;
        }
    }
}