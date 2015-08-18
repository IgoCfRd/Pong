package me.theloner.play;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Border {
	public static final int top[] = {0, 0, 500, 10};
	public static final int upper_left[] = {0, 0, 10, 160};
	public static final int upper_right[] = {0, 310, 10, 160};
	public static final int bottom[] = {0, 452, 500, 10};
	public static final int lower_left[] = {474, 310, 10, 160};
	public static final int lower_right[] = {474, 0, 10, 160};
	public static final int left_scoringField[] = {-10,160,10,150};
	public static final int right_scoringField[] = {484,160,10,150};
	
	public void draw(Graphics2D g2D){
		g2D.setColor(Color.orange);
		g2D.fillRect(top[0], top[1], top[2], top[3]);
		g2D.fillRect(upper_left[0], upper_left[1], upper_left[2], upper_left[3]);
		g2D.fillRect(upper_right[0], upper_right[1], upper_right[2], upper_right[3]);
		g2D.fillRect(bottom[0], bottom[1], bottom[2], bottom[3]);
		g2D.fillRect(lower_left[0], lower_left[1], lower_left[2], lower_left[3]);
		g2D.fillRect(lower_right[0], lower_right[1], lower_right[2], lower_right[3]);
	}
	public Rectangle getTopBound(){
		return new Rectangle(top[0], top[1], top[2], top[3]);
	}
	public Rectangle getUpperLeftBound(){
		return new Rectangle(upper_left[0], upper_left[1], upper_left[2], upper_left[3]);
	}
	public Rectangle getUpperRightBound(){
		return new Rectangle(upper_right[0], upper_right[1], upper_right[2], upper_right[3]);
	}
	public Rectangle getBottomBound(){
		return new Rectangle(bottom[0], bottom[1], bottom[2], bottom[3]);
	}
	public Rectangle getLowerLeftBound(){
		return new Rectangle(lower_left[0], lower_left[1], lower_left[2], lower_left[3]);
	}
	public Rectangle getLowerRightBound(){
		return new Rectangle(lower_right[0], lower_right[1], lower_right[2], lower_right[3]);
	}
	public Rectangle getLeftScoringField(){
		return new Rectangle(left_scoringField[0], left_scoringField[1], left_scoringField[2], left_scoringField[3]);
	}
	public Rectangle getRightScoringField(){
		return new Rectangle(right_scoringField[0], right_scoringField[1], right_scoringField[2], right_scoringField[3]);
	}
}

