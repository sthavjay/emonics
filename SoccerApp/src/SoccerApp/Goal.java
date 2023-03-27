package SoccerApp;

public class Goal {
	Team team;
	Player player;
	double time;
	
	public String getDetails() {
		return "goal is hit by " + player.playerName + "from"+ team.teamName + "at"+ time;
	}

}
