/* Write a program to find the largest of 3 numbers. */


import java.util.*;
class Max
{
	public static void main(String args[])
	{
		int a,b,c;
		Scanner in=new Scanner(System.in);
		{
			System.out.println("Enter value 1");
			a=in.nextInt();
			System.out.println("Enter value 2");
			b=in.nextInt();
			System.out.println("Enter value 3");
			c=in.nextInt();
			System.out.println("Entered values" +a+" "+b+" "+c);
			System.out.println("Max number:");
		}
	if(a > b && a > c)
		{
			System.out.println(a);
		}
	else if(b > a && b > c)
		{
			System.out.println(b);
		}
	else if(c > a && c > b)
		{
			System.out.println(c);
		}
	else
		{
			System.out.println("code fail");
		}
	}
}
