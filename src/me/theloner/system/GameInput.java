package me.theloner.system;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameInput implements KeyListener{
	private Game game;
	public GameInput(Game game){
		this.game = game;
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int p = e.getKeyCode();
		if(!game.scene.isStop && p == KeyEvent.VK_P){
			game.scene.pauseGame();
		}
		if(game.scene.isStop && p == KeyEvent.VK_ENTER){
			game.scene.startGame();
		}
		
		if(!game.scene.isStop){
			if(p == KeyEvent.VK_W){
				game.player1.speed = -5;
			}
			else if(p == KeyEvent.VK_S){
				game.player1.speed = 5;
			}
			else if(p == KeyEvent.VK_UP){
				game.player2.speed = -5;
			}
			else if(p == KeyEvent.VK_DOWN){
				game.player2.speed = 5;
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		int p = e.getKeyCode();
		if(p == KeyEvent.VK_W || p == KeyEvent.VK_S){
			game.player1.speed = 0;
		}
		if(p == KeyEvent.VK_UP || p == KeyEvent.VK_DOWN){
			game.player2.speed = 0;
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}
}

