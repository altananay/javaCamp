package Entities;


public class Campaign {

	private int campaignId;
	private String campaignName;
	private double campaignDiscount;
	
	public Campaign() {}

	public Campaign(int campaignId, String campaignName) {
		this.campaignId = campaignId;
		this.campaignName = campaignName;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public double getCampaignDiscount() {
		return campaignDiscount;
	}
	
	//Oyuncunun oynayýþ süresi 100 saatin üzerindeyse kampanyadan yararlanabilir. Deðilse yararlanamaz.
	public void setCampaignDiscount(Player player)
	{
		if (player.getPlayTime() >= 100)
		{
			System.out.println(player.getFirstName() + " " + player.getLastName()  +  " Kampanyadan yararlanabilir. %10 indirim");
			this.campaignDiscount = 0.10;
		}
		else
		{
			System.out.println(player.getFirstName() + " " + player.getLastName() + " Kampanyadan yararlanamaz.");
			this.campaignDiscount = 0;
		}
	}
	
	
}
