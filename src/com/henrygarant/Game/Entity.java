package com.henrygarant.Game;

import java.util.Random;
import static java.lang.System.out;


public class Entity {
	
	private String name;
	private int health;
	private Weapon weapon;
	private int strength;
	
	private Styler styler = new Styler();
	
	
	public Entity(String name) {
		this.name = name;
		health = 100;
		strength = 5;
		weapon = new Weapon("hands", 5);
	}
	
	public int getHealth() {
		return health;
	}
	
	public String getName() {
		return name;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	public void setWeapon(Weapon weapon){
		this.weapon = weapon;
	}
	
	public Weapon getWeapon() {
		return weapon;
	}
	
	public void strikeEntity(Entity striker, Entity target){
		Random randomGenerator = new Random();
		int strikeDamage = (striker.getWeapon().getDamage() * randomGenerator.nextInt(strength) + 1);
		
		target.setHealth(target.getHealth() - strikeDamage);
		striker.getWeapon().setCondition(striker.getWeapon().getCondition() - strikeDamage);
		if(striker.deadCheck()){
			styler.printHLine();
			out.println(getName() + " strikes " + target.getName() + " with " + striker.getWeapon().getName() + ".");
			out.println(target.getName() + " loses " + strikeDamage + " health.");
			out.println(getName() + " health: " + getHealth());
			out.println(target.getName() + " is dead!");
			out.println(striker.getWeapon().getName() + " condition: " + striker.getWeapon().getCondition());
			styler.printHLine();
		}else{
			styler.printHLine();
			out.println(getName() + " strikes " + target.getName() + " with " + striker.getWeapon().getName() + ".");
			out.println(target.getName() + " loses " + strikeDamage + " health.");
			out.println(getName() + " health: " + getHealth());
			out.println(target.getName() + " health: " + target.getHealth());
			out.println(striker.getWeapon().getName() + " condition: " + striker.getWeapon().getCondition());
			styler.printHLine();
		}
	}
	
	public boolean deadCheck(){
		if(getHealth() <= 0){
			return true;
		}else{
			return false;
		}
	}

}
