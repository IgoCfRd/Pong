package me.theloner.system;


public class ScoreManager {
	private Game game;
	public ScoreManager(Game game){
		this.game = game;
	}
	public void addPoints(){
		if(game.ball.getBound().intersects(game.border.getLeftScoringField())){
			game.player2.score++;
		}else if(game.ball.getBound().intersects(game.border.getLeftScoringField())){
			game.player1.score++;
		}
	}
}

