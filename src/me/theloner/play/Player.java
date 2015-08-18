package me.theloner.play;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Player {
	public int speed, score = 0;
	private int x, y, w, h;
	public Player(int x, int y, int w, int h){
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}
	public void draw(Graphics2D g2D){
		move();
		g2D.setColor(Color.darkGray);
		g2D.fillRect(x, y, w, h);
	}
	private void move(){
		y += speed;
	}
	public Rectangle getBound(){
		return new Rectangle(x, y, w, h);
	}
}

