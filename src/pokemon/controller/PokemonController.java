package pokemon.controller;


import pokemon.model.*;

import java.util.List;
import java.util.ArrayList;
public class PokemonController
{
private List<Pokemon> pokedex;
public void start()
	{
	
	}
public List<Pokemon> getPokeDex()
{
	return pokedex;
}
public boolean isValidInteger(String input)
{
	return false;
}

public boolean isValidDouble(String input)
{
return false;
}
public String [] convertPokedex()
{
	String [] names = new String [pokedex.size()];
	for (int index =0; index < pokedex.size(); index++)
	{
		names[index] = pokedex.get(index).getName();
	}
	return names;
	}

}

