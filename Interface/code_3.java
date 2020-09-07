/*	Write a program in Java to show the usefulness of Interfaces as a place to keep constant value of the program
*/


class Testint1 implements Test1
{
	int a=200;
	public void input()
		{
			System.out.println("areas of");
			System.out.println(a);
		}
	public void area()
	{
		int square =a*a;
		int cube=a*a*a;
		int peri_square=2*(a+a);
		System.out.println("area of square,cube,peri_square" +square+" "+cube+" "+peri_square);
	}
	public static void main(String args[])
		{
			Testint1 in=new Testint1();
			in.input();
			in.area();
		}
}