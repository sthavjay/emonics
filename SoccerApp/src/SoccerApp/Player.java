package SoccerApp;

public class Player {
	String playerName;
	
	public Player(String name) {
		this.playerName=name;
	}

	public String getPlayerName() {
		return playerName;
	}
	
	public void setPlayerName(String playerName) {
	this.playerName = playerName;
	}
	
	public void display() {
		System.out.println(this.playerName);
	}
} 