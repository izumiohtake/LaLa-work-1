package chap12;

import world.characters.Character;
import world.characters.Wizard;
import world.monsters.Matango;

public class Main {

	public static void main(String[] args) {
		Character c = new Wizard();
		Wizard w = (Wizard) c;
		Matango m = new Matango();		
		c.setName("アサカ");
		c.attack(m);
		// c.fireball(m);
	}

}
