
/*	Write a program to accept three digits (i.e. 0 - 9) and print all its possible combinations.  
(For example if the three digits are 1, 2, 3 than all possible combinations are : 123, 132, 
213, 231, 312, 321.)*/

import java.util.*;
class Combination
{
	public static void main(String args[])
	{
		System.out.println("Enter value betwwen 0-9");
		Scanner in=new Scanner(System.in);
		{
			System.out.println("Enter value 1");
			int a=in.nextInt();
			System.out.println("Enter value 2");
			int b=in.nextInt();
			System.out.println("Enter value 3");
			int c=in.nextInt();
			System.out.println(a+""+b+""+c);
			System.out.println(b+""+a+""+c);
			System.out.println(b+""+c+""+a);
			System.out.println(b+""+a+""+c);
			System.out.println(a+""+c+""+b);
			System.out.println(c+""+b+""+a);
			System.out.println(a+""+c+""+b);
			
		}
	}
}
