/*	Write a program to launch 10 threads. Each thread increments a counter variable. Run the program with synchronization. 
*/


class Counter 
{
	static int count = 0;
	
	public synchronized void increment() {
	        count++;
	        System.out.println("Count - " + Counter.count);
	    }
	}
	
class CountThread extends Thread {
	    Counter counter = new Counter();
	
	    public void run() {
	        counter.increment();
	    }
	}
	
public class Myclass1 {
	    public static void main(String[] args) throws Exception {
	        CountThread t1 = new CountThread();
	        CountThread t2 = new CountThread();
	        CountThread t3 = new CountThread();
	        CountThread t4 = new CountThread();
       	    CountThread t5 = new CountThread();
            CountThread t6 = new CountThread();
	        CountThread t7 = new CountThread();
	        CountThread t8 = new CountThread();
	        CountThread t9 = new CountThread();
	        CountThread t10 = new CountThread();
	        t1.start();
	        t1.join();
	        t2.start();
	        t2.join();
	        t3.start();
	        t3.join();
	        t4.start();
	        t4.join();
	        t5.start();
	        t5.join();
	        t6.start();
	        t6.join();
	        t7.start();
	        t7.join();
	        t8.start();
	        t8.join();
	        t9.start();
	        t9.join();
	        t10.start();
	        t10.join();
	        System.out.println("Count - " + Counter.count);
	    }
}

 