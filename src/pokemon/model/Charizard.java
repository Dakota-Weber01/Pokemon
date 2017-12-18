package pokemon.model;

public abstract class Charizard extends Pokemon implements Flying, Fire
{
public Charizard(int number, String name)
	{
		super(number, name);
	}
public void inferno()
	{
	System.out.print("Charizard used Inferno!");
	}
public String wingAttack()
	{
	return "Charizard used Wing Attack!";
	}
public void flameThrower()
	{
	System.out.print("Charizard used Flame Thrower!");
	}
public String fireSpin()
	{
	return "Charizard used Fire Spin!";
	}
}
