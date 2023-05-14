import java.util.*;

import java.io.*;
class ResidencyManagement implements Serializable
{
   private String name;
   private int bno;
   private long price;
   
    public ResidencyManagement(String name,int bno,long price)
    {
        this.name=name;
        this.bno=bno;
        this.price=price;
    }
    
    public String toString()
    {
        return  this.name+" "+this.bno +" "+this.price;
    }
    void setName(String name)
    {
        this.name=name;
    }
    void setbno(int bno)
    {
        this.bno=bno;
    }
    void setprice(int price)
    {
        this.price=price;
    }
    String getName()
    {
        return name;
    }
    int getblock()
    {
        return bno;
    }
    long getprice()
    {
        return price;
    }
}

public class fourth {
    public static void main(String[] args)throws Exception{
        FileInputStream fi=new FileInputStream("reobj.dat");
        ObjectInputStream obj=new ObjectInputStream(fi);
        TreeSet<Long>set=new TreeSet<Long>();
        ResidencyManagement b1=(ResidencyManagement)obj.readObject();
       
        try
        {
            
            while(b1!=null)
            {
                set.add(b1.getprice());
                b1=(ResidencyManagement)obj.readObject();
            }
        }catch(Exception e){}
        obj.close();
        TreeSet <Long> set1 = new TreeSet<Long>();
        set1 = (TreeSet <Long>) set.subSet(300000l,400000l);

        
        //Opening fie in read mode again.
        obj = new ObjectInputStream(new FileInputStream("reobj.dat"));

        b1 = (ResidencyManagement) obj.readObject();
        ResidencyManagement arr[] = new ResidencyManagement [set1.size()]; 
        int i = 0;
        try{
			while(b1 != null){
                if(set.first()==b1.getprice()){
                    System.out.println("\nFlat with Lowest Price:");
                    System.out.println(b1);
                }
                if(set.last()==b1.getprice()){
                    System.out.println("\nFlat with Highest Price:");
                    System.out.println(b1);
                }
                for(float j : set1){
                    if (j == b1.getprice()){
                        arr[i] = b1;
                        i++;
                    }
                }
                b1 = (ResidencyManagement) obj.readObject();
            }
		}catch(Exception e){}
            System.out.println("\nFlats with Price b/w 300000 to 400000:");
            for(int k=0; k<i; k++){
                System.out.println(arr[k]);
                System.out.println();
            }
    }
}