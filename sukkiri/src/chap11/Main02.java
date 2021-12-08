package chap11;

import world.characters.Hero;
import world.monsters.DeathBat;
import world.monsters.Goblin;
import world.monsters.WereWolf;

public class Main02 {

	public static void main(String[] args) {
		
		Hero h = new Hero();
		Goblin g = new Goblin();
		g.attack(h);
		g.run();
		
		WereWolf w = new WereWolf();
		w.attack(h);
		w.run();
		
		DeathBat d = new DeathBat();
		d.attack(h);
		d.run();
	}

}
