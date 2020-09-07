/*Write a program to add two number using command line arguments.*/

Code:-
import java.util.*;
class Add
{
	public static void main(String args[])
		{
			int a,b;
			Scanner in=new Scanner(System.in);
				{
					System.out.println("Enter value 1");
					a=in.nextInt();
					System.out.println("Enter Value 2");
					b=in.nextInt();
				}
			int add =a+b;
			System.out.println("Total sum :" +add);
		}
}	
