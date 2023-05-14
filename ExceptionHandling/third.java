import java.util.Scanner;
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


public class third {
    public static void main(String[] args)throws IOException{
        Scanner sc=new Scanner(System.in);
        File n1=new File("reobj.dat");
        FileOutputStream fo=new FileOutputStream("reobj.dat");
        ObjectOutputStream obj=new ObjectOutputStream(fo);
        ResidencyManagement a1=new ResidencyManagement("tej", 25, 400000l);
        ResidencyManagement a2=new ResidencyManagement("jet", 24,456000l );
        ResidencyManagement a3=new ResidencyManagement("tj", 26, 500000l);
        ResidencyManagement a4=new ResidencyManagement("ms",6,8000l);
        ResidencyManagement a5=new ResidencyManagement("jtt",7,9000l);
       
        obj.writeObject( a1);
        obj.writeObject(a2);
        obj.writeObject(a3);
        obj.writeObject(a4);
        obj.writeObject(a5);
        obj.close();
        

        
    }
    
}