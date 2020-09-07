/*	Write a program to implement the concept of threading by extending Thread Class and Runnable interface.
*/

class MyThread1 extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Thread 1 is on the way" +i);
		}
	}
}
class MyThread2 implements Runnable
{
	public void run()
	{
		for(int i=11;i<20;i++)
		{
			System.out.println("Thread 2 is on the way" +i);
		}
	}
}
class Threadresult 
{
	public static void main(String args[])
	{
	MyThread1 in=new MyThread1();
	in.start();
	MyThread2 r2=new MyThread2();
	//r2.start();
	Thread r3=new Thread(r2);
r3.start();	
	}
}