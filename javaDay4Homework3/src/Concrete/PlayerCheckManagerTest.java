package Concrete;

import Abstract.PlayerCheckService;
import Entities.Player;

public class PlayerCheckManagerTest implements PlayerCheckService{

	@Override
	public boolean CheckIfRealPerson(Player player) throws Exception {
		return true;
	}

	
	
}
