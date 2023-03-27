package SoccerApp;

public class League {

	public static void main(String[] args) {
		
		Team t1 = new Team();
		t1.teamName = "psg";
		t1.thePlayers[0]= new Player("Messi");
		t1.thePlayers[1]= new Player("Mbappe");
		t1.thePlayers[2]= new Player("Neymar");
		
		Team t2 = new Team();
		t2.teamName = "manc";
		t2.thePlayers[0] = new Player("Halland");
		t1.thePlayers[1]= new Player("Kevin");
		t1.thePlayers[2]= new Player("Aguero");
		
		Game game = new Game();
		game.playGame(10);
		
//		Player p1 = new Player("Messi");
//		Player p2 = new Player("Ronaldo");
//		Player p3 = new Player("Zlatan");
//		p1.display();
//		p2.display();
//		
//		Team t1 = new Team ("Barca");
//		Team t2 = new Team ("Real");
		
	}
	
	

}
