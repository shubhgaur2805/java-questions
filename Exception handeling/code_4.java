/*	On a single track two vehicles are running. As vehicles are going in same direction there is no problem. If the vehicles are running in different direction there is a chance of collision. To avoid collisions write a Java program using exception handling. You are free to make necessary assumptions.
*/

import java.util.*;
class Exception4
{
	public static void main(String args[])
		{
			Scanner in=new Scanner(System.in);
			System.out.println("Enter the direction left and right ");
			try
			{
				System.out.println("track A direction");
				String a=in.next();
				System.out.println("Track b direction");
				String b=in.next();
				if(a=="left" && b=="right")
				{
					throw new collidexcep();
				}
				else
				{
					System.out.println("fine");
				}
			}
			catch(collidexcep e)
			{
				System.out.println(e);
			}
			finally
			{
				System.out.println("Everything under control by exception");
			}
		}
}	
class collidexcep extends Exception4 
{
	collidexcep()
	{
		super("Vehicle collided");
	}
}
