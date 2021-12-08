package chap12;

import world.monsters.DeathBat;
import world.monsters.Goblin;
import world.monsters.Monster;
import world.monsters.Slime;

public class Main05 {

	public static void main(String[] args) {
		Monster[] monsters = new Monster[3];
		monsters[0] = new Slime();
		monsters[1] = new Goblin();
		monsters[2] = new DeathBat();
		
		for (Monster m : monsters) {
			m.run();
		}
	}

}
