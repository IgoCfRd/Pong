package me.theloner.system;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.Random;

import javax.swing.JPanel;

public class Scene extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Game game;
	public boolean isStop;
	
	public Scene(Game game){
		this.game = game;
		
		this.setSize(new Dimension(500,500));
	}
	
	public void update(Graphics g){
		paint(g);
	}
	
	public void paint(Graphics g){
		Graphics2D g2D = (Graphics2D) g;
		g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
		g2D.setColor(Color.gray);
		g2D.fillRect(0, 0, 500, 500);
		
		g2D.setFont(new Font(Font.DIALOG_INPUT,Font.BOLD,50)); 
		g2D.setColor(Color.lightGray);
		g2D.drawString(game.player1.score + " : " + game.player2.score, 150, 60);
		
		game.border.draw(g2D);
		game.ball.draw(g2D);
		game.player1.draw(g2D);
		game.player2.draw(g2D);
		
		if(isStop) {
			g2D.setFont(new Font(Font.DIALOG_INPUT,Font.BOLD,50)); 
			g2D.setColor(Color.blue);
			g2D.drawString("Pause Game", 95, 230);
		}
	}
	public void pauseGame(){
		game.ball.speed_x = 0;
		game.ball.speed_y = 0;
		game.player1.speed = 0;
		game.player2.speed = 0;
		
		this.isStop = true;
	}
	public void startGame(){
		this.isStop = false;
		game.ball.speed_x = 5;
		game.ball.speed_y = 5;
	}
	public void resetGame(){
		game.ball.x = 100 + new Random().nextInt(300);
		game.ball.y =  20 + new Random().nextInt(300);
	}
}

