import java.util.Scanner;

public class pract15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and colums of the matrix-1");
        System.out.print("Rows: ");
        int rows = sc.nextInt();
        System.out.print("Column: ");
        int columns = sc.nextInt();
        int arr1[][] = new int[rows][columns];
        System.out.println("Enter the elements of matrix-1:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix-2:");
        System.out.println("Rows: "+columns);
        System.out.print("Columns: ");
        int rows2 = sc.nextInt();
        int arr2[][] = new int[columns][rows2];
        System.out.println("Enter the elements of matrix-2:");
        for(int i=0;i<columns;i++){
            for(int j=0;j<rows2;j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        int sum[][] = new int[rows][rows2];
        for(int i=0;i<rows;i++){
            for(int j=0;j<rows2;j++){
                for(int k=0;k<columns;k++){
                    sum[i][j] += arr1[i][k]*arr2[k][j];
                }
            }
        }
        System.out.println("Multiplied matrix is: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<rows2;j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }    
}
