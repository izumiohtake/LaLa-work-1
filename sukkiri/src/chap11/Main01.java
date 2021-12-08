package chap11;

import world.characters.Dancer;
import world.monsters.Matango;

public class Main01 {

	public static void main(String[] args) {
		Matango m = new Matango();
		Dancer dancer = new Dancer("めぐみん");
		dancer.attack(m);
	}

}
