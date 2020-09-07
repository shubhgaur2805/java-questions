/* Write a program to accept 10 student’s marks in an array, arrange it into ascending order, convert into the following grades and print marks and grades in the tabular form. 

    Between 40 and 50 : PASS 
	Between 51 and 75 : MERIT 
 	and above : DISTINCTION
*/	
	
	Code:-
import java.util.*;
class Grade
{
	public static void main(String args[])
	{
	System.out.println("Students Grades");
	Scanner in=new Scanner(System.in);
	{
		//System.out.println("Enter the Student name");
		//String b=in.next();
		System.out.println("number of Students");
		int a=in.nextInt();
		System.out.println("Enter the Student Marks");
		int [] arr = new int[a];
		for(int i=0;i<a;i++)
		{
			arr[i]=in.nextInt();
		//System.out.println(Arrays.toString(arr));
		if(arr[i]<40)
		{
			System.out.println("fail");
		}
		else if(arr[i]>=40 && arr[i]<=50)
		{
			System.out.println("pass");
		}
		else if(arr[i]>=51 && arr[i]<=75)
		{
			System.out.println("Merit");
		}
		else 
		{
			System.out.println("Topper");
		}
		}
	}
	}
}
