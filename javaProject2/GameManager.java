package javaProject2;

public class GameManager{
	
	private Game game;
	

	public GameManager(Game game) {
		this.game = game;
	}

	public void add() {
		System.out.println("Enes Aras " + this.game.getName() + " oyununu satýn aldý");
	}
	
}
