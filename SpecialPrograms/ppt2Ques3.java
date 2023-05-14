import java.util.Scanner;

public class ppt2Ques3 {
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
        int arr[] = new int[n+m];
        for(int i=0;i<n;i++){
            arr[i] = arr1[i];
        }
        for(int i=n;i<m+n;i++){
            arr[i] = arr2[i-n];
        }
        for(int i=0;i<n+m;i++){
            for(int j=0;j<n+m-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int k = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = k;
                }
            }
        }
        for(int i=0;i<m+n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("Median: ");
        if((m+n)%2 == 0){
            System.out.println((arr[(m+n)/2]+arr[(m+n)/2-1])/2f);
        }
        else{
            System.out.println(arr[(m+n)/2]);
        }
    }
}
