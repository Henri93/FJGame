package com.henrygarant.GameLogic;

public class Branch {
	
	private Choice choice;
	private String startID;
	private String endID;
	private String story;
	
	public Branch(String startID, String endID) {
		this.startID = startID;
		this.endID = endID;
		story = getStory();
	}

	public String getStory() {
		String s = "This is a branch story for " + startID;
		return s;
	}

	private Choice getChoice() {
		return choice;
	}
	
	public void addChoice(){
		choice = new Choice(endID);
	}
	
	public void displayChoice(){
		addChoice();
		choice.populate(2);
		for(Branch b : choice.getBranches()){
			System.out.println("Branch: " + b.endID);
		}
	}

}
