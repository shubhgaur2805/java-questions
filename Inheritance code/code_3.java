/*	Write a class Worker and derive classes DailyWorker and SalariedWorker from it. Every worker has a name and a salary rate. Write method ComPay (int hours) to compute the week pay of every worker. A Daily Worker is paid on the basis of the number of days he/she works. The Salaried Worker gets paid the wage for 40 hours a week no matter what the actual hours are. Test this program to calculate the pay of workers. You are expected to use the concept of polymorphism to write this program.
*/
import java.util.*;
class Worker
{
	void details()
	{
		//Scanner in=new Scanner(System.in);
		System.out.println("Name of worker");
	}
} 
class Dailyworker extends Worker
{
	void days()
	{
	Scanner in=new Scanner(System.in);
	System.out.println("Number of working days");
	int a=in.nextInt();
	int com_pay=a*50;
	System.out.println("Dailyworker pay" +com_pay);
	}
}
class Salaryworker extends Worker
{
	void hour()
	{
	Scanner in=new Scanner(System.in);
	System.out.println("Number of hours");
	int b=in.nextInt();
	int com_pay=40*30;
	System.out.println("Salaryworker pay" +com_pay);
	}
} 
class Test1
{
	public static void main(String args[])
	{
		Worker in=new Worker();
		Dailyworker d=new Dailyworker();
		Salaryworker s=new Salaryworker();
		in.details();
		d.days();
		s.hour();
	}
}
