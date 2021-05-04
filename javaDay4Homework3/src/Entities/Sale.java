package Entities;

public class Sale {

	private int saleId;
	private String saleName;
	private double salePrice;
	private double newPrice;
	
	public Sale() {}

	public Sale(int saleId, String saleName, double salePrice) {
		this.saleId = saleId;
		this.saleName = saleName;
		this.salePrice = salePrice;
	}

	public int getSaleId() {
		return saleId;
	}

	public void setSaleId(int saleId) {
		this.saleId = saleId;
	}

	public String getSaleName() {
		return saleName;
	}

	public void setSaleName(String saleName) {
		this.saleName = saleName;
	}

	public double getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}
	
	public double getNewPrice()
	{
		return newPrice;
	}
	
	public void setNewPrice(Campaign campaign)
	{
		newPrice = salePrice - (campaign.getCampaignDiscount() * salePrice);
	}
	

	
	
	
}
