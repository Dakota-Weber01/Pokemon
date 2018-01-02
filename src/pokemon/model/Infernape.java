package pokemon.model;

public class Infernape extends Pokemon implements Fire, Fighting
{
	public Infernape(String name)
	{
		super(387, "Infernape");
		setup();
	}
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
	protected void setup()
	{
		super.setup();
		this.setAttackPoints(234);
		this.setCanEvolve(true);
		this.setEnhancementModifer(.89);
		this.setHealthPoints(123);
	}
}
