package Abstract;

import Entities.Player;

public class BasePlayerManager implements PlayerCheckService, PlayerService{

	public boolean CheckIfRealPerson(Player player) throws Exception
	{ 
		throw new Exception();
	}
	
	public void Save(Player player)
	{
		System.out.println("Saved to database: " + player.getFirstName() + " " + player.getLastName());
	}
	
	public void Delete(Player player)
	{
		System.out.println("Deleted to database: " + player.getFirstName() + " " + player.getLastName());
	}
	
	public void Update(Player player)
	{
		System.out.println("Updated to database: " + player.getFirstName() + " " + player.getLastName());
	}
	
	
}
