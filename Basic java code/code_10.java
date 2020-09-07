/*	Write a program to find the sum of all integers greater than 40 and less than 250 that are divisible by 5.*/

class Sum
{
	public static void main(String args[])
	{
	int sum=0;
	for (int i=40; i<251; i++)
		{
			if(i%5==0)
			{
				System.out.println("it also"+i);
				sum=sum + i;
				System.out.println("Then add      "+sum);
			}
		}
	}
}
