/* Write a program to create interface named test. In this interface the member function is square. Implement this interface in arithmetic class. Create one new class called ToTestInt. In this class use the object of arithmetic class.
*/

interface Test
{
	void input();
	void area();
}
class Testint implements Test
{
	int a=200;
	public void input()
		{
			System.out.println("Square of number");
			System.out.println(a);
		}
	public void area()
	{
		int square=a*a;
		System.out.println(square);
	}
	public static void main(String args[])
		{
			Testint in=new Testint();
			in.input();
			in.area();
		}
}
 