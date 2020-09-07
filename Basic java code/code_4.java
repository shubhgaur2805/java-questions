/*Write a program to implement a command line calculator.*/

import java.util.*;
class Calculator
{
	public static void main(String args[])
		{
			double a,b;
			double Result;
			Scanner in=new Scanner(System.in);
				{
					System.out.println("Enter value 1");
					a=in.nextDouble();
					System.out.println("Enter Value 2");
					b=in.nextDouble();
					System.out.println("Choose Operator +,-,*,/");
					char operator =in.next().charAt(0);
					
					switch(operator)
						{
							case'+':
								Result=a+b;
								break;
							case'-':
								Result=a-b;
								break;
							case'*':
								Result=a*b;
								break;
							case'/':
								Result=a/b;
								break;
							default:
								System.out.println("Wrong choice");
								return;
						}
					System.out.println("Your Result" +Result);
				}
			
		}
}	
