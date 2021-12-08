package chap12;

import world.monsters.Monster;
import world.monsters.Slime;

public class Main02 {

	public static void main(String[] args) {
		Slime s = new Slime();
		Monster m = new Slime();
		s.run();
		m.run();
	}

}
