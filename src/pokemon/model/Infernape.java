package pokemon.model;

public abstract class Infernape extends Pokemon implements Fire, Fighting
{
	public Infernape(int number, String name)
	{
		super(number, name);
	}
	public void flameWheel()
	{
 System.out.print("Infernape used Flame Wheel!");
	}
	public String searingShot()
	{
		return "Infernape used Searing Shot!";
	}
	public void ember()
	{
  System.out.print("Infernape used Ember!");
	}
	public void machPunch()
	{
		System.out.print("Infernape used Mach Punch!");
	}
}
