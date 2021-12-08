package chap10;

import world.characters.Hero;
import world.monsters.PoisonMatango;

public class Main03 {

	public static void main(String[] args) {
		Hero h = new Hero("紋次郎");
		PoisonMatango pm = new PoisonMatango('A');
		pm.attack(h);
		pm.attack(h);
		pm.attack(h);
		pm.attack(h);
		pm.attack(h);
		pm.attack(h);
		h.status();
	}

}
