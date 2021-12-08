package world.characters;

import world.monsters.Monster;

public class SuperHero extends Hero {
	private boolean flying;
	
	public SuperHero() {
		System.out.println("SuperHeroのコンストラクタが動作");
	}
	
	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった！");
	}
	
	public void land() {
		this.flying = false;
		System.out.println("着地した！");
	}
	
	public void run() {
		System.out.println(this.getName() + "は撤退した");
	}
	
	public void attack(Monster m) {
		super.attack(m);
		if (this.flying) {
			super.attack(m);
		}
	}

	public boolean isFlying() {
		return flying;
	}

	public void setFlying(boolean flying) {
		this.flying = flying;
	}
	
}
