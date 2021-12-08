package chap13;

import world.characters.Hero;
import world.characters.King;

public class Main01 {

	public static void main(String[] args) {
		Hero h = new Hero();
		h.setName("猿飛佐助");
		King k = new King();
		k.talk(h);

	}

}
