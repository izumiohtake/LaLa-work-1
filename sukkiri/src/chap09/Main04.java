package chap09;

import world.characters.Hero;
import world.monsters.Matango;

public class Main04 {

	public static void main(String[] args) {
		Matango m = new Matango();
		m.setSuffix('A');
		
		Hero h = new Hero("タロウ");
		// h.takeWeapon();
		
		m.attack(h);
		h.attack(m);
		h.status();
		m.status();

	}

}
