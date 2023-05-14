import java.io.*;
class method1 extends Thread{
   public void run()
    {   
        int i=0;
        while(i<20)
        {
            System.out.println("This method is running from "+this.getName());
            i++;
        }
    }
}
class method2 extends Thread{
    public method2(String a)
    {
        super(a);
    }

    public void run()
    {
        int i=0;
        while(i<20)
        {
            System.out.println("This method is running from "+this.getName());
            i++;
        }
    }
}


public class Question12 {
    public static void main(String[] args)throws IOException  {   
        method1 n1=new method1();
        n1.setName("abc");
        n1.setDaemon(true);

        method2 n2 =new method2("pqr");//constructor which takes string and sets name
        n2.setPriority(10);
        
        System.out.println("The active no. of threads running are "+Thread.activeCount());//counts the active no.of threads
        
        n1.start();//starts the thread
        n2.start();
        System.out.println("Is the thread alive "+n2.isAlive());//checks whether the thread is alive or not
        System.out.println("The name of the thread currently running is "+Thread.currentThread());//returns the current thread running
        System.out.println("Is the thread n1 interupted? "+n1.isInterrupted());
        System.out.println("The priority of the tread n1 is "+n1.getPriority());//returns the priority of a thread
        System.out.println("The priority of the tread is "+n2.getPriority());
        System.out.println("Is thread n2 Daemon? "+n2.isDaemon());//checks whether the priority of a thread is 1 or not
        System.out.println("The name of thread currently running is "+Thread.currentThread().getName());
        System.out.println("The name of thread n1 is"+n1.getName());//returns the name of the thread
        System.out.println("The current threads running are:");
        Thread[] array=new Thread[3];
        Thread.enumerate(array);
        for(Thread i:array)
        {
            System.out.println(i);
        }
        System.out.println("DEFAULT EXCEPTION HANDLER of any thread is "+Thread.getDefaultUncaughtExceptionHandler());
        n2.setUncaughtExceptionHandler(Thread.getDefaultUncaughtExceptionHandler());
    }

}
