package me.theloner.play;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import me.theloner.system.Game;
public class Ball {
	private int w, h;
	public int x, y, speed_x = 5, speed_y = 5;
	
	private Game game;
	public Ball(int x, int y , int w , int h, Game game){
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		
		this.game = game;
	}
	public void draw(Graphics2D g2D){
		move();
		g2D.setColor(Color.pink);
		g2D.fillOval(x, y, w, h);
	}
	public void move(){
		if(!game.scene.isStop){
			if(collision()){
				if(speed_x < 0 && speed_y > 0){
					speed_x = 5;
				}else if(speed_x > 0 && speed_y > 0){
					speed_y = -5;
				}else if(speed_x > 0 && speed_y < 0){
					speed_x = -5;
				}else if(speed_x < 0 && speed_y < 0){
					speed_y = 5;
				}
			}
		}
		x += speed_x;
		y += speed_y;
	}
	public boolean collision(){
		if(game.player1.getBound().intersects(getBound()) || game.player2.getBound().intersects(getBound())){
			return true;
		}else if(game.border.getTopBound().intersects(getBound()) || game.border.getBottomBound().intersects(getBound())){
			return true;
		}else if(game.border.getUpperLeftBound().intersects(getBound()) || game.border.getLowerLeftBound().intersects(getBound())){
			return true;
		}else if(game.border.getUpperRightBound().intersects(getBound()) || game.border.getLowerRightBound().intersects(getBound())){
			return true;
		}else if(getBound().intersects(game.border.getLeftScoringField())){
			game.scene.resetGame();
			game.player2.score++;
		}else if(getBound().intersects(game.border.getRightScoringField())){
			game.scene.resetGame();
			game.player1.score++;
		}
		return false;
	}
	public Rectangle getBound(){
		return new Rectangle(x, y, w, h);
	}
}
