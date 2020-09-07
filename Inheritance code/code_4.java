/*	Consider the trunk calls of a telephone exchange. A trunk call can be ordinary, urgent or lightning. The charges depend on the duration and the type of the call. Write a program using the concept of polymorphism in Java to calculate the charges.
*/

import java.util.*;
class Call
{
	void details()
	{
		//Scanner in=new Scanner(System.in);
		System.out.println("Call and type");
	}
} 
class Ordinary extends Call
{
	void days()
	{
	Scanner in=new Scanner(System.in);
	System.out.println("Calling mintues");
	int a=in.nextInt();
	int com_pay=a*1;
	System.out.println("Ordinary Call pay" +com_pay);
	}
}
class Urgent extends Call
{
	void hour()
	{
	Scanner in=new Scanner(System.in);
	System.out.println("Caliing mintues");
	int b=in.nextInt();
	int com_pay=b*2;
	System.out.println("Urgent calling pay" +com_pay);
	}
} 

class Test2
{
	public static void main(String args[])
	{
		Call in=new Call();
		Ordinary d=new Ordinary();
		Urgent s=new Urgent();
		in.details();
		d.days();
		s.hour();
	}
}
