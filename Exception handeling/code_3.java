/*	Create an exception class, which throws an exception if operand is nonnumeric in calculating modules. (Use command line arguments). 
*/

import java.util.*;
class Exception3
{
	public static void main(String args[])
		{
			Scanner in=new Scanner(System.in);
			System.out.println("Enter the emements");
			int a=in.nextInt();
			//System.out.println("Entered value");
			//int b=in.nextInt();
			if(a=='A')
			{
				System.out.println("hi");
			}
			else{
				throw new NumberFormatException();
			}
		}
}	