class method1 implements Runnable
{
   public void run()
    {   
        int i=0;
        while(i<10)
        {
        System.out.println("This method is running from "+Thread.currentThread());
        i++;
        }    
    }
}
class method2 implements Runnable
{
    String a;
    public method2(String a)
    {
        super();
    }
    public void run()
    {
        int i=0;
        while(i<10)
        {
        System.out.println("This method is running from "+Thread.currentThread());
        i++;
        }
    }
}

public class Question13 {
    public static void main(String[] args) {

        method1 a=new method1();
        method2 b=new method2("Hello");
        Thread t1=new Thread(a);
        Thread t2=new Thread(b);
        t1.start();
        t2.start();
        t1.setPriority(10);
        t1.setName("abc");

        System.out.println("Is the thread alive "+t1.isAlive());
         System.out.println(t1.toString());
         System.out.println( t2.toString());
        
        System.out.println("Is the thread alive "+t2.isAlive());
        Thread[] arr=new Thread [Thread.activeCount()];
        Thread.enumerate(arr);
        for(Thread t:arr)
        {
           
            System.out.println(t);
        }
       
        System.out.println("is this thread accessible?"+Thread.currentThread());
        System.out.println("The priority of the current thread is "+Thread.currentThread().getPriority());
        System.out.println("The state of n3 thread is "+t2.getState());
        System.out.println("The state of n3 thread is "+t1.getState());
        System.out.println("DEFAULT EXCEPTION HANDLER of any thread is "+Thread.getDefaultUncaughtExceptionHandler());
        System.out.println("The exception handler invoked when xyz stops executing is "+t2.getUncaughtExceptionHandler());
        t2.setUncaughtExceptionHandler(t1.getUncaughtExceptionHandler());
        System.out.println("Is the thread alive? "+t2.isAlive());
        System.out.println("The name of thread 2 is: "+t1.getName());
        
    }
}