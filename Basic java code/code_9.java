/*	Write a program to input a number of a month (1 - 12) and print its equivalent name of 
the month.( e.g 1 to Jan, 2 to Feb. 12 to Dec.)
*/
import java.util.*;
class Month
{
	public static void main(String args[])
	{
	System.out.println("Enter value between 1-12");
	Scanner in=new Scanner(System.in);
	{
		int a=in.nextInt();
		if(a==1)
		{
			System.out.println("January");
		}
		else if(a==2)
		{
			System.out.println("Feburay");
		}
		else if(a==3)
		{
			System.out.println("March");
		}
		else if(a==4)
		{
			System.out.println("April");
		}
		else if(a==5)
		{
			System.out.println("May");
		}
		else if(a==6)
		{
			System.out.println("june");
		}
		else if(a==7)
		{
			System.out.println("July");
		}
		else if(a==8)
		{
			System.out.println("August");
		}
		else if(a==9)
		{
			System.out.println("September");
		}
		else if(a==10)
		{
			System.out.println("October");
		}
		else if(a==11)
		{
			System.out.println("November");
		}
		else if(a==12)
		{
			System.out.println("December");
		}
		else 
		{
			System.out.println("Worng choice mothers are 12 only");
		}
		}
	}
}
