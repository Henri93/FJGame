package com.henrygarant.GameLogic;

public class Root {
	
	private String gameTitle;
	private String gameIntro;
	
	public Root(){
		gameTitle = getGameTitle();
		gameIntro = getGameIntro();
	}

	public String getGameTitle() {
		String title = "Father Judge Survival Game";
		return title;
	}

	public String getGameIntro() {
		String intro = "You are a student of Father Judge High School.\n"
				+ "Today you go to school just like any other day.\n"
				+ "Everything seems ordinary, or does it?\n"
				+ "Today you will have to read, react, and fight your way through the day.\n"
				+ "To begin your quest please enter your name: ";
		return intro;				
	}
	
	public void test(){
		Branch b = new Branch("0", "1");
		System.out.println(b.getStory());
		b.displayChoice();
		Branch c = new Branch("1", "1.0");
		System.out.println(c.getStory());
		c.displayChoice();
	}

}
