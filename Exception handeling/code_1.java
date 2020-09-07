/* Write a program in Java to display the names and roll numbers of students. Initialize respective array variables for 10 students. Handle ArrayIndexOutOfBoundsExeption, so that any such problem doesn’t cause illegal termination of program. 
*/

import java.util.*;
class Exception1
{
	public static void main(String args[])
		{
			String name[]=new String[10];
			int rollno[] =new int[10]; 
			Scanner in=new Scanner(System.in);
			System.out.println("Enter the emements");
			int a=in.nextInt();
			try
			{
			for(int i=0;i<a;i++)
			{
				
				System.out.println("Rollno");
				rollno[i]=in.nextInt();
				System.out.println("name");
				name[i]=in.next();
			}
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
			finally
			{
				System.out.println("Everything under control by exception");
			}
		}
}	
 
