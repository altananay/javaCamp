package Abstract;

import Entities.Player;

public class BaseSaleManager implements SaleService {

	public void Sale(Player player)
	{
		System.out.println("Saled to: " + player.getFirstName() + " " + player.getLastName());
	}
	
}
