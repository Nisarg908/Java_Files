import java.util.Scanner;

class MultiConstructor{
    int fact = 1;
    int product;
    MultiConstructor(int a){
        for(int i=a; i>0 ; i--){
            fact*=i;
        }
        System.out.println("The factorial of "+a+" is: "+fact);
    }
    MultiConstructor(int a ,int b){
        product = a*b;
        System.out.println("The product of "+a+" & "+b+" is: "+product);
    }
    MultiConstructor(MultiConstructor m,MultiConstructor n){
        this.fact = m.fact;
        this.product = n.product;
    }
    public int compare(MultiConstructor m){
        if(m.fact>m.product){
            return 1;
        }
        return 0;
    } 
}
public class Fourth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find factorial: ");
        int n = sc.nextInt();
        System.out.println("Enter the 2 numbers to find product: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        MultiConstructor m1 = new MultiConstructor(n);
        MultiConstructor m2 = new MultiConstructor(a, b);
        MultiConstructor m3 = new MultiConstructor(m1,m2);
        if(m3.compare(m3) == 1){
            System.out.println("Max of fact and product is fact: "+m3.fact);
        }
        else{
            System.out.println("Max of fact and product is product: "+m3.product);
        }

    }
}
