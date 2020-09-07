/*	Write a program in Java to create a Player class. Inherit the classes  Cricket _Player, Football _Player and Hockey_ Player from Player class. 
*/

class Player
{
	public void code()
	{
	System.out.println("HEllo");
	}
}
class Cricket_Player extends Player
{	
	void java()
	{
	System.out.println("Virat");
	}
}
class Football_Player extends Player
{
	void java()
	{
	System.out.println("Messi");
	}
}
class Hockey_player extends Player
{
	void java()
	{
	System.out.println("Shubh");
	}
}
class Test
{
	public static void main(String args[])
	{
		Player p=new Player();
		Cricket_Player in=new Cricket_Player();
		Football_Player f=new Football_Player();
		Hockey_player h=new Hockey_player();
		p.code();
		in.java();
		f.java();
		h.java();
	}
}
