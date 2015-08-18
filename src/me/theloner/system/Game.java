package me.theloner.system;
import me.theloner.play.*;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Game {
	public static Game game;
	
	public Player player1;
	public Player player2;
	public GameInput input;
	public Ball ball;
	public Border border;
	public Scene scene;
	public GameLoop loop;
	
	private JFrame window;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Game();
	}
	public Game(){
		window = new JFrame("Pong Game");
		
		player1 = new Player( 30, 200, 10, 60);
		player2 = new Player(440, 200, 10, 60);
		input = new GameInput(this);
		border = new Border();
		ball = new Ball(30, 90, 15, 15,this);
		scene = new Scene(this);
		loop = new GameLoop(scene);
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setPreferredSize(new Dimension(500,500));
		window.addKeyListener(input);
		window.add(scene);
		window.pack();
		window.setVisible(true);
	}
}