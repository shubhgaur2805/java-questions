/*	Write a program to crea interface A, in this interface we have two method meth1 and meth2. Implements this interface in another class named MyClass.
*/

interface A
{
	void meth1();
	void meth2();
}
class Myclass implements A
{
	public void meth1()
	{
		System.out.println("Hi");
	}	
	public void meth2()
	{
		System.out.println("Shubh,how are u");
	}
	public static void main(String args[])
	{
		Myclass in=new Myclass();
		in.meth1();
		in.meth2();
	}
}