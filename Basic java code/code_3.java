/*Write a program to print Fibonacci series using loop*/

class Fibonacci
{
	public static void main(String args[])
	{
		int n1=1,n2=2,i,n3;
		System.out.println(n1+" "+n2);
		for(i=2;i<=10;i++)
		{
			n3=n1+n2;
				System.out.println(n3);
			n1=n2;
			n2=n3;
		}
	}
}
