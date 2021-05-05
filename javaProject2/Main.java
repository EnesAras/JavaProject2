package javaProject2;

public class Main {
	public static void main(String[] args) {
		Customer customer = new Customer(1,"Enes","Aras","20.05.1998","sjjsshh@hshhs","51215515");
		customer.getFirstName();
		
		CustomerManager customerManager = new CustomerManager(customer);
		customerManager.add();
		customerManager.delete();
		customerManager.update();
		
		Game game = new Game(1,"Pubg",50);
		game.getName();	
		
		GameManager gameManager = new GameManager(game);
		gameManager.add();
		
		
		Campaign campaign = new Campaign(2,"A",5);
		campaign.getName();
		
		CampaignManager campaignManager = new CampaignManager(campaign);
		campaignManager.add();
		campaignManager.delete();
		campaignManager.update();
		
	}
	
}
