package chap09;

import world.characters.Hero;
import world.characters.Sword;
import world.monsters.Matango;

public class Main02 {

	public static void main(String[] args) {
		Sword s = new Sword();
		s.setName("炎の剣");
		s.setDamage(10);
		Hero h = new Hero();
		h.setName("ミナト");
		h.setHp(100);
		h.setSword(s);
		System.out.println("私の名前は" + h.getName());
		System.out.println("現在の武器は" + h.getSword().getName());
		// h.attack();
		Matango m = new Matango();
		m.setSuffix('Z');
		h.attack(m);
	}

}
