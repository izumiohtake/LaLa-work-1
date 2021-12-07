package chap12;

import world.Character;
import world.Matango;
import world.Wizard;

public class Main {

	public static void main(String[] args) {
		Wizard w = new Wizard();
		//Wizard w = (Wizard) c;
		Character c = w;
		Matango m = new Matango();		
		c.name = "アサカ";
		c.attack(m);
		c.fireball(m);
	}

}
