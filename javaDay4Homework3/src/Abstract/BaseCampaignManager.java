package Abstract;

import Entities.Campaign;

public class BaseCampaignManager implements CampaignService{

	public void Save(Campaign campaign)
	{
		System.out.println("Saved to database: " + campaign.getCampaignName());
	}
	
	public void Update(Campaign campaign)
	{
		System.out.println("Updated to database: " + campaign.getCampaignName());
	}
	
	public void Delete(Campaign campaign)
	{
		System.out.println("Deleted to database: " + campaign.getCampaignName());
	}
	
}
