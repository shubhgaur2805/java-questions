/*
	Write a java program to throw an exception  for an employee details. 
•	If an employee name is a number, a name exception must be thrown.
•	If an employee age is greater than 50, an age exception must be thrown. 
•	Or else an object must be created for the entered employee details
*/

import java.util.*;
import java.io.*;
class Emp
{
	void details()
	{
		System.out.println("Enter the Employee Details");
		Scanner in=new Scanner(System.in);
		{
			try
			{
				System.out.println("Enter the name");
				String name=in.nextLine();
				if(!(in.nextLine().matches("[a-zA-Z]+")))
				{throw new IOException();}
				System.out.println("Enter Age");
				int age=in.nextInt();
				System.out.println("Age:" +age);
				if(age>50)
				{
					System.out.println("Retairment age is 50 more than not allowed Exception"); throw new Exception();
				}
				else
				{
					System.out.println("Details is ok");
				}
			}
			catch(Exception e)
			{
				System.out.println("Exception"+e);
			}
		}
	}
}
class Empy
{
	public static void main(String args[])
	{
		Emp in=new Emp();
		in.details();
	}
}
 
