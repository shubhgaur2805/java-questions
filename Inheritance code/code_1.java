
/*	Write a Java program to show that private member of a super class cannot be accessed from derived classes.*/

class Parent
{
	private void name()
		{
			System.out.println("Shubh is here");
		}
	public void display()
		{
			System.out.println("Hello");
		}
}
class Derive extends Parent
{
	public static void main(String args[])
	{
		Parent in=new Parent();
		in.display();
		in.name();
	}
}
