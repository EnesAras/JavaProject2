package javaProject2;

public class CampaignManager{
	
	private Campaign campaign;
	
	public CampaignManager(Campaign campaign) {
		this.campaign = campaign;
	}
	

	public void add() {
		System.out.println("Kapmanya Eklendi : " + this.campaign.getName());
	}
	public void delete() {
		System.out.println("Kampanya  Silindi : " + this.campaign.getName());
	}
	public void update() {
		System.out.println("Kampanya Güncellendi : " + this.campaign.getName());
	}
}
