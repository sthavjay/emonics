package SoccerApp;

public class Game {
	Team team1;
	Team team2;
	Goal[] goals;
	
	public Game(Team team1, Team team2) {
		super();
		this.team1 = team1;
		this.team2 = team2;
	}

	public void playGame(int maxgoals) {
	 maxgoals = 10; 
	 int numberOfGoals = (int) (Math.random()* maxgoals);
	 goals = new Goal[numberOfGoals];
	 for (int i =0; i<numberOfGoals; i++) {
		 if(Math.random()>0.5) {
		 goals[i].team = team1;
	 } else {
		 goals[i].team = team2;
	 	}
		 goals[i].player = assignPlayer(goals[i].team);
		 goals[i].time= (double) (Math.random()*90);
	}
	 
	}
	
	
	public Player assignPlayer(Team team) {
		int playerIndexNo= (int) (Math.random() * 3);
		return team.thePlayers[playerIndexNo];
	}
	
	public void printResult() {
		for (Goal g: goals) {
			System.out.println();
		}
	}
}
