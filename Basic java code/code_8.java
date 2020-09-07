/* Write a Java Program to accept 10 numbers in an array and compute the square of each number. Print the sum of these numbers.*/


import java.util.*;
class Square
{
	public static void main(String args[])
	{
	Scanner in=new Scanner(System.in);
	{
		System.out.println("number of elements");
		int a=in.nextInt();
		System.out.println("Enter the Values");
		int [] arr = new int[a];
		for(int i=0;i<a;i++)
		{
			arr[i]=in.nextInt();
		int Square = arr[i]*arr[i];
		System.out.println(“Square:”+Square);
		}
	
	}
	}
}
