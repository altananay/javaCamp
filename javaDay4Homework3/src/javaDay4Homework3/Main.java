package javaDay4Homework3;

import java.util.GregorianCalendar;

import Abstract.BaseCampaignManager;
import Abstract.BasePlayerManager;
import Abstract.BaseSaleManager;
import Adapters.MernisServiceAdapter;
import Concrete.PlayerManager;
import Entities.Campaign;
import Entities.Player;
import Entities.Sale;

public class Main {

	public static void main(String[] args) {
		Player altanPlayer = new Player();
		altanPlayer.setPlayerId(1);
		altanPlayer.setFirstName("ALTAN");
		altanPlayer.setLastName("ANAY");
		altanPlayer.setNationalityId("11111111111");
		altanPlayer.setDateOfBirth(new GregorianCalendar(1555,5,5).getTime());
		altanPlayer.setPlayTime(105);
		BasePlayerManager playerManager = new PlayerManager(new MernisServiceAdapter());
		playerManager.Save(altanPlayer);
		Sale sale = new Sale();
		sale.setSaleId(1);
		sale.setSaleName("Game");
		sale.setSalePrice(100);
		Campaign campaign = new Campaign();
		campaign.setCampaignId(1);
		campaign.setCampaignName("discount");
		campaign.setCampaignDiscount(altanPlayer);
		BaseCampaignManager campaignManager = new BaseCampaignManager();
		campaignManager.Save(campaign);
		campaignManager.Update(campaign);
		campaignManager.Delete(campaign);
		sale.setNewPrice(campaign);
		System.out.println("Yeni fiyat: " + sale.getNewPrice());
		BaseSaleManager saleManager = new BaseSaleManager();
		saleManager.Sale(altanPlayer);
		playerManager.Update(altanPlayer);
		playerManager.Delete(altanPlayer);
	}

}
