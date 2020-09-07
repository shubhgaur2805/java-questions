/* Write a program to create an Interface having two methods division and modules. Create a class, which overrides these methods.
*/

interface Divison
{
void div();
	void modules();
}
class Myclass1 implements Divison
{
	int a=5,b=200;
	public void div()
	{
		int s=b/a;
		System.out.println("division" +s);
	}	
	public void modules()
	{
		if(b%2==0)
		{
		System.out.println("modules is done");
		}
	}
	public static void main(String args[])
	{
		Myclass1 in=new Myclass1();
		in.div();
		in.modules();
	}
}
 


