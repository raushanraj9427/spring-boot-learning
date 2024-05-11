package com.raushan.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.raushan.learnspringframework.game.GameRunner;
import com.raushan.learnspringframework.game.GamingConsole;
import com.raushan.learnspringframework.game.MarioGame;
import com.raushan.learnspringframework.game.PacManGame;
import com.raushan.learnspringframework.game.SuperContraGame;

public class App03GamingSpringBeans {

	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
			context.getBean(GamingConsole.class).up();
			
			context.getBean(GameRunner.class).run();
		}
		
	}

}
