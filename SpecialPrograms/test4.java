import java.lang.Math;
import java.util.Scanner;  //variable length argument in c->printf and scanf.
public class test4 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int len;
        while(true)
        {
        System.out.println("ENTER THE LENGTH");
        len=sc.nextInt();
        if(len>=1 && len<=5*Math.pow(10, 5))
        {
          break;
        }
        else{
          System.out.println("ENTER VALID LENGTH");
          continue;
        }
        }

        int arr[]=new int[len];int i=0;int j=0;int temp=0;int c=0;
        while(true)
        {
        for(i=0;i<len;i++)
        {
         arr[i]=sc.nextInt();  
         if(arr[i]<Math.pow(-2, 31) && arr[i]>Math.pow(2,31)-1)    
         {
           System.out.println("ENTER VALID ARGUMENT");
           i=i-1;
           continue;
         } 
         else
         {
           c=c+1;
         }
        }
        if(c==len)
        {
          c=0;
          break;
        }
      }
      for(i=1;i<=arr.length+1;i++)
        {
            c=0;
           for(j=0;j<len;j++)
           {
            if(i==arr[j])
            {
              c=1;
            }
           }
        
        if(c!=1)
        {
            System.out.println("THE SMALLEST POSITIVE INTEGER MISSING IS:"+i);
             break;
      }
    }
    if(c==1)
    {
      System.out.println("THE SMALLEST POSITIVE INTEGER IS"+arr.length+1);
    }
 }
}