class Printing{
	int i;
	boolean flag = false;	

	public synchronized void reader(){
		for(i = 1; i < 10; i++){
            try{
                if(flag) wait();
            }catch(Exception e){}
            
            if(i % 2 != 0){
                System.out.println("Reader-Reading...");
                flag = true;
                notify();
            }
		}	
	}

	public synchronized void writer() {
		for(i = 1; i < 10; i++){
			try{
			    if(!flag) wait();
			}catch(Exception e){}
			
            if(i % 2 == 0){
				System.out.println("Writer-Writing");
				flag = false;
				notify();
			}
		}
	}
}

public class Test{
	public static void main(String[] args) {
		Printing p = new Printing();
		Runnable r1 = new Runnable()
        {
			public void run(){
			    p.reader();
			}
		};

		Runnable r2 = new Runnable()
        {
			public void run(){
				p.writer();
		    }
        };
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	}
}