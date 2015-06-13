package com.henrygarant.Game;

public class Weapon {
	
	private int damage;
	private int condition;
	private String name;

	public Weapon(String name, int damage) {
		this.name = name;
		this.damage = damage;
		condition = 100;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getCondition() {
		return condition;
	}

	public void setCondition(int condition) {
		this.condition = condition;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
