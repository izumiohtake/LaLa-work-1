package chap12;

import world.characters.Character;
import world.characters.Hero;
import world.characters.Thief;
import world.characters.Wizard;

public class Main04 {

	public static void main(String[] args) {
		Character[] c = new Character[5];
		c[0] = new Hero();
		c[1] = new Hero();
		c[2] = new Thief();
		c[3] = new Wizard();
		c[4] = new Wizard();
		
		for (Character ch : c) {
			ch.setHp(ch.getHp() + 50);
			System.out.println(ch.getName() + ":" + ch.getHp());
		}
	}

}
