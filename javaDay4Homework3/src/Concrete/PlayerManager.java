package Concrete;

import Abstract.BasePlayerManager;
import Abstract.PlayerCheckService;
import Entities.Player;

public class PlayerManager extends BasePlayerManager implements PlayerCheckService {

	private PlayerCheckService playerCheckService;
	
	public PlayerManager(PlayerCheckService playerCheckService)
	{
		this.playerCheckService = playerCheckService;
	}
	
	//Oyuncu veri taban�na kay�t edilirse program devam edecek edilemezse program sonlanacak.
	public void Save(Player player)
	{
		try
		{
			if (this.playerCheckService.CheckIfRealPerson(player))
			{
				super.Save(player);
			}
			else
			{
				System.out.println("Hatal� oyuncu bilgisi. Veri taban�na kay�t edilemedi�i i�in program sonlan�yor...");
				System.exit(0);
			}
		}
		catch (Exception exception)
		{
			System.out.println("hata");
		}
		
	}
	
}
