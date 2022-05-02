package com.in7k.learnspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnSpringApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringApplication.class, args);

		// you don't need to manually construct the gamerunner, instead
		// we use the getBean method on the context
		GameRunner runner = context.getBean(GameRunner.class);

		runner.runGame();
	}

}
