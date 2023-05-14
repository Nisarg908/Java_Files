class method1 extends Thread
{
   public void run()
    {   
        int i=0;
        while(i<40)
        {
        System.out.println("This method is running from "+this.getName());
        i++;
        }
        
        
    }
}
class method2 extends Thread
{
    public method2(String a)
    {
        super(a);
    }
    public void run()
    {

        int i=0;
        while(i<40)
        {
            System.out.println("This method is running from "+this.getName());
            i++;
        }
    }
}
class method3 extends Thread
{
  public method3()
  {

  }
  public void run()
  {
    int i=0;
        while(i<40)
        {
            System.out.println("This method is running from "+this.getName());
            i++;
        }
  }
}


public class Question14{
    public static void main(String[] args) {
        
        method1 n1=new method1();
        n1.setName("abc");
        n1.setDaemon(true);
        method2 n2 =new method2("pqr");
        n2.setPriority(10);
        method3 n3=new method3();
        n3.setPriority(5);
       
        n1.start();
        n2.start();
        n3.start();
    }
}
