package com.henrygarant.GameLogic;

import java.util.ArrayList;

public class Choice {
	
	private ArrayList<Branch> branches;
	private String id;
	
	public Choice(String id) {
		this.id = id;
		branches = new ArrayList<Branch>();
	}
	
	public void populate(int numberOfBranches){
		for(int i = 0; i < numberOfBranches; i++){
			Branch branch = new Branch(id, id + "." + i);
			branches.add(branch);
		}
	}
	
	public ArrayList<Branch> getBranches() {
		return branches;
	}
	
	public String getId() {
		return id;
	}

}
