/*	Design a class employee of an organization. An employee has a name, empid, and salary. Write the default constructor, a constructor with parameters (name, empid, and salary) and methods to return name and salary. Also write a method increaseSalary that raises the employee’s salary by a certain user specified percentage. Derive a subclass Manager from employee. Add an instance variable named department to the manager class. Supply a test program that uses theses classes and methods.   
*/

import java.lang.*;
import java.util.*;
import java.io.*;
class Employee
{
	String name;
	int empid;
	double salary;
	Employee(String n,int e,double s)
		{
			this.name=n;
			this.empid=e;
			this.salary=s;
			//System.out.println(String n +" "+ int e +" "+ double salary);
		};
	void details()
	{
		System.out.println(" Details" + name +" "+  empid +" "+ salary);
		
	}
		void name1()
		{
			//return name;
			System.out.println(name);
		}
		void salary1()
		{
			//return salary;
			System.out.println(salary);
		}
		void increment()
		{
			double increaseSalary;
			increaseSalary=(salary*(salary/100));
			System.out.println("Salary increment every year" +increaseSalary);
		}
}
class Manager extends Employee
{	
	
	
	void abc(String n,int e,double s)
	{
		super(name,empid,salary);
	//char departname=Btech;
	System.out.println("department name");
	}
}
class emp
{
	public static void main(String args[])
	{
	Manager in=new Manager();
	in.details();
	in.name1();
	in.salary1();
	in.increment();
	in.abc();
	}
}
