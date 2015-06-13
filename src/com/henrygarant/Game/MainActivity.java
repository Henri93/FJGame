package com.henrygarant.Game;

import static java.lang.System.out;

import java.util.Scanner;

import com.henrygarant.GameLogic.Root;

public class MainActivity {
		
	public static void main(String[] args) {
		
		//TODO cleanup
		//need a way to allow 1 styler instance 
		//to be used throughout the whole program.
		
		Scanner userInput = new Scanner(System.in);
		Styler styler = new Styler();
		Root root = new Root();
		
		root.test();
		/*introduction(styler, root);				
		Player player = new Player(userInput.next());
		userInput.close();
		
		styler.printHLine();
		beginStory(styler, player);
		
		Enemy snake = new Enemy("Snake");
		
		player.strikeEntity(player, snake);*/
	}

	private static void beginStory(Styler s, Entity player) {
		out.println("Welcome " + player.getName());		
	}

	private static void introduction(Styler s, Root root) {
		out.println(root.getGameTitle());
		s.printHLine();
		out.println(root.getGameIntro());
	}
}
