import java.util.Scanner;

public class ppt1Ques3 {
    static int arraytorevint(int arr[]){
        int x = 0;
        for(int i=0; i<arr.length; i++){
            x = 10*x + arr[arr.length - i - 1];
        }
        return x;
    }
    static void fillarray(int arr[],int size){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array elements below:");
            for(int i=0;i<size;i++){
                System.out.print((i+1)+"->");
                arr[i] = sc.nextInt();
                if(arr[0]==0){
                    System.out.println("\nFirst element can not be zero. Please enter again\n");
                    i=i-1;
                    continue;
                }
                if(arr[i]<0 || arr[i]>9){
                    System.out.println("Enter the value of number in between range 0 to 9");
                    i=i-1;
                    continue;
                }
            }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Enter the size of array 1: ");
            int n = sc.nextInt();
            if(n<1 || n>100){
                System.out.println("Enter the value of size of array in between range 1 to 100");
                continue;
            }
            int num[] = new int[n];
            fillarray(num,n);
            System.out.print("Enter the size of arry 2: "); 
            int n2 = sc.nextInt();
            if(n2<1 || n2>100){
                System.out.println("Enter the value of size of array in between range 1 to 100");
                continue;
            }
            int num2[] = new int[n2];
            fillarray(num2,n2);
            int i1 = arraytorevint(num);
            int i2 = arraytorevint(num2);
            int sum = i1+i2;
            int count=0;
            for(int q=sum; q!=0; q/=10){
                //int r = q%10;
                count++;
            }
            int finalsum[] = new int[count];
            int q = sum;
            int r;
            for(int i=0;i<count;i++){
                r=q%10;
                q=q/10;
                finalsum[i]=r;
            }
            System.out.println("Output:\t");
            System.out.print("[");
            for(int i=0;i<count;i++){
                System.out.print(finalsum[i]);
                if(i != count-1){
                    System.out.print(",");
                }
            }
            System.out.print("]");
            break;
        }
    }
}
