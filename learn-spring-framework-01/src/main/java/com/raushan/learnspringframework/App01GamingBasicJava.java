package com.raushan.learnspringframework;

import com.raushan.learnspringframework.game.GameRunner;
import com.raushan.learnspringframework.game.MarioGame;
import com.raushan.learnspringframework.game.PacManGame;
import com.raushan.learnspringframework.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		var game = new MarioGame();
//		var game = new SuperContraGame();
		var game = new PacManGame();
		
		var gameRunner = new GameRunner(game);
		gameRunner.run();
	}

}
