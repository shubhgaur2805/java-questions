/* 	Write a program for generating 2 threads, one for printing even numbers and the other for printing odd numbers. */


class MyThread1 extends Thread
{
	public void run()
	{
		for(int i=0;i<20;i++)
		{
			if(i%2==0)
			{
			System.out.println("EVEN on the way" +i);
			}
		}
	}
}
class MyThread2 extends Thread
{
	public void run()
	{
		for(int i=0;i<20;i++)
		{
			if(i%2!=0)
			{
			System.out.println("ODD on the way" +i);
			}
		}
	}
}
class Threadresult1 
{
	public static void main(String args[])
	{
	MyThread1 in=new MyThread1();
	in.start();
	MyThread2 r2=new MyThread2();
	r2.start();
	}
}
 