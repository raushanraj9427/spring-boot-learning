package com.raushan.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.raushan.learnspringframework.game.GameRunner;
import com.raushan.learnspringframework.game.GamingConsole;
import com.raushan.learnspringframework.game.PacManGame;

@Configuration
public class GamingConfiguration {
	@Bean
	public GamingConsole game() {
		var game = new PacManGame();
		return game;
	}
	
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		return new GameRunner(game);
	}
}
