import java.util.Scanner;

public class test3 {
    static void fillarray(int[] arr){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
            if(i!=0 && arr[i]<arr[i-1]){
                System.out.println("\nEntered element is greater than it's preceding element. Please enter in correct order.");
                System.out.println("\nEnter the sored array in assending order: ");
                i=-1;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array-1: ");
        int n = sc.nextInt();
        System.out.println("Enter the array-1 in assending order: ");
        int arr1[] = new int[n];
        fillarray(arr1);
        System.out.print("Enter the size of array-2: ");
        int m = sc.nextInt();
        System.out.println("Enter the array-2 in assending order: ");
        int arr2[] = new int[m];
        fillarray(arr2);
        int k = (m+n)/2;
        if(n>=m){
            for()
        }
    }
}