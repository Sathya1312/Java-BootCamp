package com.cognizant.encapsulation;

public class Player {
	
	private String name;
	private int health = 100;;
	private String weapon;
	public Player(String name, int health, String weapon) {
		super();
		this.name = name;	
		if(health > 0 && health <=100){
		this.health = health;
		}
		this.weapon = weapon;
	}
	
	public void loseHealth(int damage){
		this.health = health - damage;	
		if(this.health <=0){
			System.out.println("Player knocked out");
			//Reduce number of lives remaining for the player
		}
	}
	
	public int getHealth(){
		return health;
	}

}
	