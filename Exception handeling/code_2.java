/*	Write a Java program to enable the user to handle any chance of divide by zero exception. 
*/

class Exception2
{
	public static void main(String args[])
		{
			try
			{
				int a=5;
				int div;
				div=a/0;
				System.out.println(div);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			finally
			{
				System.out.println("Everything under control by exception");
			}
		}
}	