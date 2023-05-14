import java.util.Scanner;
//Two sum
public class ppt1Ques1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Enter the size of the array: ");
            int n = sc.nextInt();
            if(n<2 || n>Math.pow(10,4)){
                System.out.println("Enter the length in range 2 to 10,000.");
                continue;
            }
            long num[] = new long[n];
            System.out.println("Enter the array elements below:");
            for(int i=0;i<n;i++){
                System.out.print((i+1)+"->");
                num[i] = sc.nextLong();
                if(num[i]<Math.pow(-2,31) || num[i]>(Math.pow(2,32)-1)){
                    System.out.println("Enter the value of number in between range -2^31 to 2^31-1");
                    i=i-1;
                    continue;
                }
            }
            System.out.print("Input:\t");
            System.out.print("num = [");
            for(int i=0;i<n;i++){
                System.out.print(num[i]);
                if(i != n-1){
                    System.out.print(",");
                }
            }
            System.out.print("]");
            System.out.print("\t");
            System.out.print("target = ");
            long target =sc.nextLong();
            if(target<Math.pow(-2,31) || target>(Math.pow(2,32)-1)){
                System.out.println("\nEnter the value of target sum in between range -2^31 to 2^31-1\n");
                continue;
            }
            int counter =0;
            
            for(int j=0;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(num[k]+num[j] == target){
                        System.out.print("[");
                        System.out.print(j+","+k);
                        System.out.print("]");
                        counter+=1;
                        break;
                    }
                }
                if (counter == 1){
                    break;
                }
            }
            if(counter ==0){
                System.out.println("\nThe target sum is not found with the pairs provided in array.");
            }
            break;
        }
    }
}