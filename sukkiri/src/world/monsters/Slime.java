package world.monsters;

import world.characters.Hero;

public class Slime extends Monster {
	public void run() {
		System.out.println("スライムは、体をうねらせて逃げ出した。");
	}
	public void attack(Hero h) {}
}
