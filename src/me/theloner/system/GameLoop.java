package me.theloner.system;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class GameLoop implements ActionListener{
	public Scene scene;
	public Timer timer;
	public GameLoop(Scene scene){
		this.scene = scene;
		
		timer = new Timer(20,this);
		timer.start();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		scene.repaint();
	}
}
